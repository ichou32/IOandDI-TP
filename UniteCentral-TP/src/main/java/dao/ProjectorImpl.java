package dao;

import org.springframework.stereotype.Component;

@Component("vga")
public class ProjectorImpl implements IVga{
    @Override
    public void print(String message) {
        System.out.println("vedio projector");
    }
}
