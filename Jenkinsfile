pipeline {
    agent any
    environment {
        registry = "pranu2502/spe-mini-project"
        credentialID = "624ab6a4-8222-4fee-8761-f43cb0596456"
        dockerImage = ""
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

        stage ('Build Docker Image') {
            steps {
                script{
                    dockerImage = docker.build(registry + ":latest")
                }

            }
        }

        stage ('Push Docker Image to DockerHub') {
            steps{
                script{
                    docker.withRegistry('', credentialID) {
                        dockerImage.push()
                    }
                }
            }

        }

        stage('Run ansible for deployment') {
            steps {
                ansiblePlaybook colorized: true, disableHostKeyChecking: true, installation: 'Ansible', inventory: './inventory', playbook: 'playbook.yml'
            }
        }

    }
}
