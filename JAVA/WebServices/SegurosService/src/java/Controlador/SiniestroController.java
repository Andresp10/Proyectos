package Controlador;

import Modelo.HibernateUtil;
import Modelo.Siniestro;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;


public class SiniestroController {
 
    public int RegistroSiniestro(Siniestro objSiniestro){
    
        try{
            Session sesion = HibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            sesion.save(objSiniestro);
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
    public List<Siniestro> BuscarSiniestro(int idAfiliado){
        List<Siniestro>listaSiniestro = null;
        try{
        
            Session sesion = HibernateUtil.getSessionFactory().openSession();
            listaSiniestro = sesion.createQuery("FROM Siniestro WHERE Afiliado="+idAfiliado+"").list();
            
        }catch(HibernateException ex){
            System.err.println(ex);
        }catch(Exception ex){
            System.err.println(ex);
        }
        return listaSiniestro;
    }
    public List<Siniestro> SiniestroAll(){
        List<Siniestro>listaSiniestro = null;
        try{
        
            Session sesion = HibernateUtil.getSessionFactory().openSession();
            listaSiniestro = sesion.createQuery("FROM Siniestro").list();
            
        }catch(HibernateException ex){
            System.err.println(ex);
        }catch(Exception ex){
            System.err.println(ex);
        }
        return listaSiniestro;
    }
    public int SiniestroEditar(Siniestro objSiniestro){
        try{
            Session sesion = HibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            Query queryEditarSiniestro = sesion.createSQLQuery("UPDATE Siniestro SET Tipo='"+objSiniestro.getTipo()+"' WHERE Afiliado = "+objSiniestro.getAfiliado()+"");
            queryEditarSiniestro.executeUpdate();
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
