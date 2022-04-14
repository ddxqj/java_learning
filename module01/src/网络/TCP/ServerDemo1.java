package 网络.TCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo1 {
    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(10000);
        Socket accept = socket.accept();

        BufferedReader reader = new BufferedReader(new InputStreamReader(accept.getInputStream()));
        BufferedWriter writer = new BufferedWriter(new FileWriter("test.txt"));
        String line;
        while((line = reader.readLine())!= null){
            System.out.println(line);
            writer.write(line);
            writer.newLine();
            writer.flush();
        }
        writer.close();
        socket.close();
    }
}
