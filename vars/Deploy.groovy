def call(){
    sh ''' cd ./target && scp -r helloworld ubuntu@43.204.116.145:/home/tomcat10/webapps/ '''
           
}