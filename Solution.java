import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minimumNumber function below.
    static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        char[] pass=password.toCharArray();
        if(pass.length<6){return(6-pass.length);}
        int [] flag=new int[4];
        int count=0;
        for(int i=0;i<pass.length;i++)
        {
            if(Character.isUpperCase(pass[i])){flag[0]=0;}
            if(Character.isLowerCase(pass[i])){flag[1]=0;}
            if(password.matches("[a-zA-Z0-9]+")){flag[2]=0;}
            if(Character.isDigit(pass[i])){flag[3]=0;}
        }
        for(int i=0;i<4;i++)
        {
            if(flag[i]==0){count++;}
        }
        return (6-count);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String password = scanner.nextLine();

        int answer = minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
