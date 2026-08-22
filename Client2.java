import java.net.*;
import java.io.*;
import java.util.*;

class Client2 {
    public static void main(String[] args) throws Exception {

        // Server laptop IP address
        Socket s = new Socket("192.168.1.10", 5000);

        Scanner sc = new Scanner(System.in);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(s.getInputStream()));

        PrintWriter out = new PrintWriter(
                s.getOutputStream(), true);

        while (true) {

            // Receive Server message
            String msg = in.readLine();

            if (msg == null)
                break;

            System.out.println("Server: " + msg);

            if (msg.equalsIgnoreCase("bye"))
                break;

            // Client replies
            System.out.print("Client: ");
            String reply = sc.nextLine();

            out.println(reply);

            if (reply.equalsIgnoreCase("bye"))
                break;
        }

        in.close();
        out.close();
        s.close();
        sc.close();
    }
}