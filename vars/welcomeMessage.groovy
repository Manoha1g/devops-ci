def call(name) {
        sh 'echo welcome message'
	sh 'echo "Message from Shared Library ${name}..."'
}
