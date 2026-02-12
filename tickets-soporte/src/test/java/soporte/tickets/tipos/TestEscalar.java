/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package soporte.tickets.tipos;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import soporte.tickets.Ticket;
import soporte.tickets.TicketException;

/**
 *
 * @author tarde
 */
@Slf4j
public class TestEscalar {

    public static Ticket[] ticket = new Ticket[2];

    public TestEscalar() {
    }

    @BeforeAll
    public static void setUpClass() {
        ticket[0] = new TicketBackend();
        ticket[1] = new TicketFrontend();
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

    @Test
    public void validar_escalar_invalida() throws TicketException {
        for (Ticket t : ticket) {
            if (t instanceof TicketBackend b) {
                b.setResulto(true);
                assertThrows(TicketException.class, () -> b.escalar(), "Error Backend: ");
            }
            if (t instanceof TicketFrontend f) {
                f.setResulto(true);
                assertThrows(TicketException.class, () -> f.escalar(),"Error Frontend: ");
            }
            
            if (t instanceof TicketBackend b) {
                b.setResulto(false);
               b.escalar();
            }
            if (t instanceof TicketFrontend f) {
                f.setResulto(false);
                f.escalar();
            }
            
        }

    }

   
}
