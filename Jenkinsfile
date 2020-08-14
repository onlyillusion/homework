pipeline {

  agent any

  stages {
    stage('Cloning Git') {
      steps {
        git 'https://github.com/onlyillusion/homework.git'
      }
    }
     stage('Building image') {
      steps{
        script {
        dockerImage = docker.build(" nginx -f Dockerfile ")
        }
      }
    }
    stage('Run docker images') {
      steps{
        sh 'docker run -e APP_ENV=Slavik -d -p 80:80 nginx'
      }
    }
  }
}
