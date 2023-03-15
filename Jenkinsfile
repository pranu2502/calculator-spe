pipeline {
    agent any
    stages {
        stage('git pull') {
            steps {
                git branch: 'main'
                    url: 'https://github.com/pranu2502/calculator-spe'
            }
        }

        stage('Create SnapShot') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Build Docker Image') {
            steps {
            sh 'docker build -t latest .'
            }
        }

        stage('Tag Docker Image') {
            steps {
                sh 'docker tag latest pranu2502/spe-mini-project'
            }
        }

        stage('Push Docker Image') {
            steps {
                sh 'docker push pranu2502/spe-mini-project'
            }
        }


    }
}