def call(String job = 'defaultJob') {
    sh "mvn clean package -Djob=${job}" // Use the parameter in your build process if needed
}
