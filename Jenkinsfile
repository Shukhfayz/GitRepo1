pipeline {
	agent any
	
	stages {
		stage ("Build") {
			
			steps {
		
				echo "Build is successful"
			}
		
		}
		stage ("Test") {
			
			steps {
				git branch: 'main', credentialsId: '837cd355-5cb3-46e7-9899-f20c83c8743b', url: 'https://github.com/Shukhfayz/GitRepo1.git'
				script {
					bat(/mvn clean test/)
				}
				step ([$class: 'Publisher', reportFileNamePattern: '**/testng-results.xml'])
				
			}
		
		}
		
		stage ("Deploy") {
			
			steps {
				
				echo "Deployment is successful"
				
			}
		
		}
	}
}
