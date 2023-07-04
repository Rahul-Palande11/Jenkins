def call(String Url, String branch) {
       
                              git url: "${Url}", branch: "${branch}"
                        echo "Clonning done"
      
}
