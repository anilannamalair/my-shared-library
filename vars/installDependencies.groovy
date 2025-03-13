// installDependencies.groovy
println "Installing dependencies..."

def installMavenDependencies() {
    println "Running Maven install..."
    def process = "mvn clean install".execute()
    process.waitFor()
    println "Dependencies installed."
}

installMavenDependencies()
