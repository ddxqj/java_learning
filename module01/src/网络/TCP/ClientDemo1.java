package 网络.TCP;

import java.io.*;
import java.net.Socket;

public class ClientDemo1 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("TaoPC",10000);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        String line;
        while((line = reader.readLine())!=null){
            if(line.equals("886")) break;
            writer.write(line);
            writer.newLine();
            writer.flush();
        }
        socket.shutdownOutput();
        socket.close();
    }
}
