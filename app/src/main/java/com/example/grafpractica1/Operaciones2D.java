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
    
    public static Matriz33 getMatrizEscalado(float sx, float sy) {
        Matriz33 m = getMatrizIdentidad();
        m.datos[0][0] = sx; // Escala en X
        m.datos[1][1] = sy; // Escala en Y
        return m;
    }

    public static Matriz33 getMatrizRotacion(float angulo) {
        Matriz33 m = getMatrizIdentidad();
        float radianes = (float) Math.toRadians(angulo); // Convertir grados a radianes
        m.datos[0][0] = (float) Math.cos(radianes); // cos(θ)
        m.datos[0][1] = (float) -Math.sin(radianes); // -sin(θ)
        m.datos[1][0] = (float) Math.sin(radianes); // sin(θ)
        m.datos[1][1] = (float) Math.cos(radianes); // cos(θ)
        return m;
    }

    public static Matriz33 getMatrizSesgadoX(float shx) {
        Matriz33 m = getMatrizIdentidad();
        m.datos[0][1] = shx; // Afecta X en función de Y
        return m;
    }

    public static Matriz33 getMatrizSesgadoY(float shy) {
        Matriz33 m = getMatrizIdentidad();
        m.datos[1][0] = shy; // Afecta Y en función de X
        return m;
    }
    
    public static matriz31 MultiplicarM33xM31(Matriz33 m33, matriz31 m31)
    {
        matriz31 resultado = new matriz31(0,0,1);
        
        resultado.datos[0]= (m33.datos[0][0]*m31.datos[0])+(m33.datos[1][0]*m31.datos[1])+(m33.datos[2][0]*m31.datos[2]) ;
        resultado.datos[1]= (m33.datos[0][1]*m31.datos[0])+(m33.datos[1][1]*m31.datos[1])+(m33.datos[2][1]*m31.datos[2]) ;
        return resultado;
    }
}
