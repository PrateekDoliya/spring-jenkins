pipeline{
    agent any
    stages{
        stage("Sonar"){
            steps{
                echo "======== sonar ========"
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
                echo "======== ppuushing docker image to docker hub ========"
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
