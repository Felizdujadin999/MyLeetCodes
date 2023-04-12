package ChapterFifteen;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Assignment {
    private Socket socket = null;
    private ServerSocket serverSocket = null;
    private DataInputStream dataInputStream = null;

    public Assignment(int portNumber) {
        try {
            serverSocket = new ServerSocket(portNumber);
            System.out.println("Server on...");
            socket = serverSocket.accept();
            System.out.println("Request Accepted...");
            dataInputStream = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
            String line = "";
            while (!line.equals("Over")){
                line = dataInputStream.readUTF();
                System.out.println(line);
                socket.close();
                dataInputStream.close();
                System.out.println("closed");
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Assignment assignment = new Assignment(5000);
    }

}
