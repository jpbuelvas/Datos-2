/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author User
 */
public class Nodo {
     String info,posicionx,posiciony;
    Nodo izquierdo;
    Nodo derecho;
    Nodo(String info){
        this.info=info;
       
    }

    public String getInfo(){
        return info;
    }
    public Nodo getDerecho(){
        return derecho;
    }

    public Nodo getIzquierdo() {
        return izquierdo;
    }
  
    public void setIzquierdo(Nodo izquierdo) {
        this.izquierdo = izquierdo;
    }

    public void setDerecho(Nodo derecho) {
        this.derecho = derecho;
    }
}
