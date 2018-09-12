# gwt-momentjs
Light JSInterop wrapper for [moment.js](http://momentjs.com)

[![](https://jitpack.io/v/ascendtech/gwt-momentjs.svg)](https://jitpack.io/#ascendtech/gwt-momentjs)

## Getting Started

### Gradle

Add JitPack
```gradle
  allprojects {
    repositories {
      ...
      maven { url 'https://jitpack.io' }
    }
  }
```

Add Dependency:
```gradle
  compile 'com.github.ascendtech:gwt-momentjs:1.0'
  compile 'com.github.ascendtech:gwt-momentjs:1.0:sources'
```

### Maven

Add JitPack
```xml
  <repositories>
    <repository>
      <id>jitpack.io</id>
      <url>https://jitpack.io</url>
    </repository>
  </repositories>
```
Add Dependency
```xml
  <dependency>
    <groupId>com.github.ascendtech</groupId>
    <artifactId>gwt-momentjs</artifactId>
    <version>1.0</version>
  </dependency>
  <dependency>
    <groupId>com.github.ascendtech</groupId>
    <artifactId>gwt-momentjs</artifactId>
    <version>1.0</version>
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
