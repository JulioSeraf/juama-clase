package soporte.tickets.tipos;

import soporte.tickets.Ticket;
import soporte.tickets.TicketException;

public class TicketAdministrativo extends Ticket {
    public TicketAdministrativo(){}
    public TicketAdministrativo(String origen,String tramite, int prioridad)throws TicketException{
        super(origen,prioridad);
        setDESCRIPCION(" Tramite: " + toLowerString(tramite));
        validar();
    }

    @Override
    public final void validar ()throws TicketException  {
        if(!super.getORIGEN().equals("admin")) throw new TicketException("ERROR: Origem invalida para este tipo de Ticket");
        if(super.getPrioridad() != 3) throw new TicketException("ERROR: Prioridad Invalida para este tipo de Ticket");
    }
   
}
