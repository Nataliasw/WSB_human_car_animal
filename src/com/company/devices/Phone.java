package com.company.devices;

import com.company.Sellable;
import com.company.creatures.Human;
import org.jetbrains.annotations.NotNull;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Phone extends Device implements Rechargeable, Sellable {

    public Double screenSize;
    public String os;
    static final String DEFAULT_APP_VERSION  = "latest";
    static final String DEFAULT_SERVER = "play.store.com";


    public Phone(String producer, String model, int yearOfProduction, double value) {
        super(producer, model, yearOfProduction, value);
    }

    @Override
    public void turnOn() {
        System.out.println("telefon wlaczony");
    }


    @Override
    public void recharge() {
        System.out.println("znajdz ladowarke");
        System.out.println("znajdz wolne gniazdko");
        System.out.println("laduje");
        System.out.println("naladowane");
    }


    public void sell(@NotNull Human seller, Human buyer, Double price) throws Exception {
        if(seller.mobile != this){
            throw new Exception("Sprzedawca nie ma telefonu");

        }
        if(buyer.cash < price){
            throw new Exception("Kupujący nie ma kasy");
        }
        seller.cash += price;
        buyer.cash -= price;
        buyer.mobile = this;
        seller.mobile=null;
        System.out.println("transakcja przebiegla pomyslnie");
    }

    public void installAnApp(String name, String version, String server){
        try{
        URL url = new URL("https",server,443,name+ "="+version);
        this.installAnApp(url);}
        catch(MalformedURLException e){
            e.printStackTrace();
        }

    }

    public void installAnApp(List<String> appNames){
    for(String appName: appNames){
        installAnApp(appName);
    }

    }


    public void installAnApp(String name, String version){
        this.installAnApp(name,version,DEFAULT_SERVER);


    }


    public void installAnApp(String name){
        this.installAnApp(name,DEFAULT_APP_VERSION);

    }

    public void installAnApp(URL url){
        System.out.println("Aplikacja " + url.getHost() + " o wersji "+ url.getFile() + " na serwerze "+ url.getPath()+" zainstalowana");

    }

    @Override
    public String toString(){  return "This is to string for phone";};

}
