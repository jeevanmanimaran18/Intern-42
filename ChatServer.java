import java.io.*;
import java.net.*;

public class ChatServer {

    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("Server started...");

            Socket socket = serverSocket.accept();
            System.out.println("Client connected.");

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);

            BufferedReader input = new BufferedReader(
                    new InputStreamReader(System.in));

            String msg;

            while(true) {
                msg = br.readLine();
                System.out.println("Client: " + msg);

                String reply = input.readLine();
                pw.println(reply);
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
