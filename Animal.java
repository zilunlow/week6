public abstract class Animal{//abstract class cannot create object
	private String name;



	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name=name;
	}


	public abstract void speak();//abstract method
	
}