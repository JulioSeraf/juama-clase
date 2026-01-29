/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebamensajes.clases;

/**
 *
 * @author tarde
 */
public class Postlt extends Mensaje{
    public Postlt(){};
    public Postlt(String contenido){
        super(contenido);
    };

    @Override
    public boolean validadDestinatario() {return true;}
    
}
