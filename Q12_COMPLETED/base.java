class base{
	public static void main(String[] args){

        System.out.println("Example of Continue Statement");
		for(int i=1;i<=10;i++){
			if(i==6){
				continue;
			}
			System.out.println("The i is "+i+" not 6");
        }
        
        System.out.println("Example of Break Statement");

        for(int i=1;i<=10;i++){
			System.out.println(i);
			if(i==6){
				break;
			}
        }
        
        System.out.println("Broke at 6");
	}
}