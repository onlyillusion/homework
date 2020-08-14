pipelineJob('testpipeline-build') {
	description('Build test docker image and run him')
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
