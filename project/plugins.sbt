// Comment to get more information during initialization
//logLevel := Level.Warn



addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.7.3")

resolvers += "sbt-idea-repo" at "http://mpeltonen.github.com/maven/"

resolvers += Resolver.url("sbt-plugin-releases", new URL("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases/"))(Resolver.ivyStylePatterns)

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.0.0")
