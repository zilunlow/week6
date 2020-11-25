public class TestAnimal{
	public static void main(String []args){
		//InterfaceCelebrity ic=new InterfaceCelebrity();//not possible.Interface cannot have object


		// Animal a= new Animal();//abstract class cannot create object
		// a.speak();

		Haiwan h=new Haiwan();
		h.setName("Tom");
		System.out.println(h.getName());

		Cat c=new Cat();
		c.setName("Tom");
		System.out.println(c.getName());
		c.bunyi();
		c.speak();
	
		Mouse m=new Mouse();
		m.setName("Jerry");
		System.out.println(m.getName());
		m.speak();


		CartoonCat garfield =new CartoonCat();
		garfield.bunyi();//from extends Cat
		garfield.speak();
		garfield.setName("Garfield");
		System.out.println(garfield.getName());
		garfield.screenTime("Garfield Home Alone");
		System.out.println("Pay is "+garfield.pay(10)); 

		garfield.screenTime2("Garfield Home Alone 2");
		System.out.println("New Pay is "+garfield.pay2(10));


	}
}