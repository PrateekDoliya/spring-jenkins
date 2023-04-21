pipeline{
    agent any
    stages{
        stage("Sonar"){
            steps{
                echo "======== sonar ========"
                bat "mvn --version"
            }
        }
        stage("Build"){
            steps{
                echo "======== build ========"
            }
        }
        stage("Docker Image"){
            steps{
                echo "======== building docker imnage ========"
            }
        }
        stage("DockerHub"){
            steps{
                echo "======== pushing docker image to docker hub ========"
            }
        }
    }
    post{
        always{
            echo "========always========"
        }
        success{
            echo "========pipeline executed successfully ========"
        }
        failure{
            echo "========pipeline execution failed========"
        }
    }
}
