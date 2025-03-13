def call() {
    echo "Building the Java project with Maven..."
    sh 'mvn clean package'  // Build the project with Maven
}
