def call(String goal, String name, String job = env.JOB_NAME) {
    if(!job){
        error "Job name is not provided"
    }
    sh "mvn ${goal} ${name} -Djob=${job}" 
    echo "${env.JOB_NAME}"
}
