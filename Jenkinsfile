node {
        def app

        stage('Clone repository') {
          checkout([$class: 'GitSCM', branches: [[name: '*/master']],
          doGenerateSubmoduleConfigurations: false, extensions: [],
          submoduleCfg: [], userRemoteConfigs:
          url: 'https://github.com/onlyillusion/homework.git'])
        }

        stage('Build image') {
          app = docker.build("docker-image")
        }



        stage('Clean existing image') {
          sh "docker rmi docker-image"
        }
}
