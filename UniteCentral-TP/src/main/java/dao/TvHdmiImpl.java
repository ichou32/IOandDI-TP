package dao;

import org.springframework.stereotype.Component;

@Component("hdmi")
public class TvHdmiImpl implements IHdmi{
    @Override
    public void print(byte[] data) {
        System.out.println(data);
    }
}
