def call(String user, String projectName, String imageTag){
  sh "docker build -t ${user}/${projectName}:${imageTag} ."
}
