/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.grafpractica1;

import com.badlogic.gdx.graphics.Color;
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
public void dibujar(ShapeRenderer shpRender) {
    // Dibujar líneas entre puntos consecutivos
    for (int i = 0; i < getListaPuntos().size() - 1; i++) {
        Punto p1 = getListaPuntos().getElementAt(i);
        Punto p2 = getListaPuntos().getElementAt(i + 1);

        shpRender.setColor(Color.RED);
        shpRender.line(p1.getPx() * escala, p1.getPy() * escala, 
                       p2.getPx() * escala, p2.getPy() * escala);
    }

    // Dibujar línea del último punto al primero (cerrar figura)
    if (getListaPuntos().size() > 2) {
        Punto primero = getListaPuntos().getElementAt(0);
        Punto ultimo = getListaPuntos().getElementAt(getListaPuntos().size() - 1);

        shpRender.setColor(Color.RED);
        shpRender.line(ultimo.getPx() * escala, ultimo.getPy() * escala,
                       primero.getPx() * escala, primero.getPy() * escala);
    }

    // Dibujar los puntos
    for (int i = 0; i < getListaPuntos().size(); i++) {
        Punto p = getListaPuntos().getElementAt(i);
        p.Dibujar(shpRender);
    }
    }

public void Transformar(Matriz33 m_trans)
{
     for (int i = 0; i < getListaPuntos().size(); i++) {
        Punto p = getListaPuntos().getElementAt(i);
        p.Transformar(m_trans);
    }   
}

    public String Serializar()
    {
        String s = getNombre() + ",";
        for (int i = 0; i < getListaPuntos().size(); i++) {
        Punto p = getListaPuntos().getElementAt(i);
        
        s += p.getPx() + ",";
        s += p.getPy() + ",";
    }   
        return s;
    }

    @Override
    public String toString(){
        return getNombre();
    }
    
}
