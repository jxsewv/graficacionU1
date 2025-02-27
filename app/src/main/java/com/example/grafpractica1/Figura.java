/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.grafpractica1;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import javax.swing.DefaultListModel;

/**
 *
 * @author chuch
 */
public class Figura {

    public static int escala = 10;
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the puntos
     */
    public DefaultListModel<Punto> getListaPuntos() {
        if(listaPuntos==null)
        {
            listaPuntos = new DefaultListModel<>();
            
        }
        return listaPuntos;
    }

    /**
     * @param puntos the puntos to set
     */
    public void setListaPuntos(DefaultListModel<Punto> puntos) {
        this.listaPuntos = puntos;
    }
    private String nombre;
    private DefaultListModel<Punto> listaPuntos;

    public Figura(String nombre) {
        this.nombre = nombre;
        
        //getListaPuntos().addElement(new Punto(50,50));
        //getListaPuntos().addElement(new Punto(50,100));
       
    }
    public void dibujar(ShapeRenderer shpRender){
        for (int i = 0; i < getListaPuntos().size(); i++){
            Punto p = getListaPuntos().getElementAt(i);
            p.Dibujar(shpRender);
        }
    }
    @Override
    public String toString(){
        return getNombre();
    }
    
}
