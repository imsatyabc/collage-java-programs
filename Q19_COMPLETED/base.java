class base{
	public static void main(String[] args){
		B b = new B();
		b.setAVar(5);
		b.displayA();
	}
}


class A{
	int aVar;
	void display(){
		System.out.println("Value of variable in class A is "+aVar);
	}
}

class B extends A{
	void setAVar(int aVar){
		super.aVar = aVar;
	}
	void displayA(){
		super.display();
	}
}