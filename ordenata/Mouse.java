package ordenata;

/**
 *Se crea una clase llamada Mouse, con su atributo Mouse
 * @author DANIELCASTELAO\oyagualendara
 */
public class Mouse {
  private String mouse;

    /**
     * Método constructor de parámetros
     */
    public Mouse() {
    }

    /**
     * El constructor de métodos públicos con parámetros de mouse tiene asignados atributos de mouse
     * @param mouse el tipo de tiempo que se implementa
     */
    public Mouse(String mouse) {
        this.mouse = mouse;
    }
  

    /**
     * Método público vacío, muestra el valor de la cadena del mouse
     * @param mouse el tipo de tiempo que se implementa
     */
    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    /**
     *método String, devuelve el valor del mouse
     * @return
     */
    public String getMouse() {
        return mouse;
    }
}