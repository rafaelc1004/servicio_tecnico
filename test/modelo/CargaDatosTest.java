/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package modelo;

import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


/**
 *
 * @author Rafaelito
 */
public class CargaDatosTest {
    
    public CargaDatosTest() {
    }
    
   
    /**
     * Test of cargarDatos method, of class CargaDatos.
     */
    @Test
    public void testCargarDatos() {
        System.out.println("cargarDatos");
        CargaDatos.cargarDatos();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getListaClientes method, of class CargaDatos.
     */
    @Test
    public void testGetListaClientes() {
        System.out.println("getListaClientes");
        List<Clientes> expResult = CargaDatos.getListaClientes();
        List<Clientes> result = CargaDatos.getListaClientes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setListaClientes method, of class CargaDatos.
     */
    @Test
    public void testSetListaClientes() {
        System.out.println("setListaClientes");
        List<Clientes> listaClientes = CargaDatos.getListaClientes();
        CargaDatos instance = new CargaDatos();
        instance.setListaClientes(listaClientes);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getListaEjecutivos method, of class CargaDatos.
     */
    @Test
    public void testGetListaEjecutivos() {
        System.out.println("getListaEjecutivos");
        List<Ejecutivos> expResult = CargaDatos.getListaEjecutivos();
        List<Ejecutivos> result = CargaDatos.getListaEjecutivos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setListaEjecutivos method, of class CargaDatos.
     */
    @Test
    public void testSetListaEjecutivos() {
        System.out.println("setListaEjecutivos");
        List<Ejecutivos> listaEjecutivos = CargaDatos.getListaEjecutivos();
        CargaDatos.setListaEjecutivos(listaEjecutivos);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getListaProductos method, of class CargaDatos.
     */
    @Test
    public void testGetListaProductos() {
        System.out.println("getListaProductos");
        List<Productos> expResult = CargaDatos.getListaProductos();
        List<Productos> result = CargaDatos.getListaProductos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setListaProductos method, of class CargaDatos.
     */
    @Test
    public void testSetListaProductos() {
        System.out.println("setListaProductos");
        List<Productos> listaProductos = CargaDatos.getListaProductos();
        CargaDatos.setListaProductos(listaProductos);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
