/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.accedia.tarde.minutossegundos;

import java.util.*;


/**
 *
 * @author tarde
 */
public class Ejercicios {

    public void MinutosSegundos(Scanner sc) {
        System.out.println("Descubre los segundos");
        System.out.println("Informe los minutos:");
        int min = sc.nextInt();
        int seg = min * 60;
        System.out.printf("Los minutos %d son %dseg", min, seg);
    }

    public void MediaAluno(Scanner sc) {
        System.out.println("Informe la nota del Primer Trimestre: ");
        double primTri = sc.nextDouble();
        System.out.println("Informe la nota del Segundo Trimestre: ");
        double segTri = sc.nextDouble();
        System.out.println("Informe la nota del Tercero Trimestre: ");
        double terTri = sc.nextDouble();
        System.out.println("la media del aluno es:" + ((primTri + segTri + terTri) / 3));
    }

    public void AreaCirculo(Scanner sc) {
        System.out.println("Informe la distancia del medio a qualquer estremidade del Circulo: ");
        double area = sc.nextDouble();
        int circulo = (int) ((area * area) * Math.PI);
        System.out.println("El area del ciculo es " + circulo);
    }

    public void CelAFah(Scanner sc) {
        double num = sc.nextDouble();
        double temp = (num * (1.8)) + 32;
        System.out.println(temp);
    }

    public void EdadMeses(Scanner sc) {
        System.out.println("Informe la Edad:");
        int edad = sc.nextInt();
        int bisexto = edad / 4;
        int meses = ((edad * 365) + bisexto) / 30;
        int dias = ((edad * 365) + bisexto) % 30;
        System.out.printf("La Edad de %d años son %d meses y %d dias.\n", edad, meses, dias);

    }

    public void PrecioIva(Scanner sc) {
        System.out.println("Informe el valor del Producto:");
        double valor = sc.nextDouble();
        double iva = valor * 0.21;
        double total = valor + iva;
        System.out.printf("El total del valor %.2f con 21%%(%.2f) de iva : TOTAL : %.2f\n", valor, iva, total);
    }

    public void CaracteASCII(Scanner sc ) {
        System.out.println("Informe un caracter:");
        String cadUser = sc.nextLine();
         if(cadUser.length() > 0){
             System.out.println("Solo pudes informa una Letra!!");     
         }else{
         char caracter = cadUser.charAt(0);
        int numASCII = caracter;
        System.out.printf("EL numero del caracter %s el la tabla ASCII es %d ", caracter, numASCII);
         }
        
    }

    public void CoparacioCadenas(Scanner scan) {
        System.out.println("Informe primer Cadena:");
        String cade1 = scan.nextLine().toLowerCase().trim();
        System.out.println("Informe segunda Cadena:");
        String cade2 = scan.nextLine().toLowerCase().trim();
        String resul = "NO SON iguales";
        if (cade1.equals(cade2)) {
            resul = "SON iguales";
        }
        System.out.printf("Las cadenas %s y %s %s", cade1, cade2, resul);
    }

    public void ParImpar(Scanner scan) {
        System.out.println("Informe tu numero:");
        int num = scan.nextInt();
        String res = " es impar";
        if (num % 2 == 0) {
            res = " es par";
        }
        System.out.println("El numero " + num + res);
    }

    public void MayorDeTres(Scanner sc) {
        System.out.println("Informe valor 1: ");
        double num1 = sc.nextDouble();
        System.out.println("Informe valor 2: ");
        double num2 = sc.nextDouble();
        System.out.println("Informe valor 3: ");
        double num3 = sc.nextDouble();


        double mayor = 0;

        if (num1 > num2) {
            if (num1 > num3) {
                mayor = num1;
            }
        } else if (num2 > num3) {
            mayor = num2;
        } else {
            mayor = num3;
        }

        System.out.printf("El mayor numero de la sequencia %.1f | %.1f | %.1f es %.1f", num1, num2, num3, mayor);
    } 

    public void AprobadoSiNo(Scanner sc) {
        System.out.println("Informe la nota del Aluno:");
        double nota = sc.nextDouble();
        String res = "Suspenso";
        if (nota >= 5) {
            res = "Aprobado";
        }
        System.out.println(res);
    }

    public void IsWeekenday(Scanner sc) {
        System.out.println("Informe un numero de 1-7: ");
        int valor = sc.nextInt();
        String dia = "";
        switch (valor) {
            case 1 ->
                dia = "Domingo";
            case 2 ->
                dia = "Lunes";
            case 3 ->
                dia = "Martes";
            case 4 ->
                dia = "Miercules";
            case 5 ->
                dia = "Jueves";
            case 6 ->
                dia = "Viernes";
            case 7 ->
                dia = "Sabado";

        }
        System.out.printf("Es %s", dia);
    }

    public void IsBisexto(Scanner sc) {
        System.out.println("Infome el año : ");
        int num = sc.nextInt();
        String res = "NO es bisiesto";
        if (num % 4 == 0) {
            if (num % 100 == 0) {
                if (num % 400 == 0) {
                    res = "Es bisiesto";
                }
            }
        }
        System.out.printf("EL año de %d %s", num, res);
    }

    public void CalculadoraBas(Scanner scan) {
        System.out.println("Informe el primer valor:");
        double num1 = scan.nextDouble();
        System.out.println("Informe el segundo valor:");
        double num2 = scan.nextDouble();
        System.out.println("""
                           Informe una de las seguintes operaciones:
                           Suma(+)
                           Resta(-)
                           Multiplicar(*)
                           Division(/)
                           Resto de División(%)
                           """);
        var expr = scan.next().trim();
        double res = 0;
        switch (expr) {
            case "+" ->
                res = num1 + num2;
            case "-" ->
                res = num1 - num2;
            case "*" ->
                res = num1 * num2;
            case "/" ->
                res = num1 / num2;
            case "%" ->
                res = num1 % num2;
        }
        System.out.printf("""
                          ===============  Resultado ============
                          \t %.1f %s %.1f = %.1f
                          """, num1, expr, num2, res);
    }

    public void NumPoNeZe(Scanner sc) {
        System.out.println("Informe un Numero:");
        double num = sc.nextDouble();
        String res = "Zero";
        if (num > 0) {
            res = "Positivo";
        }
        if (num < 0) {
            res = "Negativo";
        }
        System.out.printf("El numero %.1f es %s", num, res);
    }

    public void Contador10(Scanner sc) {
        System.out.println("Informe hasta que numero quieres contar :");
        int num = sc.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.print(i + " ");
        }
    }

    public void SumaN(Scanner sc) {
        System.out.println("Informe un numero para la sequencia de suma :");
        int num = sc.nextInt();
        int res = 0;
        for (int i = 0; i <= num; i++) {
            res += i;
        }
        System.out.println(res);
    }

    public void TablaMul(Scanner sc) {
        int num = sc.nextInt();
        System.out.printf(" ========Tabla de %d========\n", num);
        for (int i = 0; i <= 10; i++) {
            System.out.printf("""
                              %dx%d = %d
                               """, i, num, (i * num));
        }
    }

    public void CuentaAtra(Scanner sc) {
        System.out.println("Informe un numero para hacer la cuenta atras:");
        int num = sc.nextInt();
        while (num >= 0) {
            System.out.print(num + "");
            num--;
        }
    }

    public void HastaZero(Scanner sc) {
        int suma = 0;
        int num = 0;

        do {
            System.out.println("Introduzca un numero ( Exit = 0 ):");
            num = sc.nextInt();
            suma += num;
        } while (num != 0);
        System.out.println("Suma total de los numeros: " + suma);
    }

    public void Factorial(Scanner sc) {
        System.out.println("Informe el numero que quieres el factorial:");
        int num = sc.nextInt();
        int fac = 1;
        for (int i = num; i >= 1; i--) {
            fac *= i;
        }
        System.out.printf("El facorial de %d es %d", num, fac);
    }

    public void PromedioANegativo(Scanner sc) {
        int suma = 0;
        int cantid = 0;
        double num = 0;
        while (num >= 0) {
            System.out.println("Insira tus notas: ");
            num = sc.nextDouble();
            suma += num;
            cantid++;
        }
        suma = suma / cantid;
        System.out.println("Tu Promedio de notas es: " + suma);
    }

    public void ContadorParIm(Scanner sc) {
        System.out.println("Informe los numeros:");
        String numbers = sc.nextLine().trim();
        numbers = numbers.replace(" ", ",");
        String[] number = numbers.split(",");
        int contPa = 0;
        int contIm = 0;
        String numP = "";
        String numI = "";

        for (int i = 0; i <= number.length - 1; i++) {
            int num = Integer.parseInt(number[i]);
            if (num % 2 == 0) {
                contPa++;
                numP += " " + num;
            } else if (num % 2 != 0) {
                contIm++;
                numI += " " + num;
            }
        }
        System.out.printf("""
                          Hay un Total de %d pares, Numeros : %s
                          Hay un Total de %d Impares, Numeros : %S
                          """, contPa, numP, contIm, numI);
    }

    public void NumerPrimos(Scanner sc) {
        System.out.println("Informe un Numero: ");
        int num = sc.nextInt();
        int cont = 0;
        String isPrimo = "No es Primo";
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                cont++;
            }
        }
        if (cont == 2) {
            isPrimo = "Es Primo";
        }
        if (num == 1) {
            isPrimo = "Es Primo";
        }
        System.out.printf("El Numero %d %s", num, isPrimo);
    }

    public void AdivinaNum(Scanner sc) {
        int numMaq = (int) (Math.random() * 100) + 1;
        String valor = "";
        int numUser = 0;
        while (numUser != numMaq) {
            System.out.println("""
                            Informe un numero y suerte!! o Escreve "Exit" para salir:
                            """);
            valor = sc.nextLine().trim();
            
            if(valor.equalsIgnoreCase("exit")){
                  System.out.printf("Que pena el numero era %d, Suerte en la Proxima!!",numMaq);
                  numUser = numMaq;
            }else{
                numUser = Integer.parseInt(valor);
                if(numUser >100 || numUser < 0) System.out.println("El numero tiene que ser entre 0 - 100");
                if(numMaq == numUser){
                    System.out.println("Correcto!!!");
                }
                    System.out.printf("""
                                      Intentalo otra vez!! 
                                      TU NUMERO: %d
                                      """,numUser,numMaq);

                
            }
          

        
        }
    }
    

    public void NumMaxMin(Scanner sc) {
        ArrayList<Integer> numbers = new ArrayList();
        System.out.println("Insira tu lista de numero:");
        String listUse = sc.nextLine();
        
        String[] arrayString = listUse.trim().replace(","," ").split(" ");
        for(var n: arrayString){
            int num = Integer.parseInt(n);
            numbers.add(num);
        }
        int mayor = numbers.get(0);
        int menor = numbers.get(0);
        for(int i = 1; i < numbers.size();i++){
           if(mayor < numbers.get(i)){
               mayor = numbers.get(i);
           }
        }
        for(int i = 1; i < numbers.size();i++){
           if(menor > numbers.get(i)){
               menor = numbers.get(i);
           }
        }
        System.out.printf("""
                          El Numero mayor es: %d
                          El Numero menor es: %d
                          """,mayor,menor);
    }

    public void ConversoBinaro(Scanner sc) {
        System.out.println("Informe el Decimal:");
        int numUser = sc.nextInt();
        int num = numUser; 
        int resto = 0;
        var binario = new ArrayList();
        
        while(num >= 1){
            resto = num % 2;
            binario.add(resto);
            num /= 2;
        }
        if(binario.getFirst().equals(1)) binario.add(0);
        String bi = binario.reversed().toString();
        System.out.printf("""
                          Numero: %d
                          Binario: %s
                          """,numUser,bi );
    }

    public void SerieFibonacci(Scanner sc) {
        System.out.println("Informe hasta que posicion de la serie Fibonacci quieres :");
      int valor = sc.nextInt();
      int num1 = 0;
      int num2 = 1; 
      int res = 0; 
        System.out.println("-> 1");
      for(int i = 2; i<= valor ; i++){
        res = num1 + num2;
        num1 = num2;
        num2 = res;
          System.out.println("-> " + res);
    }
      
    }

   public void nueroCapicúa(Scanner sc){
       System.out.println("Informe un numero:");
       int num = sc.nextInt();
       String res = "No Es Capicúa";
       String numInString = String.valueOf(num);
       String[] numArray = numInString.split("");
       String reverseNum = "";
       for(int i = numArray.length -1; i >= 0;i--){
           reverseNum += numArray[i];
       }
       if(numInString.equalsIgnoreCase(reverseNum)) res = "Es Capicúa";
       
       System.out.printf("""
                         Numero: %d
                         Revertido: %s
                         Resultado: %s
                         """, num, reverseNum, res);
       //ArrayList<String> numList = new ArrayList<>(Arrays.asList(numArray));
   }

    public void Conversor(Scanner sc) {
        System.out.println("""
                           Informe a que moneda quieres Convertir:
                           Opciones disponibles: 
                           -> libras
                           -> dollar
                           -> yenes
                           -> real
                           """);
        
        String useRes = sc.nextLine();
        
        System.out.println("Informe el valor:");
        
        double euro = sc.nextDouble();
        
        double libras = 0.87;
        double dollar = 1.16;
        double yenes = 176.22;
        double real = 6.25;
        double con = 0;
        switch(useRes){
            case "libra","libras" -> con = euro * libras;
            case "dollar","dollars" -> con = euro * dollar;
            case "yenes", "yene" -> con = euro * yenes;
            case "real","reales" -> con = euro * real;
        }
        System.out.printf("""
                          Euro: %.2f
                          %s: %.2f
                          """, euro, useRes, con);
    }

    public void joKemPo(Scanner sc) {
        System.out.println("""
                           ============JoKemPo=============
                           Escoja: 
                           -> Papel
                           -> Piedra
                           -> Tijera
                           """);
        String resUser = sc.nextLine();
        String res ="Pierdes!!";
        int num =(int)(Math.random()*3);
        String[] resMaq = {"papel","piedra","tijera"};
        if(resUser.equalsIgnoreCase(resMaq[num])){
            res = "Empatado";
        }else if(    (resUser.equalsIgnoreCase("papel") && num == 1)
            || (resUser.equalsIgnoreCase("piedra")&& num == 2 )
            || (resUser.equalsIgnoreCase("tijera"))&& num == 0){
            res = "Ganas!!";
        }
        System.out.printf("""
                           Tu: %s
                           Maquina: %s
                           Resultado: %s
                           """,resUser,resMaq[num],res);
    }

    public void CalculadorExte(Scanner sc) {
        System.out.println("Informe la operación:");
        String input = sc.nextLine();
        String inUser = input.replace(" ","");
        if(inUser.contains("/")) inUser = inUser.replace("/"," ");
        if(inUser.contains("*")) inUser = inUser.replace("*"," ");
        if(inUser.contains("+")) inUser = inUser.replace("+"," ");
        if(inUser.contains("-")) inUser = inUser.replace("-"," ");
        if(inUser.contains("%")) inUser = inUser.replace("%"," ");
        var arrayNum = inUser.split(" ");
        double res = 0;
        double num1 = Integer.parseInt(arrayNum[0]);
        double num2 = Integer.parseInt(arrayNum[1]);
        if(input.contains("/")) res = num1 / num2;
        if(input.contains("*")) res = num1 * num2;
        if(input.contains("+")) res = num1 + num2;
        if(input.contains("-")) res = num1 - num2;
        if(input.contains("%")) res = num1 % num2;
        
        System.out.println(res);
    }

    public void Cajero(Scanner sc) {
       double saldo = 0;
       int userIn = 0;
       do{
         System.out.printf("""
                          =============== Cajero ================
                          Selecione Operación: 
                          1 -> Ingresar
                          2 -> Retirar
                          3 -> Consultar Saldo
                          4 -> Exit
                          """);
        userIn = sc.nextInt();
  
            switch(userIn){
                case 1 -> {
                    System.out.println("Informe la Cantidad a Ingresar");
                    saldo += sc.nextDouble();
                }
                case 2 -> { 
                    System.out.println("Informe la Cantidad a Retirar");
                    double retirar = sc.nextDouble();
                    if((saldo - retirar) <= 0){
                        System.out.println("Saldo Insuficiente");
                        break;
                    }
                    saldo -= retirar;
                }
                case 3 -> System.out.println("Saldo total: "+ saldo);
                }
       
       }while(userIn != 4);
      
        
    }

    public void GenContrasena(Scanner sc ) {
    boolean exit = false;
    do{
        System.out.println("""
                           =============== Generado de Contraseña==============
                           Genererar:
                           1 -> Pin(4 dig)
                           2 -> Numeros(8 dig)
                           3 -> Caracter(8 dig)
                           4 -> Completa(16 dig)
                           5 -> Exit
                           """);
        int var = sc.nextInt();
       
       char[] arraySin = {'%','&','?','@','$'};
       ArrayList <Character> conCompleta = new ArrayList <>();
       ArrayList <Character> pin = new ArrayList <>();
       ArrayList <Character> deNumeros = new ArrayList<>();
       ArrayList <Character> deCaracter = new ArrayList<>();
       String res = "";
      
       


       int randoNum =0;
       while(conCompleta.size()<=7){
           randoNum = (int)((Math.random()*57)+65);
           if(randoNum >= 91 && randoNum <=96)continue;
           char randoChar = (char)randoNum;
           conCompleta.add(randoChar);
           deCaracter.add(randoChar);
       }
       while(conCompleta.size()< 11) conCompleta.add(arraySin[(int)(Math.random()*4)]);
       while(pin.size()< 4){
        randoNum = (int)((Math.random()*9)+48);
        char randoChar = (char)randoNum;
        pin.add(randoChar);
       }
       
       while(deNumeros.size()< 8){
        randoNum = (int)((Math.random()*9)+48);
        char randoChar = (char)randoNum;
        deNumeros.add(randoChar);
       }
       conCompleta.addAll(pin);
        switch (var) {
            case 1 ->{ for(char n: pin) res +=n;}
            case 2 ->{ for(char n: deNumeros) res +=n;}
            case 3 ->{ for(char n: deCaracter) res +=n;}
            case 4 ->{ for(char n: conCompleta) res +=n;}
            case 5 ->{exit = true;}
        }
        System.out.printf("""
                          =============== Contraseña ==============
                          %s
                          """,res);
    }while(exit == false);

       
    }
     public void MenuInterativo(Scanner sc) {
         Ejercicios Ej = new Ejercicios();
        System.out.println("""
                           Selecione una opcion:
                           Suma simple                -> 1
                           Promedio de tres números   -> 2
                           Área de un círculo         -> 3
                           Concersor de Temperatura   -> 4
                           Edad en meses              -> 5
                           Precio con IVA             -> 6
                           Carácter ASCII             -> 7
                           Comparación de cadenas     -> 8
                           Número par o impar         -> 9
                           Mayor de tres números      -> 10
                           Aprobado o suspenso        -> 11
                           Dia de la semana           -> 12
                           Año bisiesto               -> 13
                           Calculadora básica         -> 14
                           Número pos/nega o zero     -> 15
                           Contador del 1 al 10       -> 16
                           Suma primeros N            -> 17
                           Tabla de multiplicar       -> 18
                           Cuenta atrás               -> 19
                           Suma hasta cero            -> 20
                           Factorial                  -> 21   
                           Promedio con número        -> 22
                           Contador de pares-impares  -> 23
                           Números primos             -> 24 
                           Adivina el número          -> 25
                           Número máximo y mínimo     -> 26
                           Conversor binario/decimal  -> 27
                           Serie de Fibonacci         -> 28
                           Numero Capicúa             -> 29
                           Conversor                  -> 30
                           JoKenPo                    -> 31
                           Calculadora Extendida      -> 32
                           Cajero                     -> 33
                           Generador de Contraseña    -> 34
                           Opcion : 
                           """);
        int valor = sc.nextInt();
        sc.nextLine();
        switch(valor){
            case 1  -> Ej.MinutosSegundos(sc);
            case 2  -> Ej.MediaAluno(sc);
            case 3  -> Ej.AreaCirculo(sc);
            case 4  -> Ej.CelAFah(sc);
            case 5  -> Ej.EdadMeses(sc);
            case 6  -> Ej.PrecioIva(sc);
            case 7  -> Ej.CaracteASCII(sc);
            case 8  -> Ej.CoparacioCadenas(sc);
            case 9  -> Ej.ParImpar(sc);
            case 10 -> Ej.MayorDeTres(sc);
            case 11 -> Ej.AprobadoSiNo(sc);
            case 12 -> Ej.IsWeekenday(sc);
            case 13 -> Ej.IsBisexto(sc);
            case 14 -> Ej.CalculadoraBas(sc);
            case 15 -> Ej.NumPoNeZe(sc);
            case 16 -> Ej.Contador10(sc);
            case 17 -> Ej.SumaN(sc);
            case 18 -> Ej.TablaMul(sc);
            case 19 -> Ej.CuentaAtra(sc);
            case 20 -> Ej.HastaZero(sc);
            case 21 -> Ej.Factorial(sc);
            case 22 -> Ej.PromedioANegativo(sc);
            case 23 -> Ej.ContadorParIm(sc);
            case 24 -> Ej.NumerPrimos(sc);
            case 25 -> Ej.AdivinaNum(sc);
            case 26 -> Ej.NumMaxMin(sc);
            case 27 -> Ej.ConversoBinaro(sc);
            case 28 -> Ej.SerieFibonacci(sc);
            case 29 -> Ej.nueroCapicúa(sc);
            case 30 -> Ej.Conversor(sc);
            case 31 -> Ej.joKemPo(sc);
            case 32 -> Ej.CalculadorExte(sc);
            case 33 -> Ej.Cajero(sc);
            case 34 -> Ej.GenContrasena(sc);


        }
    }

    public static void main(String[] args) {
        Ejercicios Ejercicios = new Ejercicios();
        Scanner sc = new Scanner(System.in);
        Ejercicios.MenuInterativo(sc);
    }
}
