import helloworld.*
import org.nazt.lexto.*
import groovy.util.*
import java.*
import groovy.util.*
/*/	System.setProperty( "file.encoding", "UTF-8" );*/
class JavaController {
	
   // HelloWorld tt = new HelloWorld();
	def myTypeList,myIndexList=[]
	//cc.Test();
    def index = { 
	 System.out.println("Encoding: " + System.getProperty("file.encoding"));
     System.out.println("Charset: " + java.nio.charset.Charset.defaultCharset());
	def myString=[]
	def lexdict=new File("lexitron.txt")
	LongLexTo tokenizer=new LongLexTo("SELFED DICT")
	lexdict.eachLine{ tokenizer.addDict(it.trim()) }
	println "lexsize="+lexdict.size()
 //	def news=new File("news.txt").getText("MacRoman")
	def news=new File("news.txt")
 
	news.eachLine{
 
	tokenizer.wordInstance(it.trim())
		myTypeList = tokenizer.getTypeList()
		myIndexList=tokenizer.getIndexList()
		myString = [it]
	}
	println System.getProperty("user.dir");
	def indexer=0
	myIndexList.eachWithIndex{ num, idx ->
		def type=myTypeList[idx]
		render  myString[0][indexer..num-1] + "|" 
		indexer=num
	}
	
	println myIndexList
	println myTypeList
//	println 
	render "TEST"
//	Charset guessedCharset = CharsetToolkit.guessEncoding("ทดสอบ", 4096);

	 System.out.println("Encoding: " + System.getProperty("file.encoding"));
    System.out.println("Charset: " + java.nio.charset.Charset.defaultCharset());
/*		println "lexsize="+lexdict.size()*/
	 } 
}
