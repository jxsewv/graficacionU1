/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.grafpractica1;

/**
 *
 * @author chuch
 */
public class Operaciones2D {
    public static Matriz33 getMatrizIdentidad()
    {
        return new Matriz33(1f, 0, 0, 0, 1f, 0, 0, 0, 1f);
    }
    
    public static Matriz33 getMatrizTraslacion(float tx, float ty)
    {
        Matriz33 m = getMatrizIdentidad();
        m.datos[2][0] = tx;
        m.datos[2][1] = ty;
        return m;
        
    }
    public static matriz31 MultiplicarM33xM31(Matriz33 m33, matriz31 m31)
    {
        matriz31 resultado = new matriz31(0,0,1);
        return resultado;
    }
}
