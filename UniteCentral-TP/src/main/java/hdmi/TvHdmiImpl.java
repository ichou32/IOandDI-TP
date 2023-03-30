package hdmi;

public class TvHdmiImpl implements IHdmi{
    @Override
    public void print(byte[] data) {
        System.out.println(data);
    }
}
