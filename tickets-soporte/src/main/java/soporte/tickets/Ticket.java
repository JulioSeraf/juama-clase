package soporte.tickets;

public abstract class Ticket {
    private  String descripcion;
    private final String ORIGEN;
    private boolean resulto = false;
    private int prioridad =0;
    public Ticket(){
        this.ORIGEN = "";
    }
    public Ticket(String origem,int prioridad){
        this.ORIGEN = toLowerString(origem);
        this.prioridad = prioridad;
        this.descripcion = String.format("Ticket de %s con origen %s y prioridad %d",this.getClass().getSimpleName(),this.ORIGEN,this.prioridad);
    }
   
    protected String getDESCRIPCION() {
        return descripcion;
    }
     protected void setDESCRIPCION(String description) {
       this.descripcion += description;
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
        if(isResulto()) setDESCRIPCION(" \"RESOLTO\" ");
    }
    
    protected abstract void validar()throws TicketException;
    
    protected static String toLowerString(String valor){
        return valor.trim().toLowerCase();
    }
    @Override
    public String toString(){
        return this.getDESCRIPCION();
    }
    
}
