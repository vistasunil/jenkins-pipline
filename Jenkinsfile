pipeline {
    agent {
        node {
            label 'master'
        }
    }
    stages {
        stage('SCM checkout') {
            steps {
                git "https://github.com/vistasunil/jenkins-pipline.git"
            }
        }
        stage('Build'){
            steps {
		sh "rm -rf comtest"
		sh "mkdir comtest"
		sh "cp -R src pom.xml comtest/"
		dir("comtest") {
	   		sh "mvn clean install"
		}
		dir("comtest/target") {
	   		sh "java -jar comtest-1.0-SNAPSHOT.jar"
       		}
	    }
    	}
    }
}
