package com.company.design;

import com.company.design.adapter.Cleaner;
import com.company.design.adapter.Electronic110V;
import com.company.design.adapter.HairDryer;
import com.company.design.adapter.SocketAdapter;
import com.company.design.singleton.AClazz;
import com.company.design.singleton.BCalzz;
import com.company.design.singleton.SocketClient;

public class Main {

    public static void main(String[] args) {
	// write your code here
        AClazz aClazz = new AClazz();
        BCalzz bCalzz = new BCalzz();

        SocketClient aClient = aClazz.getSocketClient();
        SocketClient bClient = bCalzz.getSocketClient();

        System.out.println("두 객체가 같은가 > " + (aClient.equals(bClient) ? "같음" : "다름"));

        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        Cleaner cleaner = new Cleaner();
//        connect(cleaner);

        Electronic110V adaptor = new SocketAdapter(cleaner);
        connect(adaptor);
    }
    //콘센트
    public static void connect(Electronic110V electronic110V){
        electronic110V.powerOn();
    }
}
