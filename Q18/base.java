class base{
	public static void main(String[] args){
		square s1 = new square(10);
		s1.area();
	}
}

class rectangle{
	int l;
	int w;
	rectangle(int l,int w){
		this.l = l;
		this.w = w;
	}
	void area(){
		System.out.print("Area is " + l*w);
	}
}

class square extends rectangle{
	square(int s){
		super(s,s);
	}	
	void area(){
		super.area();
	}
}