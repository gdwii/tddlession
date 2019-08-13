plugins {
    java
}

group = "com.gdwii"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testCompile("org.junit.jupiter", "junit-jupiter", "5.5.1")
}


configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_12
}

tasks.test{
    useJUnitPlatform()
    testLogging {
        events("passed", "skipped", "failed")
    }
}