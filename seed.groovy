pipelineJob('testpipeline-build') {
	description('Build test docker image, test and push it to local registry')
	definition {
    	cpsScm {
      	scm {
          git {
            branch('origin/master')
            remote {
              url('https://github.com/onlyillusion/homework.git/')
              
            }
          }
      	}
      	scriptPath('Jenkinsfile')
    	}
    }
}
