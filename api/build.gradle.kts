dependencies {
    compileOnly("io.papermc.paper:paper-api:1.21.4-R0.1-SNAPSHOT")
    compileOnly("org.projectlombok:lombok:1.18.44")
    annotationProcessor("org.projectlombok:lombok:1.18.44")
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            groupId = "github.nighter"
            artifactId = "GooseSpawner-api"
            from(components["java"])

            pom {
                name.set("GooseSpawner API")
                description.set("API for GooseSpawner plugin - allows other plugins to create and manage spawners")
                url.set("https://github.com/NighterDevelopment/GooseSpawner")
                licenses {
                    license {
                        name.set("MIT License")
                        url.set("https://opensource.org/licenses/MIT")
                    }
                }
                developers {
                    developer {
                        id.set("nighter")
                        name.set("Nighter")
                        email.set("notnighter@gmail.com")
                    }
                }
            }
        }
    }
}

