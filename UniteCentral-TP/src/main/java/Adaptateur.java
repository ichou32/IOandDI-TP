import hdmi.IHdmi;
import vga.IVga;

public class Adaptateur implements IVga {
    private IHdmi hdmi;
    @Override
    public void print(String message) {
        byte[] b = message.getBytes();
        hdmi.print(b);
    }
}
