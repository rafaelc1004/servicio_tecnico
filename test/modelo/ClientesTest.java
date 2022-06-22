/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rafaelito
 */
public class ClientesTest {
    
    public ClientesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
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

    /**
     * Test of getId method, of class Clientes.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Clientes instance = null;
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Clientes.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Clientes instance = null;
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getRut method, of class Clientes.
     */
    @Test
    public void testGetRut() {
        System.out.println("getRut");
        Clientes instance = null;
        String expResult = "";
        String result = instance.getRut();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setRut method, of class Clientes.
     */
    @Test
    public void testSetRut() {
        System.out.println("setRut");
        String rut = "";
        Clientes instance = null;
        instance.setRut(rut);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Clientes.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Clientes instance = null;
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Clientes.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Clientes instance = null;
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTelefono method, of class Clientes.
     */
    @Test
    public void testGetTelefono() {
        System.out.println("getTelefono");
        Clientes instance = null;
        String expResult = "";
        String result = instance.getTelefono();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTelefono method, of class Clientes.
     */
    @Test
    public void testSetTelefono() {
        System.out.println("setTelefono");
        String telefono = "";
        Clientes instance = null;
        instance.setTelefono(telefono);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCorreoElectronico method, of class Clientes.
     */
    @Test
    public void testGetCorreoElectronico() {
        System.out.println("getCorreoElectronico");
        Clientes instance = null;
        String expResult = "";
        String result = instance.getCorreoElectronico();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCorreoElectronico method, of class Clientes.
     */
    @Test
    public void testSetCorreoElectronico() {
        System.out.println("setCorreoElectronico");
        String correoElectronico = "";
        Clientes instance = null;
        instance.setCorreoElectronico(correoElectronico);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
