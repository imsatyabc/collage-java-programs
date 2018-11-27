class base{
	public static void main(String[] args){
		new2 n = new new2();
		n.display();		
	}
}

class new1{
	void display(){
		System.out.println("This function is under new1 Class");
	}
}

class new2 extends new1{
	void display(){
		System.out.println("This function is under new2 Class");
	}
}