package soporte.tickets.tipos;

import soporte.tickets.Escalable;
import soporte.tickets.Ticket;
import soporte.tickets.TicketException;

public class TicketBackend extends Ticket implements Escalable{
    public TicketBackend(){};
    public TicketBackend(String origen,int prioridad)throws TicketException{
        super(origen, prioridad);
        validar();
    }
    @Override
    protected final void validar() throws TicketException {
        if(super.getORIGEN().equals("admin")||super.getORIGEN().equals("frontend")){
            throw new TicketException("ERROR: Origem invaluida para este tipo de Ticket!!");
        }
      if(super.getORIGEN().equals("bbdd")){
          super.setPrioridad(1);
      }
      if(super.getPrioridad() == 3) throw new TicketException("ERROR: Prioridad invalidad para este tipo de Ticket!!");
    }

    @Override
    public void escalar()throws TicketException {
        if(super.isResulto()) throw new TicketException("ERROR: Ticket ya resulto");
        setDESCRIPCION("\n TICKET ESCALADO");
        System.out.println("TICKET ESCALADO");
    }
    
}
