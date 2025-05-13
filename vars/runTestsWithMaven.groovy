println "Running tests..."

def runTestsWithMaven() {
    println "Running tests using Maven..."
    def process = "mvn test".execute()  // Replace with "mvn test" or the command for your tests
    process.waitFor()
    if (process.exitValue() == 0) {
        println "Tests passed."
    } else {
        println "Tests failed."
        System.exit(1)  // Fail the process if tests fail
    }
}

runTestsWithMaven()
