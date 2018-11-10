import org.ajoberstar.reckon.gradle.ReckonExtension

plugins {
    java
    maven
    id("us.ascendtech.gwt.lib") version "0.3.3" apply false
    id("org.ajoberstar.reckon") version "0.8.0"
}

configure<ReckonExtension> {
    scopeFromProp()
    stageFromProp("rc", "final")
}


defaultTasks("build")

subprojects {

    apply(plugin = "java")
    apply(plugin = "maven")


    defaultTasks("build")
    group = "us.ascendtech"

    repositories {
        mavenCentral()
    }


    tasks.withType<JavaCompile> {
        options.isDebug = true
        options.debugOptions.debugLevel = "source,lines,vars"
        options.encoding = "UTF-8"
        options.compilerArgs.add("-parameters")
    }

    dependencies {
        testImplementation("org.junit.jupiter:junit-jupiter-api:5.2.0")
        testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.2.0")
    }

    sourceSets {
        main {
            java {
                srcDir("src/main/java")
            }
            resources {
                srcDir("src/main/java")
            }
        }
        test {
            resources {
                srcDir("src/test/java")
            }
        }
    }

}