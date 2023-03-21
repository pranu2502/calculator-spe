pipeline {
    agent any
    environment{
        registry = "pranu2502/spe-mini-project"
        registryCredential = credentials('docker')
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
                    dockerImage = docker.build registry + ':latest'
                }

            }
        }

        stage ('Push Docker Image to DockerHub') {
            steps {
                sh 'echo $registryCredential_PSW | sudo docker login -u $registryCredential_PSW --password-stdin'
                sh 'docker push pranu2502/spe-mini-project:latest'

            }
        }

        stage('Run ansible for deployment') {
            steps {
                ansiblePlaybook colorized: true, disableHostKeyChecking: true, installation: 'Ansible', inventory: './inventory', playbook: 'playbook.yml'
            }
        }

    }
}
