package ServerClientCodes;
//$ to run this server type in the terminal : 
/* 
    1) type: javac ThreadServer.java ProcessThread.java
    2) type: java ThreadServer
    3) then press enter and the server will start
 */
import java.net.*;
import java.io.*;

public class ThreadServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = null;
        boolean listening = true;
        try {
            serverSocket = new ServerSocket(7777);
        } catch (IOException e) {
            System.err.println("Could not listen on port: 7777");
            System.exit(1);
        }
        System.out.println("server ready");
        Socket socket = null;
        while (listening) {
            try {
                socket = serverSocket.accept();
                new ProcessThread(socket).start(); //! start ProcessThread
            } catch (IOException e) {
                System.err.println("Accept failed.");
                System.exit(1);
            }
        }
        serverSocket.close();
    }
}