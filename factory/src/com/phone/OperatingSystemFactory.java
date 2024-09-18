package com.phone;

public class OperatingSystemFactory {

    public OperatingSystem getInstance(String string){
        if (string.equals("Open"))
            return new Android();
        else if (string.equals("Closed"))
            return new IOS();
        else
            return new  Windows();

    }
}
