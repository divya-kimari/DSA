import java.util.*;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("How many values do you want to enter?");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " values:");
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            l1.add(a);
        }

        System.out.println("The items in the list are:");
        System.out.print(l1);
    }
}
/* 
 to add value
 l1.add(34);
 l1. add(3,76);
 l1.set(2,66)  // update value at index 2;
 l1.contains(43);
 l1.remove(76);

//  to print the list
 for(int i=1; i<l1.size();i++){
    System.out.println(l1.get(i)); 
     }

  for( int x: l1){
            System.out.println(x);
        }  
 
*/