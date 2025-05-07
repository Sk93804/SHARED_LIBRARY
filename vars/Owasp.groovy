def call() {
    // Ensure Dependency-Check is run in the correct workspace directory
    dir('./jenkins/workspace/First_job') {
        sh 'dependency-check --scan . --format HTML --out ./dependency-check-report'
    }
}
