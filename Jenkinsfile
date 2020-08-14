pipeline {

  master {

  stages {
    stage('Cloning Git') {
      steps {
        git 'https://github.com/onlyillusion/homework.git'
      }
    }
     stage('Building image') {
      steps{
        script {
        dockerImage = docker.build(" -t nginx .")
        }
      }
    }
    stage('Remove Unused docker image') {
      steps{
        sh 'docker rmi nginx'
      }
    }
  }
}
}
