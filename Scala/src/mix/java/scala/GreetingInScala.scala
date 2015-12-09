package mix.java.scala

/**
 * @author harish
 */
class GreetingInScala {

	/* Array type*/
	var myArray :Array[String] = new Array[String](10);
  myArray(0) = "Harish";
  myArray(1) = "Spoo";
  myArray(2) = "Siddu";
  
  var myFiled = 0;
  var anotherFiled: Int = 10;

  var name: String = "Spori";

  /* constructors in scala */
  def this(value: Int) = {
    this();
    this.myFiled = value;
  }

  /* method declaration in scala */
  def greet() {
    val delegate = new GreetingInJava();
    delegate.greet();
  }

  /* method declaration with return type*/
  def getFiled(): Int = {
    return this.myFiled;
  }

   /* method declaration with return type of string*/
  def getName(): String = {
    return this.name;
  }
  
  /* method with formal parameter */
  def addtoMyFIiled(value:Int){
    this.myFiled += value;
  }
  
  def getMain(){
      this.Main.sayHi();
  }
  
  
  def printArray():String ={
    return myArray(0);
  }
  
  /* return array */
  def getArray:Array[String]={
    return myArray;
  }
  object Main{
    def sayHi(){
      println("Hello!!")
    }
  }
}