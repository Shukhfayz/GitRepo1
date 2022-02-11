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
				git 'https://github.com/Shukhfayz/GitRepo1.git'
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
