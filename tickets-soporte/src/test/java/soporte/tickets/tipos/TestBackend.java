/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package soporte.tickets.tipos;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import soporte.tickets.TicketException;

/**
 *
 * @author tarde
 */
@Slf4j
public class TestBackend {
    @Test
    public void test_origen_prioridad1_ruta() throws TicketException{
        TicketFrontend tf = new TicketFrontend("frontend","pago", 1);
        TicketFrontend tf2 = new TicketFrontend("frontend","checkout", 1);
        tf.validar();        
        tf2.validar();

    }
    @Test
    public void test_origen_invalida() throws TicketException{
        String[] origenes = {"backend","bbdd","admin","infra"};
        for(String o: origenes){
            TicketFrontend tf = new TicketFrontend(o,"checkout", 1);
            assertThrowsExactly(TicketException.class, ()->tf.validar());          
        }
    }
    @Test
    public void test_prioridad() throws TicketException{
        TicketFrontend tf = new TicketFrontend("frontend","pago", 2);
        TicketFrontend tf2 = new TicketFrontend("frontend","checkout", 2);
        TicketFrontend tf3 = new TicketFrontend("frontend","checkout", 3);
        assertThrowsExactly(TicketException.class, ()->tf.validar());
        assertThrowsExactly(TicketException.class, ()-> tf2.validar());
        assertThrowsExactly(TicketException.class, ()-> tf3.validar());
    }
    
}
