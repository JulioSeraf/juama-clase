/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebamensajes.clases;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 *
 * @author tarde
 */
public class  Email extends Mensaje implements Enviar{
    public boolean enviado;
    Pattern regex = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
    private String asunto = "";
    public Email(String contenido,String a, String destinatario){
        super(contenido,destinatario);
        this.asunto = a;
    }
    @Override
    public boolean validadDestinatario() {
        Matcher isValido = regex.matcher(super.getDestinatario());
        return isValido.find();
    }

    @Override
    public void isEnviado(boolean v) {
        super.enviado = v;
    }
    
}
