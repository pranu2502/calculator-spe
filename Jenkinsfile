pipeline {
    agent any
    environment{
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
                    dockerImage = docker.build("pranu2502/spe-mini-project")
                }

            }
        }

        stage ('Push Docker Image to DockerHub') {
            withDockerRegistry([ credentialsId: "docker", url: "" ]) {
                    dockerImage.push()
                    }
        }

        stage('Run ansible for deployment') {
            steps {
                ansiblePlaybook colorized: true, disableHostKeyChecking: true, installation: 'Ansible', inventory: './inventory', playbook: 'playbook.yml'
            }
        }

    }
}
