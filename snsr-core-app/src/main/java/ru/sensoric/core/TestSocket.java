package ru.sensoric.core;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class TestSocket {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost",6666)){
            socket.connect(new InetSocketAddress(6666));
            Scanner scanner = new Scanner(socket.getInputStream());
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
