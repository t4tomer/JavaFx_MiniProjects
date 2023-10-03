package ServerClientCodes;
import java.net.*;
import java.io.*;

public class Server2 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(7777);
        } catch (IOException e) {
            System.err.println("Could not listen on port: 7777");
            System.exit(1);
        }
        System.out.println("server ready");
        Socket socket = null;
        try {
            socket = serverSocket.accept();
        } catch (IOException e) {
            System.err.println("Accept failed.");
            System.exit(1);
        }
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(
                socket.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) { // read a string from the client
            System.out.println("from client:" + inputLine);//print the message from client
            out.println("ACK!!"); // return the ACK!! to the client
        }
        out.close();
        in.close();
        socket.close();
        serverSocket.close();
    }
}