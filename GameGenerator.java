
/**
 * Write a description of class GameGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameGenerator
{
    // instance variables - replace the example below with your own
    public static final int LETRAS_CIUDAD = 3;
    public static final int LETRAS_NOMBRE = 3;
    public static final int LETRAS_APELLIDO = 3;
    public static final int LETRAS_APELLIDO_MADRE = 2;
    private String nombre;
    private String apellido;
    private String apellidoMadre;
    private String ciudad;

    /**
     * Constructor for objects of class GameGenerator
     */
    public GameGenerator()
    {
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String generateStarWarsName(String nombre, String apellido, String apellidoMadre, String ciudad)
    {
        return apellido.substring(0,LETRAS_APELLIDO) + nombre.toLowerCase().substring(0,LETRAS_NOMBRE) + " " + 
            apellidoMadre.substring(0,LETRAS_APELLIDO_MADRE) + ciudad.toLowerCase().substring(0,LETRAS_CIUDAD);
    }
}
