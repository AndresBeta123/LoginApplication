/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import Entidad.*;
import Frontera.*;
/**
 *
 * @author Estudiante
 */
public class ValidarRegistro {

    public ValidarRegistro() {
        
    }
    
    
    public String validarDatos(Usuario usuario,Usuario contraseñas){
    if(!verificarLongitudNombre(usuario.getNombre())){
            return("Longitud nombre incorrecta");
        }
    if(!verificarLongitudPassword(usuario.getPassword())){
            return("Longitud contraseña incorrecta");
        }
    if(contraseñas.getNombre().equals(contraseñas.getPassword())){
            return("Registro con existo");
    }  
    
    return ("Las contraseñas no coinciden");
    }
    
    public boolean verificarLongitudNombre(String nombre){
       return(nombre.length() >1 && nombre.length() <=6);
    }
    
    public boolean verificarLongitudPassword(String password){
       return(password.length()>=3 && password.length()<6);
    }
    
    public boolean confirmarValidacion(Usuario usuario,Usuario contraseñas){
            if(!verificarLongitudNombre(usuario.getNombre())){
            return(false);
        }
    if(!verificarLongitudPassword(usuario.getPassword())){
            return(false);
        }
    if(contraseñas.getNombre().equals(contraseñas.getPassword())){
            return(true);
    }  
    
    return (false);
    }
    
}
