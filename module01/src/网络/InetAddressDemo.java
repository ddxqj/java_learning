package 网络;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("TaoPC");

        System.out.println(address.getHostName());
        System.out.println(address.getHostAddress());
    }
}
