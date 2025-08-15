pipeline {
    agent any

    tools {
        maven 'maven'  // Maven name from Jenkins Global Tool Configuration
        jdk 'java-jdk'         // JDK name from Jenkins Global Tool Configuration
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/KARTIKNAIK18/java-CI.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Archive Artifact') {
            steps {
                archiveArtifacts artifacts: 'target/*.war', fingerprint: true
            }
        }

        stage('Deploy to Tomcat') {
            when {
                expression { fileExists('target/hello-java-web-1.0-SNAPSHOT.war') }
            }
            steps {
                echo 'Deploying WAR to Tomcat...'
                // Example: Copy WAR to remote Tomcat server
                sh '''
                scp target/hello-java-web-1.0-SNAPSHOT.war user@your-tomcat-server:/opt/tomcat/webapps/
                '''
            }
        }
    }

    post {
        success {
            echo '✅ Build and packaging successful!'
        }
        failure {
            echo '❌ Build failed!'
        }
    }
}
