pipeline {
    agent any

    tools {
        maven 'maven'   // your Maven tool name in Jenkins
        jdk 'java-jdk'    // adjust to your configured JDK
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/your-username/your-repo.git'
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
    }

    post {
        success {
            echo '✅ Build successful and Jetty is running!'
        }
        failure {
            echo '❌ Build failed!'
        }
    }
}

