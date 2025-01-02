def call(String goal, String option) {
   sh 'mvn ${goal} ${option} ${env.JOB_NAME}'
}
