#!groovy
def call(Map values) {
  for (e in values) {
    print "key = ${e.key}, value = ${e.value}" 
  }
}
