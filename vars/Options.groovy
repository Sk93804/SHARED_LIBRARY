def call(Map config){
 buildDiscarder(logRotator(numToKeepStr: "${config.buildNumToKeep}")) 
}