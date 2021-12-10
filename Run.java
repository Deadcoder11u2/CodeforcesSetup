import java.util.*;
import java.io.*;


public class Run {
    public static void main(String args[]) throws Exception {
        try {
            String command1 = "javac " + args[0] + ".java";
            System.out.println(command1);
            Process p2 = Runtime.getRuntime().exec(command1);
            Thread.sleep(1500);
            String command2 = "java " + args[0] + " " + args[0] + "in.txt " + " " + args[0] + "out.txt";
            System.out.println(command2);
            Process p1 = Runtime.getRuntime().exec(command2);
            Thread.sleep(500);
            BufferedReader br = new BufferedReader(new InputStreamReader(p2.getErrorStream()));
            String line = br.readLine();
            if (line != null) {
                System.out.println("Found Error In Your Program");
                while (line != null) {
                    System.out.println(line);
                    line = br.readLine();
                }
            }
            br = new BufferedReader(new FileReader("output.txt"));
            line = br.readLine();
            BufferedReader ans = new BufferedReader(new FileReader(args[0] + "out.txt"));
            boolean passed = true;
            ans.readLine();
            ans.readLine();
            if(line == null) {
                System.out.println("Your Code is not printing anything");
                return;
            }
            String answer = ans.readLine();
            while (line != null && answer != null) {
                System.out.println("\"" + answer + "\"" + " " + "\"" + line + "\"");
                passed &= answer.equals(line);
                if (!answer.equals(line)) {
                    System.out.println("Expected ->" + "\"" + answer + "\"" + " Found ->" + "\"" + line + "\"");
                }
                line = br.readLine();
                answer = ans.readLine();
                System.out.println();
            }
            if (passed) {
                System.out.println("Safe To Submit");
            } else {
                System.out.println("Wrong answer Read the trace above");
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
