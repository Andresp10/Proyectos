package Controlador;

import Modelo.Afiliado;
import Modelo.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;


public class AfiliadoController {
    
    public int RegistroAfiliado(Afiliado objAfiliado){
        try{
            Session sesion = HibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            sesion.save(objAfiliado);
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
    public int EditarAfiliado(Afiliado objAfiliado){
        try{
        
            Session sesion = HibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            Query editarAfiliado = sesion.createSQLQuery("UPDATE Afiliado SET Documento='"+objAfiliado.getDocumento()+"', Nombre='"+objAfiliado.getNombre()+"', Apellido='"+objAfiliado.getApellido()+"', Genero='"+objAfiliado.getGenero()+"', Departamento='"+objAfiliado.getDepartamento()+"', Ciudad='"+objAfiliado.getCiudad()+"', Direccion='"+objAfiliado.getDireccion()+"', EstadoCivil='"+objAfiliado.getEstadoCivil()+"', Estado='"+objAfiliado.getEstado()+"' WHERE idAfiliado="+objAfiliado.getIdAfiliado()+"");
            editarAfiliado.executeUpdate();
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
    public List<Afiliado> GetAllAfiliados(){
    
        List<Afiliado>listaAfiliados = null;
        try{
        
            Session sesion = HibernateUtil.getSessionFactory().openSession();
            //Query queryAfiliados = sesion.createSQLQuery("SELECT Afiliado.IdAfiliado, Afiliado.Documento,Afiliado.Nombre,Afiliado.Apellido, Afiliado.Ciudad, Poliza.Tipo, Poliza.Valor FROM Afiliado INNER JOIN Poliza ON Afiliado.idAfiliado = Poliza.Afiliado");
            Query queryAfiliados = sesion.createQuery("FROM Afiliado");
            listaAfiliados = queryAfiliados.list();
            sesion.close();
            
        }catch(HibernateException ex){
            System.err.println(ex);
        }catch(Exception ex){
            System.err.println(ex);
        }
        return listaAfiliados;
    }
    
    public List<Object[]> VerPerfilAfiliado(int id){
        List<Object[]>listaAfiliado = null;
        try{
        
            Session sesion = HibernateUtil.getSessionFactory().openSession();
            Query queryAfiliado = sesion.createSQLQuery("SELECT Afiliado.IdAfiliado, Afiliado.Documento,Afiliado.Nombre,Afiliado.Apellido, Afiliado.Ciudad, Poliza.Tipo, Poliza.Valor FROM Afiliado INNER JOIN Poliza ON Afiliado.idAfiliado = Poliza.Afiliado WHERE idAfiliado="+id+"");
            listaAfiliado = queryAfiliado.list();
            
        }catch(HibernateException ex){
            System.err.println(ex);
        }catch(Exception ex){
            System.err.println(ex);
        }
        return listaAfiliado;
    }
    public int BuscarIdAfiliado(String Documento){
        int idAfiliado=0;
        try{
        
            Session sesion = HibernateUtil.getSessionFactory().openSession();
            List<Afiliado>listaAfiliado = sesion.createQuery("FROM Afiliado WHERE Documento = '"+Documento+"'").list();
            for (Afiliado afiliado : listaAfiliado) {
                idAfiliado=afiliado.getIdAfiliado();
            }
            return idAfiliado;
        }catch(HibernateException ex){
            System.out.println(ex);
            return 0;
        }catch(Exception ex){
            System.err.println(ex);
            return 0;
        }
    }
    public List<Afiliado> buscarDatosAfiliado(int idAfiliado){
        List<Afiliado>listaAfiliado = null;
        try{
            Session sesion = HibernateUtil.getSessionFactory().openSession();
            listaAfiliado = sesion.createQuery("FROM Afiliado WHERE idAfiliado="+idAfiliado+"").list();
        }catch(HibernateException ex){
            System.err.println(ex);
        }catch(Exception ex){
            System.err.println(ex);
        }
        return listaAfiliado;
    }
}
