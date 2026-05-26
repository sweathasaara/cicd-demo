pipeline {

    agent any

    stages {

        stage('Build') {
            steps {
                bat 'echo Building Application'
            }
        }

        stage('Docker Build') {
            steps {
                bat 'echo Creating Docker Image'
            }
        }

        stage('Deploy') {
            steps {
                bat 'echo Deploying Application'
            }
        }
    }
}