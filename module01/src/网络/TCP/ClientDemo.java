package 网络.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //Socket socket = new Socket(InetAddress.getByName("TaoPC"),10086);
        Socket socket = new Socket("TaoPC",10086);

        OutputStream out = socket.getOutputStream();
        out.write("1.hello world".getBytes());

        InputStream input = socket.getInputStream();
        byte[] b =new byte[1024];
        int len =input.read(b);
        System.out.println(new String(b,0,len));

        out.write("3.好的，再见".getBytes());

        socket.close();
    }
}
