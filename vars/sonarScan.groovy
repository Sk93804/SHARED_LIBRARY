def call(Map config){
    withSonarQubeEnv(config.SONARQUBE_ENV){
        sh """ 
         mvn sonar:sonar \
        -Dsonar.projectKey=${config.projectKey} \
        -Dsonar.host.url=${config.sonarUrl} \
        -Dsonar.projectName='helloworld' \
        -Dsonar.token=sqp_0193553c8608e0ae7e36f28b48b25b34e94653da"""
    }
}