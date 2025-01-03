def call(Map config){
     echo "Code checkout in ${config.env}"
     git branch: '${config.branch}', url: '${config.url}'
}