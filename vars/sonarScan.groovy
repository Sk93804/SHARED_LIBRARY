def call(){
    withSonarQubeEnv(config.SONARQUBE_ENV){
        sh """ 
         mvn sonar:sonar \
        -Dsonar.projectKey=${config.projectKey} \
        -Dsonar.host.url=${config.sonarUrl}"""
    }
}