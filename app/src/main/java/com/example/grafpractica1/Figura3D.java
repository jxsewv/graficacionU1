/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.grafpractica1;

import com.badlogic.gdx.graphics.Color;

/**
 *
 * @author chuch
 */
public class Figura3D {
    enum TiposFigura3D {NINGUNO,CUBO,ESFERA,CONO,CILINDRO}
    private String Nombre;
    private float sx;
    private float sy;
    private float sz;
    private TiposFigura3D tipo = TiposFigura3D.NINGUNO;
    private Color color;

    public Figura3D(String Nombre, float sx, float sy, float sz, Color color, TiposFigura3D tipo) {
        this.Nombre = Nombre;
        this.sx = sx;
        this.sy = sy;
        this.sz = sz;
        this.color = color;
        this.tipo = tipo;
    }
    
    
    
    
    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the sx
     */
    public float getSx() {
        return sx;
    }

    /**
     * @param sx the sx to set
     */
    public void setSx(float sx) {
        this.sx = sx;
    }

    /**
     * @return the sy
     */
    public float getSy() {
        return sy;
    }

    /**
     * @param sy the sy to set
     */
    public void setSy(float sy) {
        this.sy = sy;
    }

    /**
     * @return the sz
     */
    public float getSz() {
        return sz;
    }

    /**
     * @param sz the sz to set
     */
    public void setSz(float sz) {
        this.sz = sz;
    }

    /**
     * @return the tipo
     */
    public TiposFigura3D getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(TiposFigura3D tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(Color color) {
        this.color = color;
    }

    
 
    public void Dibujar (){
    
}
    

    @Override
    public String toString() {
        return getNombre();
    }
    
}
