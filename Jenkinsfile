pipeline {

 agent { master
  }

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

[ec2-user@ip-172-31-43-81 homework]$ vi tes
[ec2-user@ip-172-31-43-81 homework]$ cat tes
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
