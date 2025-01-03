def call(Map buildNumToKeep){
 buildDiscarder(logRotator(numToKeepStr: "${buildNumToKeep}")) 
}