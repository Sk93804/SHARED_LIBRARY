def call(Map buildNumToKeep){
    options { buildDiscarder(logRotator(numToKeepStr: "${buildNumToKeep}")) }
}