
package Controlador;

import Modelo.HibernateUtil;
import Modelo.Poliza;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;


public class PolizaController {
 
    public int RegistroPoliza(Poliza objPoliza){
        try{
            Session sesion = HibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            sesion.save(objPoliza);
            sesion.getTransaction().commit();
            sesion.close();
            return 201;
        }catch(HibernateException ex){
            System.err.println(ex);
            return 500;
        }catch(Exception ex){
            System.err.println(ex);
            return 500;
        }
    }
    public List<Poliza>BuscarPoliza(int idAfiliado){
        List<Poliza>listaPoliza = null;
        try{
            Session sesion = HibernateUtil.getSessionFactory().openSession();
            listaPoliza = sesion.createQuery("FROM Poliza WHERE Afiliado="+idAfiliado+"").list();
            return listaPoliza;
        }catch(HibernateException ex){
            System.err.println(ex);
            return listaPoliza;
        }catch(Exception ex){
            System.err.println(ex);
            return listaPoliza;
        }
    }
    public int PolizaEditar(Poliza objPoliza){
        try{
            Session sesion = HibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            Query queryEditarPoliza = sesion.createSQLQuery("UPDATE Poliza SET Tipo='"+objPoliza.getTipo()+"', Valor="+objPoliza.getValor()+" WHERE Afiliado="+objPoliza.getAfiliado()+"");
            queryEditarPoliza.executeUpdate();
            sesion.getTransaction().commit();
            sesion.close();
            return 200;
        }catch(HibernateException ex){
            System.err.println(ex);
            return 500;
        }catch(Exception ex){
            System.err.println(ex);
            return 500;
        }
    }
}
