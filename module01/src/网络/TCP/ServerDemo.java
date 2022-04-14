package 网络.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(10086);
        Socket accept = socket.accept();
        InputStream input = accept.getInputStream();//在这里等待接收

        byte[] b =new byte[1024];
        int len = input.read(b);
        System.out.println(new String(b,0,len));

        OutputStream out = accept.getOutputStream();
        out.write("2.我已经成功接收".getBytes());

        int len1 = input.read(b);
        System.out.println(new String(b,0,len1));

        socket.close();
    }
}
