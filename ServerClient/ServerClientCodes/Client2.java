package ServerClientCodes;
import java.io.*;
import java.net.*;

public class Client2 {
    public static void main(String[] args) throws IOException {
        Socket echoSocket = null;
        PrintWriter out = null;
        BufferedReader in = null;
        String host = "localhost";
        if (args.length > 0)
            host = args[0];
        try {
            echoSocket = new Socket(host, 7777);
            out = new PrintWriter(echoSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(
                    echoSocket.getInputStream()));
        } catch (UnknownHostException e) {
            System.out.println("Don't know about host: " + host);
            System.exit(1);
        } catch (IOException e) {
            System.out.println("Couldn't get I/O for the connection to: " + host);
            System.exit(1);
        }
        System.out.println("after connections");
        BufferedReader stdIn = new BufferedReader(
                new InputStreamReader(System.in));
        String userInput;
        while ((userInput = stdIn.readLine()) != null) {
            out.println(userInput);
            System.out.println("from server: " + in.readLine());
            if (userInput.equals("exit")) //! close connection
                break;
        }
        out.close();
        in.close();
        stdIn.close();
        echoSocket.close();
    }
}