/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Liore
 */
public class TabledutaModelTest {
    
    public TabledutaModelTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getRowCount method, of class TabledutaModel.
     */
    @Test
    public void testGetRowCount() {
        System.out.println("getRowCount");
        List<dutaModel> listUser = null;
        TabledutaModel instance = null;
        int expResult = 0;
        int result = instance.getRowCount(listUser);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColumnCount method, of class TabledutaModel.
     */
    @Test
    public void testGetColumnCount() {
        System.out.println("getColumnCount");
        TabledutaModel instance = null;
        int expResult = 0;
        int result = instance.getColumnCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValueAt method, of class TabledutaModel.
     */
    @Test
    public void testGetValueAt() {
        System.out.println("getValueAt");
        int row = 0;
        int col = 0;
        TabledutaModel instance = null;
        Object expResult = null;
        Object result = instance.getValueAt(row, col);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColumnName method, of class TabledutaModel.
     */
    @Test
    public void testGetColumnName() {
        System.out.println("getColumnName");
        int col = 0;
        TabledutaModel instance = null;
        String expResult = "";
        String result = instance.getColumnName(col);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
