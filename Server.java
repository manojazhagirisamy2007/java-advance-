import java.net.*;

public class Server {
    public static void main(String[] args) throws Exception {

        ServerSocket serverSocket = new ServerSocket(5000);

        System.out.println("Server waiting...");

        Socket socket = serverSocket.accept();

        System.out.println("Client connected!");

        socket.close();
        serverSocket.close();
    }
}