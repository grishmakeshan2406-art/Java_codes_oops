import java.util.Scanner;
public class evenodd{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
       
       int[] array= new int[10];
       int evencount=0;
       int oddcount=0;
       int sum=0;
        System.out.println("enter 10 integers:");
        for(int i=0;i<array.length;i++)
       {
        System.out.print("Enter integer " + (i + 1) + ": ");
        array[i]=scanner.nextInt();
       }
      for(int num: array){
        if(num%2==0){
            evencount++;
        }
        else{
            oddcount++;
        }
        sum=sum+num;
      }
      System.out.println("even numbers: " +evencount);
      System.out.println("odd numbers: " +oddcount);
      System.out.println("total sum is:" +sum);
        scanner.close();
    }
}