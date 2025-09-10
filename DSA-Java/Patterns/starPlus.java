import java.util.Scanner;
class starPlus {
    public static void printPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==n/2+1 || j==n/2+1){
                    System.out.print("*" +" ");
                }
                else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n%2!=0) printPattern(n);
        else System.out.println("Please provide odd number as input");
        scanner.close();
    }
}