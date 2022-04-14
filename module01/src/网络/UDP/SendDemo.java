package 网络.UDP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;

public class SendDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket();//构造一个数据报套接字并将其绑定到本地主机上的任何可用端口

        //byte[] buf ="hello world".getBytes();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while((s = reader.readLine())!=null){
            if(s.equals("886")) break;
            byte[] buf =s.getBytes();
            DatagramPacket packet = new DatagramPacket(buf,buf.length,InetAddress.getByName("TaoPC"),10086);//带地址说明是发送包
            socket.send(packet);
        }
        socket.close();
    }
}
