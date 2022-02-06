import java.util.Random;
import java.util.Scanner;

public class trysingleinput {
    public static int currentSize = 10;
    public static int[] arr = new int[100];

    public static void randomArr(){
        arr[0] = 0;
        int i = 0;
        Random r = new Random();
        while(i!=10){
            arr[i] = r.nextInt(100)+1;
            i++;
        }
    }

    public static void printArray(){
        System.out.print("Index : ");
        for(int i=1; i<=currentSize;i++){
            System.out.print(i + "\t");
        }
        System.out.print("\nArray : ");
        for(int i=1; i<=currentSize;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println("\n");
    }

    public static void removeIndex(int index){
        System.out.printf("Removing %dth element\n",index);
        for(int i = index; i<currentSize-1 ; i++){
            arr[i]  = arr[i+1];
        }
        currentSize--;
        printArray();
    }

    public static void addIndex(int index,int newNumber){
        System.out.printf("Adding new %dh element\n",index);
        for(int i = currentSize+1; i>index; i--){
            arr[i] = arr[i-1];
        }
        arr[index] = newNumber;
        currentSize++;
        printArray();
    }

    // Main
    public static void main(String[] args) {
        // Randomly generated Array
        randomArr();
        printArray();

        // Removing 4th element
        System.out.print("Want to delete some Indexes ? y/n : ");
        Scanner sc = new Scanner(System.in);
        if(sc.next().equals("y")){
            System.out.print("Which Index Do you Want to delete? : ");
            removeIndex(sc.nextInt());
        }
        //Adding an element
        System.out.print("Want to add some Indexes ? y/n : ");
        if(sc.next().equals("y")){
            System.out.print("Which Index Do you Want to Add to? : ");
            int i = sc.nextInt();
            System.out.print("Add some value to it : ");
            addIndex(i,sc.nextInt());
        }
    }
}
