import java.io.*;
import java.net.*;

public class ChatClient {

    public static void main(String[] args) {

        try {
            Socket socket = new Socket("localhost", 5000);

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);

            BufferedReader input = new BufferedReader(
                    new InputStreamReader(System.in));

            String msg;

            while(true) {
                msg = input.readLine();
                pw.println(msg);

                String serverReply = br.readLine();
                System.out.println("Server: " + serverReply);
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
