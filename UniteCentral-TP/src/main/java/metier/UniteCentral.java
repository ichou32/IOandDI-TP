package metier;

import dao.IUsb;
import dao.IVga;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UniteCentral {
    @Autowired
    @Qualifier("vga")
    private IVga vga;
    @Autowired
    @Qualifier("usb")
    private IUsb usb;
    public int readData(){
        int d= usb.read();
        return d;
    }
    public void printData(String data){
        vga.print(data);
    }
}
