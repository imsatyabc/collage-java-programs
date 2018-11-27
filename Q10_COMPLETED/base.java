class base{
	public static void main(String[] args){
		so s1 = new so("+");
		so s2 = new so("-");
		so s3 = new so("*");
		so s4 = new so("/");
	}
}

class so{
	so(String operation){
		switch(operation){

			case "+":
				System.out.println("Addition");
				break;
			case "-":
				System.out.println("Substraction");
				break;
			case "*":
				System.out.println("Multiplication");
				break;
			case "/":
				System.out.println("Division");
				break;
			}
	}
}