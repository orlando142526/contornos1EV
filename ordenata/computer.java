
package ordenata;

/**
 *
 * @author DANIELCASTELAO\oyagualendara
 */
public class computer {
 private Mouse mouse;
    private Window Window;
    private memory CPU;

    /**
     *Método constructor sin parámetros con contenido de los atributos agregando objetos
     */
    public computer() {
        mouse = new Mouse();
        Window = new Window();
        CPU = new memory();
    }

    /**
     *Constructor con parametros
     *
     * @param Mouse clase con los atributos del mouse
     * @param Window clase con los atributos de windows
     * @param CPU clase con los atributos de memoria
     */
    public computer(Mouse Mouse, Window Window, memory CPU) {
        this.mouse = Mouse;
        this.Window = Window;
        this.CPU = CPU;
    }

    /**
     * método público vacío, muestra el valor del mouse
     *
     * @param mouse clase con los atributos del Mouse
     */
    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    /**
     * Método del mouse, devuelve el valor del mouse
     *
     * @return 
     */
    public Mouse getMouse() {
        return mouse;
    }

    /**
     * Método público vacío, muestra el valor de la Window
     *
     * @param Window clase con el atributo Window
     */
    public void setWindow(Window Window) {
        this.Window = Window;
    }

    /**
     * Window metodo, devuelve el valor de Window
     *
     * @return
     */
    public Window getWindow() {
        return Window;
    }

    /**
     * Método público vacío, muestra el valor de la CPU
     *
     * @param CPU clase con el atributo CPU
     */
    public void setCPU(memory CPU) {
        this.CPU = CPU;
    }

    /**
     * Método de memory, devuelve el valor de la CPU
     *
     * @return
     */
    public memory getCPU() {
        return CPU;
    }

    /**
     *Método público vacío llamado amosar, los atributos se muestran llamando a getters
     */
    public void amosar() {
        System.out.println("Rato: " + mouse.getMouse() + "\nPantalla marca: " + Window.setbrands() + "\nPantalla pulgadas: " + Window.getbrinch() + "\nCPU velocidade: " + CPU.setspeed() + "\nCPU memoria: " + CPU.getmemory());
    }
}