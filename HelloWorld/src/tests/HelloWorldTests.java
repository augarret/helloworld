package tests;


import org.junit.*;

public class HelloWorldTests {
	
	@Test
	public void sayHelloNameInput(){
		HelloWorld hw = new HelloWorld();
		String name = "Jane";
		Assert.assertEquals("Hello " + name, hw.sayHello(name));
	}
	
	

}
