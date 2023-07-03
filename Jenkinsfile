pipeline {
        agent any
        stages {
                stage('Build') {
                        steps {
                                 bat 'chmod +x build.sh'
                                bat './build.sh
                        }
                }
                stage('Test') {
                        steps {
                                 bat 'chmod +x test.sh'
                                bat './test.sh                          
                        }
                }
                stage('Deploy') {
                        steps {
                                bat 'chmod +x deploy.sh'
                                bat './deploy.sh                            
                        }
                }
        }        
}
