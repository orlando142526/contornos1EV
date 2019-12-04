
package ordenata;

/**
 *Se crea una clase llamada memory, con los atributos respectivos.
 * @author DANIELCASTELAO\oyagualendara
 */
public class memory {

    private int speed;
    private int memory;

    /**
     * Método público vacío, muestra el valor de la memoria
     */
    public memory() {
    }

    /**
     * El generador de métodos públicos con parámetros de memoria tiene
     * asignados los atributos de velocidad y memoria
     *
     * @param speed de transferencia de datos rápida
     * @param memory la capacidad que ocupa los datos
     */
    public memory(int speed, int memory) {
        this.speed = speed;
        this.memory = memory;
    }

    /**
     * Método público vacío, muestra el valor de velocidad int
     *
     * @param speed transferencia de datos rápida
     */
    public void setspeed(int speed) {
        this.speed = speed;
    }

    /**
     * Método int, devuelve el valor de la velocidad
     *
     * @return
     */
    public int setspeed() {
        return speed;
    }

    /**
     * Método público vacío, muestra el valor int de la memoria
     *
     * @param memory la capacidad que ocupa los datos
     */
    public void setmemory(int memory) {
        this.memory = memory;
    }

    /**
     * Método int, devuelve el valor de la velocidad
     *
     * @return
     */
    public int getmemory() {
        return memory;
    }

}
