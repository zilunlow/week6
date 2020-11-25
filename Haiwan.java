public final class Haiwan{//other class cannot extends this "final" class .Means other class cannot modify this class
	private String name;



	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name=name;
	}


	public void speak(){
		System.out.println("Rasengan!!!");
	}
}