import java.lang.Math;
class base{
    public static void main(String[] args){
        int matrixA[][] = new int[3][3];
        int matrixB[][] = new int[3][3];
        int multi[][] = new int[3][3];

        //Assgining Values to matrices
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matrixA[i][j] = ((int)Math.floor(Math.random()*80)+11);
                matrixB[i][j] = ((int)Math.floor(Math.random()*80)+11);
            }   
        }

        //Printing Both Matrices
        System.out.println("Matrix A: ");    
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrixA[i][j]+"    ");
            }   
            System.out.println("");
        }

        
        System.out.println("Matrix B: ");    
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrixB[i][j]+"    ");
            }   
            System.out.println("");
        }

        //Adding Them
        System.out.println("Matrix A + B: ");    
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrixA[i][j]+matrixB[i][j]+"    ");
            }   
            System.out.println("");
        }

        //Multiplying Them
        System.out.println("Matrix A * B: ");    
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    multi[i][j] += matrixA[i][k]*matrixB[k][j];
                }   
            }   
        }

        //Printing Multiplied Matrix
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(multi[i][j]+"    ");
            }   
            System.out.println("");
        }

    }
}