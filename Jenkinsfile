node {
	stage ('SCM checkout'){
		git "https://github.com/vistasunil/jenkins-pipline.git"
		}
	stage ('Build'){
		sh "mkdir comtest"
		sh "cp pom.xml comtest/"
    	dir("comtest") {
	   sh "mvn clean install"
       }
       	dir("comtest/target") {
	   sh "java -jar comtest-1.0-SNAPSHOT.jar"
       }
		}
}
