def call() {
      stages {
           stage('build') {
                 steps {
                       bat "javac Hello.java"
                       bat "java Hello"
                   echo "Building done"
                 }
           }
      }
}
