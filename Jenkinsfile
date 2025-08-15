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
           stage('Run on Jetty') {
                   steps {
                       echo 'Starting Jetty server...'
                       sh 'mvn jetty:run & sleep 10'
                  }
                }


           stage('Archive Artifact') {
                    steps {
                        archiveArtifacts artifacts: 'target/*.war', fingerprint: true
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
