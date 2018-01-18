package Controlador;

import Modelo.Funcionario;
import Modelo.HibernateUtil;
import com.google.gson.Gson;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;


public class FuncionarioController {
    
    public String Login(Funcionario objFuncionario){
        
        try{
            String datosRetornados="";
            Session sesion = HibernateUtil.getSessionFactory().openSession();
            Query queryUsuario = sesion.createQuery("FROM Funcionario WHERE Usuario='"+objFuncionario.getUsuario()+"' AND Contrasenia='"+objFuncionario.getContrasenia()+"'");
            List<Funcionario>listaFuncionario=queryUsuario.list();
            if (listaFuncionario.size() == 1) {
            
                for(Funcionario funcionario : listaFuncionario){
                
                    datosRetornados = "200/true/"+funcionario.getTipo()+"";
                }
                
            }else{
                datosRetornados = "200/false/Nada";
            }
            return datosRetornados;
            
        }catch(HibernateException ex){
            System.err.println(ex);
            return "500";
        }catch(Exception ex){
            System.err.println(ex);
            return "500";
        }
       
    }
    public int RegistroFuncionario(Funcionario objFunacionario){
        try{
        
            Session sesion = HibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            sesion.save(objFunacionario);
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
    public List<Funcionario> GetAllFuncionario(){
        
        List<Funcionario>listaFuncionario = null;
        try{
            Session sesion = HibernateUtil.getSessionFactory().openSession();
            listaFuncionario = sesion.createQuery("FROM Funcionario").list();
            sesion.close();
        }catch(HibernateException ex){
            System.err.println(ex);
        }catch(Exception ex){
            System.err.println(ex);
        }
        return listaFuncionario;
    }
    public List<Funcionario> getDatosFuncionario(String Usuario, String Contrasenia){
        List<Funcionario> listaFuncionario = null;
        try{
            Session sesion = HibernateUtil.getSessionFactory().openSession();
            listaFuncionario = sesion.createQuery("FROM Funcionario WHERE Usuario='"+Usuario+"' AND Contrasenia='"+Contrasenia+"'").list();
            sesion.close();
        }catch(HibernateException ex){
            System.err.println(ex);
        }catch(Exception ex){
            System.err.println(ex);
        }
        return listaFuncionario;
    }
    
}
