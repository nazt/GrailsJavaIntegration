import groovy.*
import java.*

new File('new.txt').withWriter("UTF-8") { file ->
  new File('lexitron.txt').eachLine { line ->
     file.writeLine(line)
	println line  
}
}
//println a
//a.eachLine { println it }
	 System.out.println("Encoding: " + System.getProperty("file.encoding"));
    System.out.println("Charset: " + java.nio.charset.Charset.defaultCharset());
