pipeline {
        agent any
        stages {
                stage('Build') {
                        steps {
                                 
                                bat '.\\build.sh'
                        }
                }
                stage('Test') {
                        steps {
                                 
                                bat '.\\test.sh'                          
                        }
                }
                stage('Deploy') {
                        steps {
                                
                                bat '.\\deploy.sh'                            
                        }
                }
        }        
}
