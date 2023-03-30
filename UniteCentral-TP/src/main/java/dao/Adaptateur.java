package dao;

import dao.IHdmi;
import dao.IVga;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Adaptateur implements IVga {
    @Autowired
    @Qualifier("hdmi")
    private IHdmi hdmi;
    @Override
    public void print(String message) {
        byte[] b = message.getBytes();
        hdmi.print(b);
    }
}
