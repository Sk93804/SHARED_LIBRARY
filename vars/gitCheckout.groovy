def call(String GIT_BRANCH, SC_URL ){
     git branch: '${GIT_BRANCH}' ,url: '${SC_URL}'
}