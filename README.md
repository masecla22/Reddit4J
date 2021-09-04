![JitPack](https://img.shields.io/jitpack/v/github/masecla22/Reddit4J?style=for-the-badge)
![Discord](https://img.shields.io/discord/881520515792134246?style=for-the-badge)
![GitHub](https://img.shields.io/github/license/masecla22/Reddit4J?style=for-the-badge)
![GitHub Sponsors](https://img.shields.io/github/sponsors/masecla22?style=for-the-badge)
![GitHub forks](https://img.shields.io/github/forks/masecla22/Reddit4J?style=for-the-badge)
![GitHub Repo stars](https://img.shields.io/github/stars/masecla22/Reddit4J?style=for-the-badge)

![Reddit4J Logo](assets/logo/logo.png)


<p align="center">
  A well documented Java library looking for 100% coverage of the Reddit API
</p>

# Reddit4J - The ideea behind it
Reddit4J was started when I was looking for a wrapper around the Reddit API and was only able to find a very limited number of solutions, most of them either with very poor documentation, or with incomplete coverage and very out of date.

# Adding Reddit4J as a dependency
## Maven
First add Jitpack as a repository, since Reddit4J uses Jitpack to distribute dependencies
```xml
<repositories>
	<repository>
	    <id>jitpack.io</id>
	    <url>https://jitpack.io</url>
	</repository>
</repositories>
```
And finally, add Reddit4J as a dependency
```xml
<dependency>
    <groupId>com.github.masecla22</groupId>
    <artifactId>Reddit4J</artifactId>
    <version>master-SNAPSHOT</version>
</dependency>
```
## Gradle
```kotlin
allprojects {
	repositories {
		maven { url 'https://jitpack.io' }
	}
}
```
``` kotlin
dependencies {
        implementation 'com.github.masecla22:Reddit4J:Tag'
}
```

# Contributing
We are always looking for people to help around and contribute their ideeas, as maintaining such a large project is far from a one-man project. 
There are multiple ways to contribute, including:
### New features
If there's a feature which you need, however it is not present in the wrapper right now, and you believe it could be useful for other people, it might be worth building it directly into the wrapper and contributing it into the main project. The steps for doing so are:
1. Fork the project
2. Make the wanted changes on a new branch
3. Submit a pull request
4. Discuss with reviewer, and implement changes if needed
5. Branch gets merged back into the project

A list of features which will generally get accepted really easily include, but are not limited to:
- Extra coverage for not covered yet endpoints, from the main docs
- Fixing issues, or making some request more efficient
- Converting some String value in a Reddit object into an Enum (be aware that sufficient observation must also be done)
- Adding new values to an enum (however they must be accompanied by a reproducible request which shows the value happening)

#### A quick note on undocumented endpoints
We ❤️ undocumented endpoints. We think it is what sets apart a simple robotic wrapper, from one that truly empowers developers to do wonderful things. However, when a request for one comes in, please keep in mind that since it is undocumented, it might take a little longer to get it implemented since it will take a bit to explore it and the full consequences it brings.

### Reporting bugs
If you have found a bug, [open an issue](https://github.com/masecla22/Reddit4J/issues), and someone will have a look over it, and hopefully fix it as soon as possible. Please keep in mind that this project is entirely run by volunteers so please keep in mind that an issue might take some time to be solved.
### Fixing issues
If you see an issue which you believe you can fix, follow the steps outlined for the new features, and submit a pull request. Ideally, mention the issue you want to fix (if there's one open) in your pull request. 

