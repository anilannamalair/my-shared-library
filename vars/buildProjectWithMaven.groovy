println "Building project..."

def buildProjectWithMaven() {
    println "Building project using Maven..."
    def process = "mvn clean package".execute()  // Use "mvn clean package" or other build command
    process.waitFor()
    if (process.exitValue() == 0) {
        println "Build successful."
    } else {
        println "Build failed."
        System.exit(1)  // Fail the process if build fails
    }
}

buildProjectWithMaven()
