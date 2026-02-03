package soporte.tickets.tipos;

import soporte.tickets.Ticket;
import soporte.tickets.TicketException;

public class TicketFrontend extends Ticket {

    private final String RUTA = "/home.html";

    public TicketFrontend() {
    }

    public TicketFrontend(String descripcion, String origen, int prioridad) throws TicketException {
        super(descripcion, origen, prioridad);
        validar();
    }

    @Override
    protected final void validar() throws TicketException {
        if (!toLowerString(super.getORIGEN()).equals("frontend")) {
            throw new TicketException("Origen envalida para este tipo de Ticket!!");
        }
        if ((toLowerString(this.RUTA).contains("checkout") || toLowerString(this.RUTA).contains("pago")) && this.getPrioridad() == 1) {
            super.setPrioridad(2);
        }
        if (super.getPrioridad() != 1 || super.getPrioridad() != 2) {
            throw new TicketException("Prioridad envalida!!");
        }
    }

}
