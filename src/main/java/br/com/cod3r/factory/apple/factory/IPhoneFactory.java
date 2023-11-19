package br.com.cod3r.factory.apple.factory;


import br.com.cod3r.factory.apple.model.*;

import java.util.Objects;

public abstract class IPhoneFactory {

    public static IPhone getIphone(String model, String level){
        IPhone device = null;

        if ("X".equalsIgnoreCase(model)){
            if ("standard".equalsIgnoreCase(level)) {
                device = new IPhoneX();
            }
            if ("hightEnd".equalsIgnoreCase(level)) {
                device = new IPhoneXSMax();
            }
        }
        if ("11".equalsIgnoreCase(model)){
            if ("standard".equalsIgnoreCase(level)) {
                device = new IPhone11();
            }
            if ("highEnd".equalsIgnoreCase(level)) {
                device = new IPhone11Pro();
            }
        }

        if (Objects.nonNull(device)) {
            device.getHardware();
            device.assemble();
            device.certificates();
            device.pack();
        }
        return device;
    }
}
