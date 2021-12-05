import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Basic_Programming_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Get number of numbers input
        int N = Integer.parseInt(sc.next());
        // Get 1 through 5 value
        int t = Integer.parseInt(sc.next());
        // Array to store numbers
        int numbers[] = new int[N];

        sc.nextLine();
        // load array with input numbers numbers
        for(int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(sc.next());
        }

        // Print “Yes” if there are two integers 𝑥∈𝐴 and 𝑦∈𝐴 such that 𝑥≠𝑦 and 𝑥+𝑦=7777,
        //      or “No” otherwise (without the quotes)
        if(t == 1) {
            Set<Integer> difNums = new HashSet<>();
            difNums.add(numbers[0]);
            for(int p = 1; p < N; p++){
                if (difNums.contains(7777 - numbers[p])){
                    System.out.println("Yes");
                    return;
                }
                difNums.add(numbers[p]);
            }
            System.out.println("No");
            return;
        }
        // Print “Unique” if all integers in 𝐴 are different;
        //      or print “Contains duplicate” otherwise (without the quotes)
        if(t == 2) {
            Set<Integer> difNums = new HashSet<>();
            difNums.add(numbers[0]);
            for(int p = 1; p < N; p++)
            {
                if (difNums.contains(numbers[p])){
                    System.out.println("Contains duplicate");
                    return;
                }
                difNums.add(numbers[p]);
            }
            System.out.println("Unique");
            return;
        }
        // Find and print the integer that appears >𝑁/2 times in 𝐴;
        //      or print −1 if such integer cannot be found
        if(t == 3) {
            Arrays.sort(numbers);
            int count = 1;
            for (int p = 0; p < N - 1; p++) {
                if (numbers[p] != numbers[p + 1]) {
                    if (count > (N / 2)) {
                        System.out.println(numbers[p]);
                        return;
                    } else {
                        count = 0;
                    }
                } else {
                    if(p == N - 1) {
                        count++;
                    }
                    count++;
                }
            }
            if (count > (N / 2)) {
                System.out.println(numbers[N - 1]);
            } else {
                System.out.println("-1");
            }
            return;
        }
        // Find and print the median integer of 𝐴 if 𝑁 is odd;
        //       or print both median integers of 𝐴 if 𝑁 is even
        //       (separate them with a single space)
        if(t == 4) {
            Arrays.sort(numbers);
            if(N % 2 != 0) {
                System.out.println(numbers[N/2]);
            }
            else {
                System.out.println(numbers[(N/2 - 1)] + " " + numbers[N/2]);
            }
            return;

        }
        // Print integers in 𝐴 that fall between a range [100…999]
        //      in sorted order; (print a single space between two integers)
        if(t == 5) {
            Arrays.sort(numbers);
            for(int l = 0; l < N; l++) {
                if((numbers[l] >= 100) && (numbers[l] <= 999)) {
                    System.out.print(numbers[l] + " ");
                }
            }
            return;
        }
    }
}
