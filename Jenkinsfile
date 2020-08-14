 pipeline {
  environment {
    registry = "admin/10.191.196.156:8123"
    registryCredential = "dockerhub"
  }
  agent {

         label 'docker' }
  stages {
    stage('Cloning Git') {
      steps {
        git 'http://gitlabtest.test.kv.aval/jenkins/docker.git/'
      }
    }
    stage('Building image') {
      steps{
        script {
        dockerImage = sh 'docker build -t base_image:v$BUILD_NUMBER -f Dockerfile .'
        }
      }
    }
  }
}     
pipeline {
  environment {
    registry = "10.191.196.156:8123"
    registryCredential = "admin"
    dockerImage = ''
  }
  agent {

         label 'docker' }
  stages {
    stage('Cloning Git') {
      steps {
        git 'http://gitlabtest.test.kv.aval/jenkins/docker.git/'
      }
    }
     stage('Building image') {
      steps{
        script {
        dockerImage = docker.build("base-image:$BUILD_NUMBER")
        }
      }
    }
    stage('Deploy Image') {
      steps{
        script {
          docker.withRegistry( 'http://$registry', registryCredential ) {
            dockerImage.push()
          }
        }
      }
    }
    stage('Remove Unused docker image') {
      steps{
        sh 'docker rmi base-image:$BUILD_NUMBER'
      }
    }
  }
}
