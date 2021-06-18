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
			sh "jXvfb :99 -ac -screen 0 1280x1024x24 &"
			sh "export DISPLAY=:99"
			sh "nice -n 10 x11vnc 2>&1 &"
	   		sh "java -jar comtest-1.0-SNAPSHOT.jar"
       		}
	    }
    	}
    }
}
