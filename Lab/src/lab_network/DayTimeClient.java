package lab_network;

import java.io.*;
import java.net.*;

public class DayTimeClient {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("192.168.1.35", 5050);
            InputStream in = s.getInputStream();
            DataInputStream din = new DataInputStream(in);
            System.out.println(din.readUTF());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
