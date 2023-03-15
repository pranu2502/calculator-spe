pipeline {
    agent any
        environment{
            imageName=""
        }
        tools {
            maven "Maven"
        }

    stages {
        stage('git pull') {
            steps {
                git branch: 'main',
                    url: 'git@github.com:pranu2502/calculator-spe.git'
            }
        }

        stage('Create SnapShot') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Build Docker Image') {
            steps {
                script{
                    dockerImage = docker.build 'pranu2502/spe-mini-project'
                }

            }
        }


        stage('Push Docker Image') {
            steps {
                script{
                    docker.withRegistry('','docker'){
                        imageName.push()
                       }
                    }

            }
        }


    }
}
