pipeline {
    agent any
    tools {
        maven "Maven"
            }
    stages {
        stage('Initialize'){
            steps{
              echo "PATH = ${env.M2_HOME}\\bin;${env.PATH}"
              echo "M2_HOME = ${env.M2_HOME ?: '/opt/maven'}"
            }
        }
        stage('Build') {
            steps {
                dir("D:\\JavaCodingRepo\\git\\JavaCodeRepo\\PipelineJenkinsWithSCM") {
                bat 'mvn -B -DskipTests clean compile package exec:java'
                }
            }
         
        }
      stage('Test') {
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
    
    }
    }
