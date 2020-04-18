#!groovy
def call(message, outputDir) {
  // echo {outputDir}
  // mkdir -p {outputDir}

  // echo "welcome"
  // script: 'echo ${outputDir}'
  // sh "echo ${outputDir}"
  // sh "mkdir -p ${outputDir}"

  sh label: "${message}", 
          script: "mkdir -p ${outputDir}"
}
