public class CartoonCat extends Cat implements InterfaceCelebrity,InterfaceCelebrity2{
	
	public void speak(){
		System.out.println("Rasengan");
	}

	public void screenTime(String episode){
		System.out.println(episode);
	}

	public double pay(int hour){
		return hour*1.5;
	}

		public void screenTime2(String episode){
		System.out.println("EP "+episode);
	}

	public double pay2(int hour){
		return hour*1.5*2;
	}



}