package dao;

import org.springframework.stereotype.Component;

@Component
public class EcranImpl implements IVga{
    @Override
    public void print(String message) {
        System.out.println("ecran");
    }
}
