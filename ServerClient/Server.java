import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {
        int serverPort = 80; // Port of the server

        try (ServerSocket serverSocket = new ServerSocket(serverPort)) {
            System.out.println("Server is listening on port " + serverPort);

            while (true) {
                try (Socket clientSocket = serverSocket.accept();
                        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {

                    System.out.println("Client connected: " + clientSocket.getInetAddress());

                    String message;
                    while ((message = in.readLine()) != null) {
                        System.out.println("Received from client: " + message);

                        // Check if the client wants to exit
                        if ("exit".equalsIgnoreCase(message)) {
                            serverSocket.close();
                            // clientSocket.close();
                            break; // Close the socket if "exit" is received
                        }

                        // Send a response to the client
                        String response = "ACK!";
                        out.println(response);

                        System.out.println("Response sent to client");
                    }

                    System.out.println("Client disconnected: " + clientSocket.getInetAddress());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
