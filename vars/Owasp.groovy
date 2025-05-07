def call() {
    // Ensure Dependency-Check is run in the correct workspace directory
    dir('./jenkins/workspace/First_job') {
        sh 'dependency-check --scan . --format HTML --out ./dependency-check-report --nvdApiKey 37e63e4f-2cde-4ac7-923d-c7e17fc2d30c'
    }
}
