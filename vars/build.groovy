def call(String job = env.JOB_NAME) {
    if(!job){
        error "Job name is not provided"
    }
    sh "mvn clean package -Djob=${job}" 
    echo "${env.JOB_NAME}"
}
