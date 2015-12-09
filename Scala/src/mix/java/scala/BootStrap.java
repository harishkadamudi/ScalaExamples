package mix.java.scala;

public class BootStrap {

	public static void main(String[] args) {

		GreetingInScala inScala = new GreetingInScala(100);
		inScala.getMain();
		inScala.greet();
		System.out.println(inScala.anotherFiled());
		System.out.println(" before modification " + inScala.myFiled());
		inScala.addtoMyFIiled(100);
		System.out.println(" after modification " + inScala.myFiled());
		System.out.println(" Array of {0}" +inScala.printArray());
		String[] array = inScala.getArray();
		System.out.println(" Array Size --" + array.length);
	}

}
