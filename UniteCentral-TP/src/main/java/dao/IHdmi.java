package dao;

import org.springframework.stereotype.Component;

@Component("hdmi")
public interface IHdmi {
    void print(byte[] data);
}
