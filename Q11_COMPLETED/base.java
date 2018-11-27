class base{
    public static void main(String[] args){
	int len = 5;
	System.out.println("Printing Triangle using for loop.");
        for(int i=1;i<=len;i++){
		for(int j=1;j<=i;j++){
			System.out.print("*");
		}
		System.out.println("");
	}
	System.out.println("Printing Triangle using while loop.");	
	int i = 1;
	while(i<=len){
		int j = 1;
		while(j<=i){
			System.out.print("*");
			j++;
		}
		System.out.println("");
		i++;
	}
	System.out.println("Printing Triangle using do while loop.");
	i = 1;
	do{
		int j = 1;
		do{
			System.out.print("*");
			j++;
		}while(j<=i);
		System.out.println("");
		i++;
	}while(i<=len);
    }
}