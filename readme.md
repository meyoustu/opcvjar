# opcvjar [ OpenCV library for Java. ]
### Download

Gradle:
```gradle
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}



dependencies {
    implementation 'com.github.meyoustu:opcvjar:2020.6.14'
}
```

Maven:
```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>




<dependency>
    <groupId>com.github.meyoustu</groupId>
    <artifactId>opcvjar</artifactId>
    <version>2020.6.14</version>
</dependency>
```