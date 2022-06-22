/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package modelo;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


/**
 *
 * @author Rafaelito
 */
public class ProductosTest {
    
    public ProductosTest() {
    }


    /**
     * Test of getId method, of class Productos.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Productos instance = null;
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Productos.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Productos instance = null;
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNombreProducto method, of class Productos.
     */
    @Test
    public void testGetNombreProducto() {
        System.out.println("getNombreProducto");
        Productos instance = null;
        String expResult = "Fibra 600";
        String result = instance.getNombreProducto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNombreProducto method, of class Productos.
     */
    @Test
    public void testSetNombreProducto() {
        System.out.println("setNombreProducto");
        String nombreProducto = "Fibra200";
        Productos instance = new Productos();
        instance.setNombreProducto(nombreProducto);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
