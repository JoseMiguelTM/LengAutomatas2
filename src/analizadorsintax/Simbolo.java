/*
 PARA LA TABLA DE SÍMBOLOS
 */
package analizadorsintax;

/**
 *
 * @author LissetRoman
 */
public class Simbolo {
    int pos_tabla;//posici+on en la tabla 0,1,2
    String tipo_dato;//pos el tipo :v
    String nombre_var;//nombre_variable
    String valor;//el valor de la variable
    int pos_memoria;//no sé que voy a poner aquí
    
    int cont=0;
    
    public Simbolo(String tipo_dato, String nombre_var, String valor){
        this.pos_tabla=cont++;
        this.tipo_dato=tipo_dato;
        this.nombre_var=nombre_var;
        this.valor=valor;
    }
    
    public Simbolo(String nombre_var){
        this.pos_tabla=cont++;
        this.nombre_var=nombre_var;
    }

    public int getPos_tabla() {
        return pos_tabla;
    }

    public String getTipo_dato() {
        return tipo_dato;
    }

    public String getNombre_var() {
        return nombre_var;
    }

    public String getValor() {
        return valor;
    }

    public int getPos_memoria() {
        return pos_memoria;
    }

    public int getCont() {
        return cont;
    }

    public void setPos_tabla(int pos_tabla) {
        this.pos_tabla = pos_tabla;
    }

    public void setTipo_dato(String tipo_dato) {
        this.tipo_dato = tipo_dato;
    }

    public void setNombre_var(String nombre_var) {
        this.nombre_var = nombre_var;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public void setPos_memoria(int pos_memoria) {
        this.pos_memoria = pos_memoria;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    @Override
    public String toString() {
        return "Simbolo{" + "pos_tabla=" + pos_tabla + ", tipo_dato=" + tipo_dato + ", nombre_var=" + nombre_var + ", valor=" + valor + ", pos_memoria=" + pos_memoria + ", cont=" + cont + '}';
    }
    
    
}
