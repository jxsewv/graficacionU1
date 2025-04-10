/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.grafpractica1;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

/**
 *
 * @author chuch
 */
public class Punto {
    private float Px;
    private float Py;
    
    
    /**
     * @return the Px
     */
    public float getPx() {
        return Px;
    }

    /**
     * @param Px the Px to set 
     */
    public void setPx(float Px) {
        this.Px = Px;
    }

    /**
     * @return the Py
     */
    public float getPy() {
        return Py;
    }

    /**
     * @param Py the Py to set
     */
    public void setPy(float Py) {
        this.Py = Py;
    }

    public Punto(float Px, float Py) {
        this.Px = Px;
        this.Py = Py;
    }
    
    public matriz31 getmatriz()
    {
        return new matriz31(getPx(), getPy(), 1);
    }
    
    public void AplicarMatriz(matriz31 m)
    {
        setPx(m.datos[0]);
        setPy(m.datos[1]);
    }
    
    public void Transformar(Matriz33 m_trans)
    {
        AplicarMatriz(Operaciones2D.MultiplicarM33xM31(m_trans, getmatriz()));
    }

    public void Dibujar (ShapeRenderer shpRender)
    {
        shpRender.setColor(Color.BLUE);
        shpRender.circle(getPx()*Figura.escala,getPy()*Figura.escala, 6);
        
    }

    @Override
    public String toString() {
        return "(" + getPx() + "," + getPy() + ")";
    }
    
    
}
