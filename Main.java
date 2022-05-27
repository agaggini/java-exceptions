import java.util.ArrayList;

public class Main {

    static ArrayList<Persona> lista = new ArrayList<Persona>();

    public static void main(String[] args) {

        lista.add(new Persona(1, "ALguien"));
        lista.add(new Persona(2, "Otro"));

        try {
            Persona x = buscar(1);
            System.out.println(x.getNombre());
        }
        catch (PersonaNoExisteException e) {
            System.out.println("No existe la persona");
        }

        try {
            Persona y = myGet(3);
            System.out.println(y.getNombre());
        }
        catch(PersonaNoExisteException e) {
            System.out.println("No tengo tantos elementos");
        }

        try {
            int a = 2;
            int b = 0;
            System.out.println(a / b);
        }
        catch(ArithmeticException e) {
            System.out.println(0);
        }

        try {
            String cadena = "8679.67";
            System.out.println(Integer.parseInt(cadena));
        }
        catch(NumberFormatException e) {
            System.out.println(0);
        }
    }

    public static Persona buscar(int id) throws PersonaNoExisteException {
        for ( Persona x : lista) {
            if(x.getId() == id)
                return x;
        }
        throw new PersonaNoExisteException();
    }

    public static Persona myGet(int pos) throws PersonaNoExisteException {
        Persona p = new Persona();
        try {
            p = lista.get(pos);
            return p;
        }
        catch (IndexOutOfBoundsException e) {
            throw new PersonaNoExisteException();
        }
        catch (Exception e) {
            System.out.println("Error desconocido");
        }
        return null;
    }
}
