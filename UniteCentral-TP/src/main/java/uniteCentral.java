import usb.IUsb;
import vga.IVga;

public class uniteCentral {
    private IVga vga;
    private IUsb usb;
    public int readData(){
        int d= usb.read();
        return d;
    }
    public void printData(String data){
        vga.print(data);
    }
}
