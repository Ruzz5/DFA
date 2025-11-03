package Automata;

import java.util.Scanner;

public class DFA{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Input: ");
            String s = sc.nextLine();

            if (!s.matches("[01]+")) {
                System.out.println("Output: Invalid input\n");
                continue;
            }

            int state = 0; // start state

            for (char c : s.toCharArray()) {
                if (state == 0) // q0
                	state = (c == '0') ? 1 : 0;
                else if (state == 1) // q1
                	state = (c == '0') ? 1 : 2; 
                else if  (state == 2)// q2
                   state = (c == '0') ? 1 : 0; 
            }

            if (state == 2)
                System.out.println("Output: Accepted\n");
            else
                System.out.println("Output: Rejected\n");
        }
    }
}
