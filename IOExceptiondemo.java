import java.io.*;

public class IOExceptiondemo {
    public static void main(String[] args) {
        int i, j = 1, k = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        i = 8;

        try {
            // Close the BufferedReader to simulate an IOException
            br.close();
            
            // Attempt to read from the closed BufferedReader
            j = Integer.parseInt(br.readLine());
            k = i / j;
        } catch (IOException e) {
            System.out.println("IOException occurred: " + e);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException occurred: " + e);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }

        System.out.println(k);
    }
}
