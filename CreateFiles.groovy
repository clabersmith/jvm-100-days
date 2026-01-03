#!/usr/bin/env groovy

/**
 * Simple script to generate:
 *  - Java file with empty class
 *  - Groovy file with empty class
 *  - Kotlin file with a dummy function
 *
 * Usage:
 *   groovy CreateFiles.groovy MyClassName
 */

if (args.length < 1) {
    println "Usage: groovy CreateFiles <BaseName>"
    System.exit(1)
}

def baseName = args[0]
def basePath = "app/src"
def spockFile = new File("${basePath}/test/groovy/${baseName}Spec.groovy")
def javaFile = new File("${basePath}/main/java/${baseName}.java")
def groovyFile = new File("${basePath}/main/groovy/${baseName}.groovy")
def kotlinFile = new File("${basePath}/main/kotlin/${baseName}.kt")

// -- Spock test spec template

spockFile.text = """
import spock.lang.Specification

class ${baseName}Spec extends Specification {
}
""".trim() + "\n"

// --- Java class ---
javaFile.text = """
public class ${baseName} {
}
""".trim() + "\n"

// --- Groovy class ---
groovyFile.text = """
class ${baseName}Groovy {
}
""".trim() + "\n"

// --- Kotlin file with dummy function ---
kotlinFile.text = """
fun implementSolution() {
    println("Replace with metho to implement solution")
}
""".trim() + "\n"


println "Generated files:"
println " - ${javaFile.name}"
println " - ${groovyFile.name}"
println " - ${kotlinFile.name}"