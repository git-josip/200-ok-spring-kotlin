val springCloudVersion = "2.1.1.RELEASE"
plugins {
    kotlin("jvm")
}

dependencies {
    compile(kotlin("stdlib-jdk8"))

    compile("org.springframework.boot:spring-boot-starter-actuator")
    compile("org.springframework.boot:spring-boot-starter-security")
    compile("org.springframework.cloud:spring-cloud-config-server:$springCloudVersion")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
}
