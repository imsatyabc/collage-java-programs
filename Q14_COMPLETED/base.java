import java.lang.Math;
class base{
    public static void main(String[] args){
        int r[] = new int[10];
        for(int i=0;i<10;i++){
            r[i] = ((int)Math.floor(Math.random()*80)+11);
        }

        //printing numbers
        System.out.print("r: ");
        for(int i=0;i<10;i++){
            System.out.print(r[i]+"     ");
        }
        System.out.println("");

        for(int i=1;i<10;i++){
            for(int j=1;j<10;j++){
                if(r[j-1]>r[j]){
                    int temp = r[j-1];
                    r[j-1] = r[j];
                    r[j] = temp;
                }
            }            
        }

        System.out.print("Top 3 Values: "+r[9]+"    "+r[8]+"    "+r[7]);

    }
}