package soporte;

import java.util.Scanner;
import soporte.tickets.ColaTickets;
import soporte.tickets.TicketException;

public class App {

    private static ColaTickets cola;
    private static Scanner scan;

    public static void main(String... args) {
        // Crear la cola de tickets
        App.cola = new ColaTickets();

        // Lanzar el menú
        menuRaiz();
    }

    private static int getNumTickets() {
        return cola.getNumTickets();
    }

    private static void listarPendientes() throws TicketException {
        cola.listaTicketsPendientes();
    }

    private static void listarResueltos() throws TicketException {
        cola.listaTicketsResueltos();
    }

    private static void mostrarTicket(int indice) throws TicketException {
        cola.muestraTicket(indice);
    }

    private static void crearTicketFrontend(String origen, String ruta, int prioridad) throws TicketException {
        cola.anyadeTicketFrontend(origen, ruta, prioridad);
    }

    private static void crearTicketBackend(String origen, int prioridad) throws TicketException {
        cola.anyadeTicketBackend(origen, prioridad);
    }

    private static void crearTicketAdministrativo(String origen, String tramite, int prioridad) throws TicketException {
        cola.anyadeTicketAdministrativo(origen, tramite, prioridad);
    }

    private static void escalaTicket(int indice) throws TicketException {
        cola.escalaTicket(indice);
    }

    private static void resuelveTicket(int indice) throws TicketException {
        cola.resuelveTicket(indice);
    }

    private static void colaTicketsReset() {
        cola.reset();
    }

    /**
     * ****** ******
     */
    private static void menuRaiz() {
        boolean salir = false;

        while (!salir) {
            System.out.printf(
                    """
                APLICACIÓN DE GESTIÓN DE TICKETS DE SOPORTE
                ===========================================
            
                [ Hay %d tickets en total ]
            
                LISTAR
                1) Listar Tickets pendientes
                2) Listar Tickets resueltos
                
                MOSTRAR
                3) Mostrar un Ticket
                
                CREAR
                4) Crear un ticket de Frontend
                5) Crear un ticket de Backend
                6) Crear un ticket de Administración
                
                ESCALAR
                7) Escalar un ticket
                
                RESOLVER
                8) Resolver un ticket
                
                RESET
                r) Eliminar todos los datos de la cola de tickets
                
                SALIR
                q) Salir de la aplicación
            """,
                    getNumTickets()
            );

            final String opcion = pedirLetraOpcion();

            try {

                switch (opcion) {
                    case "1" ->
                        listarPendientes();
                    case "2" ->
                        listarResueltos();
                    case "3" ->
                        mostrarTicket(pedirIndice());
                    case "4" ->
                        menuTicketFrontend();
                    case "5" ->
                        menuTicketBackend();
                    case "6" ->
                        menuTicketAdministrativo();
                    case "7" ->
                        escalaTicket(pedirIndice());
                    case "8" ->
                        resuelveTicket(pedirIndice());
                    case "r" -> {
                        colaTicketsReset();
                        System.out.println("\nCola reiniciada.\n");
                    }
                    case "q" ->
                        salir = true;
                    default ->
                        System.out.println("\nOpción incorrecta\n");

                }
            } catch (TicketException e) {
                System.out.printf("\n\n%s\n\n", e.getMessage());
            } catch (Exception e) {
                System.out.printf(
                        "\nError inesperado: %s - %s\n\n",
                        e.getClass().getSimpleName(), e.getMessage()
                );
            }
            
            if (!salir) {
                pausa();
            }
        }

        System.out.println("\nSaliendo de la aplicación\n");
    }

    private static String menuOrigen() {
        String origen = null;
        String opcion;

        while (origen == null) {

            System.out.println(
                    """
            SELECCIONE EL ORIGEN
            ====================
        
            1) frontend
        
            2) backend
            3) bbdd
            4) infra
        
            5) admin
        """
            );

            opcion = pedirLetraOpcion();

            origen = switch (opcion) {
                case "1" ->
                    "frontend";
                case "2" ->
                    "backend";
                case "3" ->
                    "bbdd";
                case "4" ->
                    "infra";
                case "5" ->
                    "admin";
                default ->
                    null;
            };

            if (origen == null) {
                System.out.println("\nOpción incorrecta\n");
            }

        }

        return origen;
    }

    private static int menuPrioridad() {
        Integer prioridad = null;
        String opcion;

        while (prioridad == null) {

            System.out.println(
                    """
            SELECCIONE LA PRIORIDAD
            =======================
        
            3) 3 - baja 
            2) 2 - media
            1) 1 - alta
        """
            );

            opcion = pedirLetraOpcion();

            prioridad = switch (opcion) {
                case "1" ->
                    1;
                case "2" ->
                    2;
                case "3" ->
                    3;
                default ->
                    null;
            };

            if (prioridad == null) {
                System.out.println("\nOpción incorrecta\n");
            }

        }

        return prioridad;
    }

    private static void menuTicketFrontend() throws TicketException {
        String origen = menuOrigen();
        String ruta = pedirLinea("Ruta");
        int prioridad = menuPrioridad();

        crearTicketFrontend(origen, ruta, prioridad);
    }

    private static void menuTicketBackend() throws TicketException {
        String origen = menuOrigen();
        int prioridad = menuPrioridad();

        crearTicketBackend(origen, prioridad);
    }

    private static void menuTicketAdministrativo() throws TicketException {
        String origen = menuOrigen();
        String tramite = pedirLinea("Trámite");
        int prioridad = menuPrioridad();

        crearTicketAdministrativo(origen, tramite, prioridad);
    }

    private static String pedirLetraOpcion() {
        System.out.println("\nOpción: ");
        String token = scanPalabra();
        System.out.println();

        return token.trim().toLowerCase();
    }

    private static int pedirIndice() {
        return pedirInt("Índice del ticket");
    }

    private static int pedirInt(String prompt) {
        Integer value = null;

        while (value == null) {
            System.out.printf("\n%s: ", prompt);
            value = scanInt();
            System.out.println();

            if (value != null && value < 0) {
                value = null;
            }

            if (value == null) {
                System.out.println("\nValor incorrecto.\n");
            }
        }

        return value;
    }

    private static String pedirLinea(String prompt) {
        String token = null;

        while (token == null) {
            System.out.printf("\n%s: ", prompt);
            token = scanLinea();
            System.out.println();

            if (token.isBlank()) {
                System.out.println("""
                Se ha registrado una línea vacía o compuesta de espacios.
                Por favor, escriba algo.
                """);

                token = null;
            }
        }

        return token.trim();
    }

    private static Scanner getScanner() {
        if (App.scan == null) {
            App.scan = new Scanner(System.in);
        }

        return App.scan;
    }

    private static String scanLinea() {
        Scanner sc = getScanner();
        String token = sc.nextLine();

        return token;
    }

    private static String scanPalabra() {
        Scanner sc = getScanner();
        String token = sc.next();
        sc.nextLine();

        return token;
    }

    private static Integer scanInt() {
        Integer valor;

        Scanner sc = getScanner();
        String token = sc.next().trim();
        sc.nextLine();

        try {
            valor = Integer.valueOf(token);
        } catch (NumberFormatException e) {
            valor = null;
        }

        return valor;
    }
    
    private static void pausa() {
        System.out.print("Pulsa Enter para continuar...");
        scanLinea();
    }
}
