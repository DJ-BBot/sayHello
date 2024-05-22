plugins {
    id("java")
}

group = "org.example"
version = "unspecified"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.register<Exec>("generateJava") {
    dependsOn("cleanHelloWorld")
    workingDir(".")
    commandLine("python","genHelloWorldApp.py")
}

tasks.register<Exec>("cleanHelloWorld") {
    workingDir(".")
    commandLine("python","genHelloWorldApp.py","--clean")
}