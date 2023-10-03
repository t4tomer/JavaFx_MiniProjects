package ServerClientCodes;
import java.net.*;
import java.io.*;

class ProcessThread extends Thread {

    private Socket socket = null;
    PrintWriter out;
    BufferedReader in;

    public ProcessThread(Socket socket) {
        this.socket = socket;
        try {
            out = new PrintWriter(socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(
                    socket.getInputStream()));
        } catch (IOException e) {
            System.out.println("couldn't open I/O on connection");
        }
    }

    public void run() {
        String inputLine;
        try {
            while ((inputLine = in.readLine()) != null) { // read a string from the client
                System.out.println("from client:" + inputLine);// print the message from client
                inputLine = inputLine.trim(); // Trim leading and trailing whitespace

                // Compare inputLine to "aa" using .equals()
                if (inputLine.equals("exit")) {
                    break;
                } else
                    out.println("ACK!!@"); // return the ACK!! to the client
            }
            out.close();
            in.close();
            socket.close();
        } catch (IOException e) {
            System.out.println("couldn't read from connection");
        }
    }
}