package com.company.design.singleton;

public class BCalzz {

    private SocketClient socketClient;

    public BCalzz(){
        this.socketClient = SocketClient.getInstance();
    }

    public SocketClient getSocketClient(){
        return socketClient;
    }
}
