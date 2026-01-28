/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebamensajes.clases;

/**
 *
 * @author tarde
 */
public abstract class Mensaje {
    private String contenido = "";
    private String destinatario = "";
    protected boolean enviado = false;
    public Mensaje(){};
    public Mensaje(String c){
        this.contenido =c;
    };
    public Mensaje(String c, String d){
        this.contenido = c;
        this.destinatario = d;
    };
    
    @Override
    public String toString(){
        return this.getContenido();
    }
    public abstract boolean validadDestinatario();

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

   

  
}
