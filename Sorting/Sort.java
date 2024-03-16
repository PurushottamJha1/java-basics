import java.util.*;
public class Sort{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int numElements = scanner.nextInt();
        
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Enter the elements:");
        for (int i = 0; i < numElements; i++) {
            int num = scanner.nextInt();
            numbers.add(num);
        }
        
        Collections.sort(numbers);
        
        System.out.println("Sorted list of integers:");
        for (int num : numbers) {
            System.out.print(num+" ");
        }
        
        scanner.close();
    }
}