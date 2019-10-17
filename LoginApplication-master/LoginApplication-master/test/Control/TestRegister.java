/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import Frontera.*;
import Entidad.*;
/**
 *
 * @author andre
 */
public class TestRegister {
    
    public TestRegister() {
    }
     public static ValidarRegistro validarRegistro = new ValidarRegistro();
    //Long=L
    //Name=N
    //Password=P
    //Incorrecta=I
    private String L_N_I = "Longitud nombre incorrecta";
    private String L_P_I = "Longitud contraseña incorrecta";
    private String L_C_N_C = "Las contraseñas no coinciden";
    private String R_E = "Registro con exito";    
    private String U_R = "Usuario Repetido";
    @BeforeClass
    public static void setUpClass() {
    Sistema sistema = FramePrincipal.sistema;
     ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        Usuario a = new Usuario();
        Usuario b = new Usuario();
        Usuario c = new Usuario();
        
        a.setNombre("Juan");
        a.setPassword("1234");
        b.setNombre("Pedro");
        b.setPassword("123");
        c.setNombre("Maria");
        c.setPassword("12345");
        
        usuarios.add(a);
        usuarios.add(b);
        usuarios.add(c);
        
        sistema.setUsuarios(usuarios);
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() 
    @Test
     public void testLongitudNombre() {
     Usuario u = new Usuario();
     Usuario c = new Usuario();
     u.setNombre("a");
     u.setPassword("123456");
     c.setNombre("123456");
     c.setPassword("123456");
     assertEquals(validarRegistro.validarDatos(u,c),L_N_I);
     
     u.setNombre("andresf");
     u.setPassword("123456");
     c.setNombre("123456");
     c.setPassword("123456");
     assertEquals(validarRegistro.validarDatos(u,c),L_N_I);
     }
     
    @Test
     public void testLongitudContrasenia() {
     Usuario u = new Usuario();
     Usuario c = new Usuario();
     u.setNombre("pepe");
     u.setPassword("12");
     c.setNombre("12");
     c.setPassword("12");
     assertEquals(validarRegistro.validarDatos(u,c),L_P_I);
     
     u.setNombre("pepe");
     u.setPassword("123456");
     c.setNombre("123456");
     c.setPassword("123456");
     assertEquals(validarRegistro.validarDatos(u,c),L_P_I);
     }
     
    @Test
     public void testContraseniaCoinciden() {
     Usuario u = new Usuario();
     Usuario c = new Usuario();
     u.setNombre("pepe");
     u.setPassword("12345");
     c.setNombre("12345");
     c.setPassword("123");
     assertEquals(validarRegistro.validarDatos(u,c),L_C_N_C);
     
     u.setNombre("pepe");
     u.setPassword("123");
     c.setNombre("123");
     c.setPassword("12345");
     assertEquals(validarRegistro.validarDatos(u,c),L_C_N_C);
     }
     
     
     
     @Test
     public void testUsuarioRepetido() {
     Usuario u = new Usuario();
     Usuario c = new Usuario();
     u.setNombre("Maria");
     u.setPassword("123");
     c.setNombre("123");
     c.setPassword("123");
     assertEquals(validarRegistro.validarDatos(u,c),U_R);
     
     }
     
     
     @Test
     public void testTodoCorrecto() {
     Usuario u = new Usuario();
     Usuario c = new Usuario();
     u.setNombre("pepe");
     u.setPassword("123");
     c.setNombre("123");
     c.setPassword("123");
     assertEquals(validarRegistro.validarDatos(u,c),R_E);
     
     }
     
     
}
