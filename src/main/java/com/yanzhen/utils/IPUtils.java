package com.yanzhen.utils;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/**
 * @author 596183363@qq.com
 * @Description:
 * @date 2021/5/1221:54
 */
public class IPUtils {

    /**
     * 获取服务器IP地址
     * @return
     */
    @SuppressWarnings("unchecked")
    public static String  getServerIp(){
        String ipHostAddress = "";
        try {
            Enumeration<NetworkInterface> allNetInterfaces = NetworkInterface.getNetworkInterfaces();
            while (allNetInterfaces.hasMoreElements()) {
                NetworkInterface netInterface = (NetworkInterface) allNetInterfaces.nextElement();
                Enumeration<InetAddress> addresses = netInterface.getInetAddresses();
                while (addresses.hasMoreElements()) {
                    InetAddress ip = (InetAddress) addresses.nextElement();
                    if (ip instanceof Inet4Address
                            && !ip.isLoopbackAddress() //loopback地址即本机地址，IPv4的loopback范围是127.0.0.0 ~ 127.255.255.255
                            && !ip.getHostAddress().contains(":")) {
                        ipHostAddress = ip.getHostAddress();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ipHostAddress;
    }
}
