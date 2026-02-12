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
    public void validar_origen_invalida() throws TicketException {
        TicketBackend bt = new TicketBackend("frontend", 2);
        TicketBackend bt2 = new TicketBackend("admin", 1);
        assertThrows(TicketException.class, () -> bt.validar());
        assertThrows(TicketException.class, () -> bt2.validar());
    }

    @Test
    public void validar_origen() throws TicketException {
        String[] origenes = {"backend", "bbdd", "infra"};
        for (String o : origenes) {
            TicketBackend bf = new TicketBackend(o, 2);
            bf.validar();
        }
    }

    @Test
    public void validar_prioridad_1() throws TicketException {
        TicketBackend bf = new TicketBackend("bbdd", 1);
        bf.validar();
    }

    @Test
    public void validar_prioridadConOrigen_invalidas() throws TicketException {
        TicketBackend bt = new TicketBackend("backend", 1);
        TicketBackend bt2 = new TicketBackend("infra", 1);
        assertThrows(TicketException.class, () -> bt.validar());
        assertThrows(TicketException.class, () -> bt2.validar());
    }

    @Test
    public void validar_prioridad_3_invalidas() throws TicketException {
        TicketBackend bt3 = new TicketBackend("infra", 3);
        assertThrows(TicketException.class, () -> bt3.validar());
    }
   
}
