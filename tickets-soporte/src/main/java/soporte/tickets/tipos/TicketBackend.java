package soporte.tickets.tipos;

import soporte.tickets.Ticket;
import soporte.tickets.TicketException;

public class TicketBackend extends Ticket {
    public TicketBackend(){};
    public TicketBackend(String origen, String descripcion)throws TicketException{
        super(origen,descripcion);
        validar();
    }
    @Override
    protected final void validar() throws TicketException {
    }
    
}
