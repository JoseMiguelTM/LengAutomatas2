/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizadorsintax;

public class NodosPila {

    private String ind;
    private Nodo val;

    public NodosPila() {
    }

    public NodosPila(String ind, Nodo val) {
        this.ind = ind;
        this.val = val;
    }

    public String getInd() {
        return ind;
    }

    public void setInd(String ind) {
        this.ind = ind;
    }

    public Nodo getVal() {
        return val;
    }

    public void setVal(Nodo val) {
        this.val = val;
    }

}
