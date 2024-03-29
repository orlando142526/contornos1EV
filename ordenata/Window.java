
package ordenata;

/**
 *Se crea una clase llamada Window, con los atributos respectivos.
 * @author DANIELCASTELAO\oyagualendara
 */

public class Window {
     private String brands;
    private float brinch;

    /**
     * Método constructor de parámetros
     */
    public Window() {
    }

    /**
     * Al método de constructor público con parámetros de pantalla se le asignan atributos de marca y brinch
     *
     * @param brands marca pantalla
     * @param brinch tamaño pantalla
     */
    public Window(String brands, float brinch) {
        this.brands = brands;
        this.brinch = brinch;
    }

 
    /**
     * Empty public method, shows brand string value
     *
     * @param brands
     */
    public void setbrands(String brands) {
        this.brands = brands;
    }

    /**
     * String method, returns the mark value
     *
     * @return
     */
    public String setbrands() {
        return brands;
    }

    /**
     * Empty public method, shows brinch float value
     *
     * @param brinch
     */
    public void setbrinch(float brinch) {
        this.brinch = brinch;
    }

    /**
     * Float method, returns the brinch value
     *
     * @return
     */
    public float getbrinch() {
        return brinch;
    }
}

