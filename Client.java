import java.net.*;

public class Client {
    public static void main(String[] args) throws Exception {

        Socket socket = new Socket("192.168.1.10", 5000);

        System.out.println("Connected to Server!");

        socket.close();
    }
}