pipeline {
    agent any

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

        stage ('Build Docker Image') {
            steps {
                sh 'docker build -t pranu2502/spe-mini-project .'
            }
        }

        stage ('Push Docker Image to DockerHub') {
            steps {
                withDockerRegistry([ credentialsId: "docker", url: "" ]) {
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
