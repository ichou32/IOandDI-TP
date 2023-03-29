package bdcc.jee.dao;

import org.springframework.stereotype.Component;

import java.util.Date;
@Component
public class IDaoImpl implements IDao{
    @Override
    public Date getDate() {
        Date date = new Date();
        System.out.println("current date: "+date);
        return date;
    }
}
