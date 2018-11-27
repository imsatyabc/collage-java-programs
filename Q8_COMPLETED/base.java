class base{
    public static void main(String[] args){
        int num1 = 4;
        int num2 = 6;
        int num3 = 2;

        if(num1 > num2 && num1 > num3){
            System.out.println("Number 1 i.e. "+num1+" is greatest of all the three numbers "+num1+","+num2+","+num3);
        }

        if(num2 > num1 && num2 > num3){
            System.out.println("Number 2 i.e. "+num2+" is greatest of all the three numbers "+num1+","+num2+","+num3);
        }

        if(num3 > num2 && num3 > num1){
            System.out.println("Number 3 i.e. "+num3+" is greatest of all the three numbers "+num1+","+num2+","+num3);
        }
    }
}