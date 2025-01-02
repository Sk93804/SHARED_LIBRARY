def call(String job = env.JOB_NAME) {
    sh "mvn clean package -Djob=${job}" 
    echo "${env.JOB_NAME}"
}
