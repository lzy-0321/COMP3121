import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class ps1 {
    // Exercise 1. Let A be an array with n−1 elements, containing all integers from 1 to n except for one.
    // Design an O(n) algorithm that finds the missing integer.

    // public static void main(String[] args) {
    //     int[] A = {1, 2, 3, 4, 5, 7, 8, 9, 10};
    //     int n = A.length + 1;
    //     int sum = 0;
    //     for (int i = 0; i < A.length; i++) {
    //         sum += A[i];
    //     }
    //     int sum2 = (n * (n + 1)) / 2;
    //     System.out.println(sum2 - sum);
    // }

    // Exercise 2. Let A be an array with n elements. We say that A is palindromic if it can be read the same forwards
    // and backwards. For example, the array A = [1, 2, 3, 2, 1] is palindromic while B = [1, 2, 3, 4, 2, 1] is not. Design an O(n)
    // algorithm that determines whether A is a palindromic array.

    // public static void main(String[] args) {
    //     int[] A = {1, 2, 3, 2, 1};
    //     int[] B = {1, 2, 3, 4, 2, 1};
    //     for (int i = 0; i < A.length / 2; i++) {
    //         if (A[i] != A[A.length - 1 - i]) {
    //             System.out.println("A is not palindromic");
    //             return;
    //         }
    //     }
    //     System.out.println("A is palindromic");

    //     for (int i = 0; i < B.length / 2; i++) {
    //         if (B[i] != B[B.length - 1 - i]) {
    //             System.out.println("B is not palindromic");
    //             return;
    //         }
    //     }
    //     System.out.println("B is palindromic");
    // }

    // Exercise 3. Let A be an array with n distinct integers. You have to determine if there exist an integer (not
    // necessarily in A) which can be written as a sum of squares of two distinct integers from A in two different ways. Note
    // that A[i]^2 + A[j]^2 is treated the same as A[j]^2 + A[i]^2.
    // For example, if A = [1, 8, 9, 12], then the integer 145 can be written as 1^2 + 12^2 and also 8^2 + 9^2.
    // (a) Design an O(n^2 * logn) algorithm that determines if such an integer exists in the worst case.
    // (b) Design an algorithm that solves the same problem and runs in O(n^2) in the expected case.

    // (a)
    // public static void main(String[] args) {
    //     int[] A = {1, 8, 9, 12};
    //     int n = A.length;
    //     int[] B = new int[n * (n - 1) / 2];
    //     int k = 0;
    //     for (int i = 0; i < A.length; i++) {
    //         for (int j = i+1; j < A.length; j++) {
    //             B[k] = A[i] * A[i] + A[j] * A[j];
    //             k++;
    //         }
    //     }
    //     for (int i = 0; i < B.length; i++) {
    //         System.out.println(B[i]);
    //     }
    //     System.out.println("-----");
    //     for (int i = 0; i < B.length-1; i++) {
    //         if (B[i] == B[i+1]) {
    //             System.out.println("Yes");
    //             return;
    //         }
    //     }
    //     System.out.println("No");
    // }

    // (b)
    // public static void main(String[] args) {
    //     int[] A = {1, 8, 9, 12};
    //     List<Integer> B = new ArrayList<>();
    //     for (int i = 0; i < A.length; i++) {
    //         for (int j = i+1; j < A.length; j++) {
    //             int sum = A[i] * A[i] + A[j] * A[j];
    //             if (B.contains(sum)) {
    //                 System.out.println("Yes");
    //                 return;
    //             }
    //             B.add(sum);
    //         }
    //     }
    //     System.out.println("No");
    // }

    // Exercise 4. Let A be an array with n integers, and let k be a positive integer. You have to determine if there
    // exist two integers in A whose absolute difference is exactly k. In other words, you want to determine if there exist
    // distinct indices i, j such that |A[i] − A[j]| = k.
    // (a) Design an O(n log n) algorithm that determines if two such integers in A exist.
    // (b) Design an algorithm that solves the same problem and runs in O(n) in the expected case.

    // (a)
    // public static void main(String[] args) {
    //     int[] A = {1, 8, 9, 12};
    //     int k = 4;
    //     for (int i = 0; i < A.length; i++) {
    //         for (int j = i; j < A.length; j++) {
    //             if (k == Math.abs(A[i] - A[j])) {
    //                 System.out.println("Yes");
    //                 return;
    //             }
    //         }
    //     }
    //     System.out.println("No");
    // }

    // (b)
    // public static void main(String[] args) {
    //     int[] A = {1, 8, 9, 12};
    //     int k = 4;
    //     List<Integer> set = new ArrayList<>();
    //     for (int num : A) {
    //         if (set.contains(num - k) || set.contains(num + k) ) {
    //             System.out.println("Yes");
    //             return;
    //         }
    //         set.add(num);
    //     }
    //     System.out.println("No");
    // }

    // Exercise 5. Let L be a linked list with n nodes. We say that L is cyclic if there is a node that can be reached
    // again by continuously following the next node.
    // For example, the linked list visualised as
    // a -> b -> c -> d , d -> b
    // a -> b -> c -> d
    //      ↖ - - - ↙
    // is cyclic because node b can be reached again from d. Design an O(n) algorithm that determines whether a linked list
    // is cyclic.

    // ps1 next;

    // ps1() {
    //     next = null;
    // }
    // public static void main(String[] args) {
    //     ps1 a = new ps1();
    //     ps1 b = new ps1();
    //     ps1 c = new ps1();
    //     ps1 d = new ps1();
    //     a.next = b;
    //     b.next = c;
    //     c.next = d;
    //     d.next = b;
    //     ps1 head = a;
    //     ps1 slow = head;
    //     ps1 fast = head.next;
    //     while (slow.next != null && fast.next != null && fast.next.next != null) {
    //         if (slow == fast) {
    //             System.out.println("Yes");
    //             return;
    //         }
    //         slow = slow.next;
    //         fast = fast.next.next;
    //     }
    //     System.out.println("No");
    // }

    // Exercise 6. You are at a party attended by n people (not including yourself), and you suspect that there might be a celebrity present. A celebrity is someone known by everyone, but who does not know anyone else present. Your task is to work out if there is a celebrity present, and if so, which of the n people present is a celebrity. To do so, you can ask a person X if they know another person Y (where you choose X and Y when asking the question).
    // (a) Show that there can be at most one celebrity. In other words, if a celebrity exists, then the celebrity is unique.
    // (b) Use the previous part to show that your task can always be accomplished by asking no more than 3n − 3 such questions.
    // (c) Show that your task can always be accomplished by asking no more than 3n − ⌊log2 n⌋ − 3 such questions.
}
