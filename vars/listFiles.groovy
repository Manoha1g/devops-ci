#!groovy
def call(options) {
  script {
    echo "listing all the files"
    sh 'mkdir testDir'
    sh 'ls ${options}'
    sh 'rm -rf testDir'
  }
}
