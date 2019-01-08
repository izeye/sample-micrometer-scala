name := "sample-micrometer-scala"

version := "0.1"

scalaVersion := "2.12.8"

libraryDependencies += "io.micrometer" % "micrometer-registry-datadog" % "1.1.1"

libraryDependencies += "org.springframework" % "spring-core" % "5.1.3.RELEASE"

// Without this optional dependency you'll see the following warnings:
// Warning:scalac: While parsing annotations in /Users/izeye/.ivy2/cache/io.micrometer/micrometer-core/jars/micrometer-core-1.1.1.jar(io/micrometer/core/lang/Nullable.class), could not find MAYBE in enum <none>.
// This is likely due to an implementation restriction: an annotation argument cannot refer to a member of the annotated class (scala/bug#7014).
// Warning:scalac: While parsing annotations in /Users/izeye/.ivy2/cache/org.springframework/spring-core/jars/spring-core-5.1.3.RELEASE.jar(org/springframework/lang/Nullable.class), could not find MAYBE in enum <none>.
// This is likely due to an implementation restriction: an annotation argument cannot refer to a member of the annotated class (scala/bug#7014).
libraryDependencies += "com.google.code.findbugs" % "jsr305" % "3.0.2" % Optional
