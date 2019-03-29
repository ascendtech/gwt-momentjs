# gwt-momentjs
Light JSInterop wrapper for [moment.js](http://momentjs.com)

[![](https://jitpack.io/v/ascendtech/gwt-momentjs.svg)](https://jitpack.io/#ascendtech/gwt-momentjs)

## Getting Started

### Gradle

Add AST Maven Repo
```gradle
  allprojects {
    repositories {
      ...
      maven { url 'https://maven.ascend-tech.us/repo' }
    }
  }
```

Add Dependency:
```gradle
  compile 'com.github.ascendtech:gwt-momentjs:0.1.9'
  compile 'com.github.ascendtech:gwt-momentjs:0.1.9:sources'
```

### Maven

Add JitPack
```xml
  <repositories>
    <repository>
      <id>AST Maven</id>
      <url>https://maven.ascend-tech.us/repo</url>
    </repository>
  </repositories>
```
Add Dependency
```xml
  <dependency>
    <groupId>com.github.ascendtech</groupId>
    <artifactId>gwt-momentjs</artifactId>
    <version>0.1.9</version>
  </dependency>
  <dependency>
    <groupId>com.github.ascendtech</groupId>
    <artifactId>gwt-momentjs</artifactId>
    <version>0.1.9</version>
    <classifier>sources</classifier>
  </dependency>
```

### Example in Java

Add dependency to gwt.xml
```xml
<inherits name="us.ascendtech.MomentJS"/>
```

```java
double year = new MomentJS().year();
String formattedDate = new MomentJS().format("MM-DD-YYYY");
```
