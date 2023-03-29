package bdcc.jee.metier;

import bdcc.jee.dao.IDao;
import bdcc.jee.dao.IDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class IMetierImpl implements IMetier{
    // couplage faible
    @Autowired
    private IDao iDao;
    @Override
    public double calcul() {
        double age = (iDao.getDate().getYear() + 1900) - 2000;
        return age;
    }

    //setter pour l'injection des dependences
    public void setDao(IDao iDao) {
        this.iDao = iDao;
    }
}
