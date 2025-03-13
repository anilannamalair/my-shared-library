// deployProject.groovy
println "Deploying project..."

def deployToServer() {
    println "Deploying project to server..."
    // Add your deployment logic here, like copying files or triggering a deployment API
    def process = "scp target/my-app.jar user@server:/path/to/deployment".execute()  // Example command
    process.waitFor()
    if (process.exitValue() == 0) {
        println "Deployment successful."
    } else {
        println "Deployment failed."
        System.exit(1)  // Fail the process if deployment fails
    }
}

deployToServer()
