package com.company.Design.singleton;

public class SocketClient {
    private static SocketClient socketClient = null;

    // 싱글턴의 핵심 - 디폴트 생성자를 private로 막는다.
    private SocketClient(){

    }

    // static 메소드를 통해서 instance를 가져가도록 한다.
    public static SocketClient getInstance(){
        if(socketClient == null){
            socketClient = new SocketClient();
        }

        return socketClient;
    }

    public void connect(){
        System.out.println("connect");
    }
}
