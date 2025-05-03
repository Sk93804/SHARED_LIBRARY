def call(){
    withSonarQubeEnv(config.SONARQUBE_ENV){
        sh """ sonar:sonar \
        -Dsonar.projectKey=${config.projectKey} 
        -Dsonar.host.url=${config.sonarUrl}"""
    }
}