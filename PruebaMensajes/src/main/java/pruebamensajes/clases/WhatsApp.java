/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebamensajes.clases;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author tarde
 */
public class WhatsApp extends Mensaje implements Enviar{
    Pattern regex = Pattern.compile("^[0-9]{3,9}$");

    public WhatsApp(String contenido, String destinatario) {
        super(contenido, destinatario);
    }

    @Override
    public boolean validadDestinatario() {
        Matcher isValido = regex.matcher(super.getDestinatario());
        return isValido.find();
    }
    
    @Override
    public void isEnviado(boolean v) {
        super.setEnviado(v);
    }
    
}
