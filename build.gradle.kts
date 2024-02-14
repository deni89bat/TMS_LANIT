plugins {
    id("java")
}

group = "org.bat"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.2")
    implementation("com.codeborne:selenide:7.1.0")

}

tasks.test {
    useJUnitPlatform()
}