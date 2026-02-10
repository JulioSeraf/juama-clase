package soporte.tickets.tipos;

import soporte.tickets.Escalable;
import soporte.tickets.Ticket;
import soporte.tickets.TicketException;

public class TicketFrontend extends Ticket implements Escalable{
    private String ruta;
    public TicketFrontend() {
    }

    public TicketFrontend(String origen,String ruta, int prioridad) throws TicketException {
        super(origen, prioridad);
        this.ruta = ruta;
        setDESCRIPCION(" Ruta: " + toLowerString(ruta));
            validar();
    }

    @Override
    protected final void validar() throws TicketException {
        if (!super.getORIGEN().equals("frontend")) {
            throw new TicketException("ERROR: Origen envalida para este tipo de Ticket!!");
        }
        if (!(toLowerString(this.ruta).contains("checkout") || toLowerString(this.ruta).contains("pago")) && this.getPrioridad() == 1) {
            super.setPrioridad(2);
        }
        if (super.getPrioridad() != 1 && super.getPrioridad() != 2) {
            throw new TicketException("ERROR: Prioridad envalida!!");
        }
    }

    @Override
    public void escalar()throws TicketException {
        if(super.isResulto()) throw new TicketException("ERROR: Ticket ya resulto");
        setDESCRIPCION("\n TICKET ESCALADO");
        System.out.println("TICKET ESCALADO");
    }

}
