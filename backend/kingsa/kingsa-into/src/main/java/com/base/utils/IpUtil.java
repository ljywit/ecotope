package com.base.utils;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/**
 */
public class IpUtil {
    /**
     * 获取本机Ip
     *
     * @return 本机ip
     */
    public static String getIp() {
        Enumeration allNetInterfaces = null;
        try {
            allNetInterfaces = NetworkInterface.getNetworkInterfaces();
        } catch (SocketException e) {
            e.printStackTrace();
        }
        InetAddress ip;
        while (allNetInterfaces.hasMoreElements()) {
            NetworkInterface netInterface = (NetworkInterface) allNetInterfaces.nextElement();
            Enumeration addresses = netInterface.getInetAddresses();
            while (addresses.hasMoreElements()) {
                ip = (InetAddress) addresses.nextElement();
                if (ip != null && !ip.isLoopbackAddress() && ip instanceof Inet4Address) {
                    //  System.out.println("IP = " + ip.getHostAddress());
                    return ip.getHostAddress();
                }
            }
        }
        return null;
    }

    /**
     * 判断ip是否为本机地址
     *
     * @param ip ip
     * @return 结果
     */
    public static boolean isLocal(String ip) {
        if (ip.equals("127.0.0.1")) {
            return true;
        }
        Enumeration allNetInterfaces = null;
        try {
            allNetInterfaces = NetworkInterface.getNetworkInterfaces();
        } catch (SocketException e) {
            e.printStackTrace();
        }
        InetAddress tmpIp;
        while (allNetInterfaces.hasMoreElements()) {
            NetworkInterface netInterface = (NetworkInterface) allNetInterfaces.nextElement();
            Enumeration addresses = netInterface.getInetAddresses();
            while (addresses.hasMoreElements()) {
                tmpIp = (InetAddress) addresses.nextElement();
                if (tmpIp != null) {
                    if (!tmpIp.isLoopbackAddress() && tmpIp instanceof Inet4Address) {
                        //当遍历到的ip与传入的ip相等时，说明为本地ip，返回true
                        if (tmpIp.getHostAddress().equals(ip)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
