package soporte.tickets;

import soporte.tickets.tipos.TicketAdministrativo;
import soporte.tickets.tipos.TicketBackend;
import soporte.tickets.tipos.TicketFrontend;

public class ColaTickets {

    private static Ticket[] cola = new Ticket[100];
    private int numTickets = 0;

    public int getNumTickets() {
        return numTickets; // TODO: implementar bien
    }

    public void listaTicketsPendientes() throws TicketException {
        for (int i = 0; i < getNumTickets(); i++) {
            if (!cola[i].isResulto()) {
                System.out.printf("""
                              \n
                               Indice de Ticket: %d
                               Ticket: %s
                               """, i, cola[i].toString());
            }

        }
    }

    public void listaTicketsResueltos() throws TicketException {
        for (int i = 0; i < getNumTickets(); i++) {
            if (cola[i].isResulto()) {
                cola[i].getDESCRIPCION();
            }
        }

    }

    public void muestraTicket(int indice) throws TicketException {
        if (indice < 0 || indice > getNumTickets()) {
            throw new TicketException("ERROR: indice !!");
        }
        System.out.println(cola[indice].toString());

    }

    private void anyadeTickets(Ticket t) throws TicketException {
        Ticket ticket = t;
        ticket.validar();
        setCola(ticket);
        setNumTickets(1);
        System.out.println("Ticket añadido!");
    }

    public void anyadeTicketFrontend(String origen, String ruta, int prioridad) throws TicketException {
        anyadeTickets(new TicketFrontend(origen, ruta, prioridad));

    }

    public void anyadeTicketBackend(String origen, int prioridad) throws TicketException {
        anyadeTickets(new TicketBackend(origen, prioridad));
    }

    public void anyadeTicketAdministrativo(String origen, String tramite, int prioridad) throws TicketException {
        anyadeTickets(new TicketAdministrativo(origen, tramite, prioridad));
    }

    public void escalaTicket(int indice) throws TicketException {
        if (indice < 0 || indice > 100) {
            throw new TicketException("Indice invalido!!");
        }
        if (cola[indice].isResulto()) {
            throw new TicketException("ERROR: Ticket ya resulto no puede ser Escalado");
        }
        if (cola[indice] instanceof Escalable esc) {
            esc.escalar();
        } else {
            throw new TicketException("ERROR: Ticket de admin no puede ser Escalado");
        }

    }

    public void resuelveTicket(int indice) throws TicketException {
        if (indice < 0 || indice > 100) {
            throw new TicketException("ERROR: Ticket inexistente");
        }
        for (int i = 0; i < cola.length; i++) {
            if (indice == i) {
                if (cola[i].isResulto()) {
                    throw new TicketException("ERROR: Ticket ya resulto!");
                }
                if (cola[i] == null) {
                    throw new TicketException("ERROR: Ticket inexistente");
                }
                cola[i].setResulto(true);
            }
        }
    }

    public void reset() {
        cola = new Ticket[100];
    }

    private Ticket getTicketOrThrow(int indice) throws TicketException {
        return null; // TODO
    }

    public Ticket[] getCola() {
        return this.cola;
    }

    public void setCola(Ticket t) {
        for (int i = 0; i < cola.length; i++) {
            if (cola[i] == null) {
                cola[i] = t;
            }
        }
    }

    public void setNumTickets(int numTickets) throws TicketException{
        if (this.numTickets < 101) {
            this.numTickets += numTickets;
        }else{
            throw new TicketException("Soporte de Ticket lleno!!");
        }
    }
}
