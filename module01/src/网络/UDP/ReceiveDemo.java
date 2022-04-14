package 网络.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(10086);//构造一个数据报套接字并将其绑定到本地主机上的指定端口

        byte[] b =new byte[1024];
        DatagramPacket packet = new DatagramPacket(b,b.length);//不带地址说明是接收包

        while(true) {
            socket.receive(packet);//等待接收

            String s = new String(packet.getData(), 0, packet.getLength());
            System.out.println(s);
        }
        //socket.close();
    }
}
