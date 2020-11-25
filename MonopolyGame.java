public class MonopolyGame{
	public static void main(String []args){

	Token wheelbarrow=new Token("Wheelbarrow","Red");
	wheelbarrow.updatePosition(5);
	System.out.println(wheelbarrow);
	Player p1=new Player("Player1",wheelbarrow);
	System.out.println(p1);

	Token hat=new Token("hat","green");
	PropertyOwner po1=new PropertyOwner("Po1",hat);
	System.out.println(po1);
	po1.buyProperty("AEON");

	Token car=new Token();


	}


}