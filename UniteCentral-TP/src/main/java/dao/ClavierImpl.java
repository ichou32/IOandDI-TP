package dao;

import org.springframework.stereotype.Component;

@Component("usb")
public class ClavierImpl implements IUsb{
    @Override
    public int read() {
        return 0;
    }
}
