def call(Map command) {
   sh "mvn ${command.goal} ${command.option}"
}
