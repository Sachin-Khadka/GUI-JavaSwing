package Honnoi;
import java.util.Scanner;
public class TowersOfHanoi {
    static int add=0;
    public void Hanoi(int n, String source, String aux, String dest)
    {
        // If only 1 disk, make the move and return.
        if(n==1)
        {
            System.out.println("Step:"+(++add)+" "+source+" --> "+dest);
            return;
        }

        // Move top n-1 disks from A to B using C as auxiliary.
        Hanoi(n-1, source, dest, aux);

        //Move remaining disks from A to C
        System.out.println("Step:"+(++add)+" "+source+" --> "+dest);

        // Move n-1 disks from B to C using A as auxiliary
        Hanoi(n-1, aux, source, dest);

    }

    public static void main(String args[])
    {
        TowersOfHanoi obj = new TowersOfHanoi();
        MyException ob = new MyException();

        try{
            System.out.println("Enter number of disks :- ");
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            scanner.close();
            if(n>8){
                throw ob;
                   }

            System.out.println("Move disks as below illustration.");
            obj.Hanoi(n, "1", "2", "3");
            System.out.println("Total no of step: "+add);
        }

        catch(Exception e)
        {
            System.out.println(e);
        }

    }   
}

