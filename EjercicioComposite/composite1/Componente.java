package composite1;

/**
 * Interfaz que define un componente modificable como plantilla para la creación de componentes.
 * Un componente puede representar tanto elementos hoja como compuestos en una estructura compuesta.
 */
public interface Componente {

    /**
     * Agrega un componente a este componente compuesto.
     * @param componente El componente que se va a agregar.
     */
    public void addComponente(Componente componente);

    /**
     * Elimina un componente de este componente compuesto.
     * @param componente El componente que se va a eliminar.
     */
    public void removeComponente(Componente componente);

    /**
     * Realiza una operación específica sobre el componente.
     * El comportamiento de esta operación puede variar dependiendo del tipo de componente.
     * @return El resultado de la operación realizada sobre el componente.
     */
    public Object operacion();
}
