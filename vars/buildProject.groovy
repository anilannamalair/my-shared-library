def call() {
    echo "Installing dependencies with Maven..."
    sh 'mvn clean install'  // Install dependencies using Maven
}
