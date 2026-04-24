pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                bat 'docker build -t java-app .'
            }
        }
        stage('Run') {
            steps {
                bat 'docker run java-app'
            }
        }
    }
}
