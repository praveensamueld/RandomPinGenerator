# Random PIN Generator 
A java library for generating a batch of unique random PINs.

## Prerequisites
1. A Linux/macOS/Windows machine running Java 8 or above. For detailed installation instructions please [click here](https://java.com/en/download/help/download_options.html). 
2. Install **git**. For detailed installation instructions please [click here](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git)
3. An **IDE** - [Intellij IDEA](https://www.jetbrains.com/idea/) or [Eclipse](https://www.eclipse.org/downloads/).

## Project structure

1. This Java library project was generated using *gradle init* task.
2. This project uses **testNG** for unit testing and **AssertJ** to leverage the rich set of assertions to improve code readability. 

```$xslt
├── gradle 
│   └── wrapper
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── gradlew 
├── gradlew.bat 
├── settings.gradle 
└── lib
    ├── build.gradle 
    └── src
        ├── main
        │   └── java 
        │       └── org.westpac.random.pins
        │           └── RandomPinGeneration.java
        │           └── RandomPinGenerator.java
        └── test
            └── java 
                └── org.westpac.random.pins
                    └── RandomPinGeneratorTest.java
```

## Cloning the project
1. Open **Terminal** for **Linux/macOS** or **CMD** for **Windows**.
2. **cd** into the desired folder where you intend to clone the repository.
3. Run the below command. 
```$xslt
git clone https://github.com/davidmerfield/randomColor.git
```
4. **cd** into the parent directory.
```$xslt
cd RandomPinGenerator
```

## Building the project
### Linux/macOS
1. From the parent directory of the cloned repository, run the below command in Terminal.
```$xslt
./gradlew build
```

### Windows
1. From the parent directory of the cloned repository, run the below command in CMD.
```$xslt
gradlew.bat build
```

> Note that you don't need to install gradle on your machine. The first time you run the wrapper script, gradlew, there may be a delay while that version of gradle is downloaded and stored locally in your ~/.gradle/wrapper/dists folder.

> The first time you run the build, Gradle will check whether you already have the required dependencies in your cache under your ~/.gradle directory. If not, the libraries will be downloaded and stored there. The next time you run the build, the cached versions will be used. 

**The gradlew build command performs the below tasks:**
1. Compiles the classes.
2. Generates the jar or library file.
3. Generates the javadoc.
4. Runs the unit tests and generates a test report.

### Build Artifacts
#### Accessing the jar/library
You can find your newly packaged JAR file in the **lib/build/libs** directory with the name **lib-0.1.0.jar**.

#### Accessing the javadoc
You can view the generated javadoc files by opening the HTML file located at **lib/build/docs/javadoc/index.html**.

#### Accessing the unit test results
You can view the test report by opening the HTML output file, located at **lib/build/reports/tests/test/index.html**.
