import java.util.Scanner;
public class Q4_IndexFL {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the size of array: ");
                int n = sc.nextInt();
                int[] arr = new int[n];
                System.out.print("Enter the elements of array: ");
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }
                System.out.print("Enter the target number to search: ");
                int target = sc.nextInt();
                int firstIndex = -1, lastIndex = -1;
                for (int i = 0; i < n; i++) {
                    if (arr[i] == target) {
                        if (firstIndex == -1) {
                            firstIndex = i;
                        }
                        lastIndex = i;
                    }

                }
                if (firstIndex != -1) {
                    System.out.println("First index of " + target + " is " + firstIndex);
                    System.out.println("Last index of " + target + " is " + lastIndex);
                } else {
                    System.out.println(target + " not found in the array.");
                }
            }

        }
