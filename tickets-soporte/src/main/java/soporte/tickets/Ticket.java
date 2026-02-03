package soporte.tickets;

public abstract class Ticket {
    private  String descripcion;
    private final String ORIGEN;
    private boolean resulto = false;
    private int prioridad =0;
    public Ticket(){
        this.ORIGEN = "";
    }
    public Ticket(String d, String o,int prioridad){
        this.descripcion = d;
        this.ORIGEN = o;
        this.prioridad = prioridad;
    }
    public Ticket(String origen, String descripcion){
        this.ORIGEN = origen;
        this.descripcion = descripcion;
        
    }

    public String getDESCRIPCION() {
        return descripcion;
    }
      public void setDESCRIPCION(String description) {
       this.descripcion = description;
    }

    public String getORIGEN() {
        return ORIGEN;
    }

    public boolean isResulto() {
        return resulto;
    }

    public void setResulto(boolean resulto) {
        this.resulto = resulto;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
    public void resolver(){
        
    }
    
    protected abstract void validar()throws TicketException;
    
    protected static String toLowerString(String valor){
        return valor.trim().toLowerCase();
    }
    @Override
    public String toString(){
        return String.format("Ticket creado por: %s, Descripcion: %s", this.ORIGEN,this.descripcion);
    }
    
}
