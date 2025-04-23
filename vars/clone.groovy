def call(String url, String branch){
  echo "This is cloning"
  git url: "${url}", branch: "${branch}"
  echo "Cloning code successful"
}
