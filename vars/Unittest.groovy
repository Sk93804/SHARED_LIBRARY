def call(Map command) {
   sh "mvn ${command.option}"
}
