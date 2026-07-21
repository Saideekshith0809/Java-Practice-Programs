import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Solution {
    public int solve(int A) {
        String binary = Integer.toBinaryString(A);
        String flipped = "";

        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '0') {
                flipped += '1';
            } else {
                flipped += '0';
            }
        }

        return Integer.parseInt(flipped, 2);
    }
}
