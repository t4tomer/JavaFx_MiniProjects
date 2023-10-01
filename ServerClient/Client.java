import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        String serverAddress = "127.0.0.1"; // IP address of the server
        int serverPort = 80; // Port of the server

        try (Socket socket = new Socket(serverAddress, serverPort);
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                Scanner scanner = new Scanner(System.in)) {

            System.out.println("Connected to server");

            while (true) {
                System.out.print("Enter a message (or 'exit' to quit): ");
                String message = scanner.nextLine();

                // Send the message to the server
                out.println(message);

                // Receive and display the server's response
                String response = in.readLine();
                System.out.println("Server response: " + response);

                if ("exit".equalsIgnoreCase(message)) {
                    break; // Exit the loop if the user sends 'exit'
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
