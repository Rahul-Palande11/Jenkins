def call(String Url, String branch) {
        stages {
                stage('clonning') {
                      steps {
                              git url: "${Url}", branch: "${branch}"
                        echo "Clonning done"
                      }
                }
        }
}
