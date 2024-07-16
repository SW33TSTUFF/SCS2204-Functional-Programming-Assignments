file://<HOME>/Music/16VIVA/SCS2204-Functional-Programming-Assignments/Practical%205/question3.scala
### java.lang.NoClassDefFoundError: sourcecode/Name

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.3
Classpath:
<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala3-library_3/3.3.3/scala3-library_3-3.3.3.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.12/scala-library-2.13.12.jar [exists ]
Options:



action parameters:
offset: 372
uri: file://<HOME>/Music/16VIVA/SCS2204-Functional-Programming-Assignments/Practical%205/question3.scala
text:
```scala
object question3 extends App {
    import scala.io.StdIn

    def fibonacci(n: Int): Int = {
    if (n <= 0) 0
    else if (n == 1) 1
    else fibonacci(n - 1) + fibonacci(n - 2)
    }

    def printFibonacci(n: Int): Unit = {
    for (i <- 0 until n) {
        print(s"${fibonacci(i)} ")
    }
    }

    print("Enter a number: ")
    val n = StdIn.readInt()
    if (n <M@@)
    println("First n Fibonacci number ")
    printFibonacci(n)

}
```



#### Error stacktrace:

```
scala.meta.internal.tokenizers.XmlParser$Xml$.UnpStart(XmlParser.scala:44)
	scala.meta.internal.tokenizers.XmlParser$Xml$.Unparsed(XmlParser.scala:43)
	scala.meta.internal.tokenizers.XmlParser$Xml$.XmlContent(XmlParser.scala:39)
	scala.meta.internal.tokenizers.XmlParser.$anonfun$XmlExpr$1(XmlParser.scala:25)
	scala.meta.shaded.internal.fastparse.internal.RepImpls$.rec$4(RepImpls.scala:226)
	scala.meta.shaded.internal.fastparse.internal.RepImpls$.rep$extension(RepImpls.scala:266)
	scala.meta.shaded.internal.fastparse.package$ByNameOps$.rep$extension(package.scala:202)
	scala.meta.internal.tokenizers.XmlParser.XmlExpr(XmlParser.scala:25)
	scala.meta.internal.tokenizers.LegacyScanner.$anonfun$getXml$2(LegacyScanner.scala:838)
	scala.meta.shaded.internal.fastparse.SharedPackageDefs.parseInputRaw(SharedPackageDefs.scala:69)
	scala.meta.shaded.internal.fastparse.SharedPackageDefs.parseInputRaw$(SharedPackageDefs.scala:45)
	scala.meta.shaded.internal.fastparse.package$.parseInputRaw(package.scala:6)
	scala.meta.shaded.internal.fastparse.Parsed$Extra.trace(Parsed.scala:139)
	scala.meta.internal.tokenizers.LegacyScanner.getXml(LegacyScanner.scala:841)
	scala.meta.internal.tokenizers.LegacyScanner.fetchLT$1(LegacyScanner.scala:282)
	scala.meta.internal.tokenizers.LegacyScanner.fetchToken(LegacyScanner.scala:290)
	scala.meta.internal.tokenizers.LegacyScanner.nextToken(LegacyScanner.scala:201)
	scala.meta.internal.tokenizers.LegacyScanner.foreach(LegacyScanner.scala:912)
	scala.meta.internal.tokenizers.ScalametaTokenizer.uncachedTokenize(ScalametaTokenizer.scala:23)
	scala.meta.internal.tokenizers.ScalametaTokenizer.$anonfun$tokenize$1(ScalametaTokenizer.scala:17)
	scala.collection.concurrent.TrieMap.getOrElseUpdate(TrieMap.scala:962)
	scala.meta.internal.tokenizers.ScalametaTokenizer.tokenize(ScalametaTokenizer.scala:17)
	scala.meta.internal.tokenizers.ScalametaTokenizer$$anon$2.apply(ScalametaTokenizer.scala:322)
	scala.meta.tokenizers.Api$XtensionTokenizeDialectInput.tokenize(Api.scala:22)
	scala.meta.tokenizers.Api$XtensionTokenizeInputLike.tokenize(Api.scala:13)
	scala.meta.internal.pc.ScriptFirstImportPosition$.tokenize(ScriptFirstImportPosition.scala:70)
	scala.meta.internal.pc.ScriptFirstImportPosition$.infer(ScriptFirstImportPosition.scala:48)
	scala.meta.internal.pc.AutoImports$.forScalaSource$1$$anonfun$1(AutoImports.scala:335)
	scala.Option.map(Option.scala:242)
	scala.meta.internal.pc.AutoImports$.forScalaSource$1(AutoImports.scala:346)
	scala.meta.internal.pc.AutoImports$.autoImportPosition$$anonfun$1(AutoImports.scala:389)
	scala.Option.orElse(Option.scala:477)
	scala.meta.internal.pc.AutoImports$.autoImportPosition(AutoImports.scala:389)
	scala.meta.internal.pc.AutoImports$.generator(AutoImports.scala:98)
	scala.meta.internal.pc.completions.CompletionProvider.completions(CompletionProvider.scala:70)
	scala.meta.internal.pc.ScalaPresentationCompiler.complete$$anonfun$1(ScalaPresentationCompiler.scala:148)
```
#### Short summary: 

java.lang.NoClassDefFoundError: sourcecode/Name