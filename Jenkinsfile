pipeline {
    agent any
    environment{
        registry = "pranu2502/spe-mini-project"
        registryCredential = "docker"
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
                docker.build registry + ':latest'
            }
        }

        stage ('Push Docker Image to DockerHub') {
            steps {
                docker.withRegistry('', registryCredential) {
                    sh 'docker push pranu2502/spe-mini-project:latest'
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
