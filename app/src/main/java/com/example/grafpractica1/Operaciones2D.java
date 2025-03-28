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
        public static Matriz33 getMatrizEscalado(float sx, float sy)
    {
        Matriz33 m = getMatrizIdentidad();
        return m;
        
    }
    
        public static Matriz33 getMatrizRotacion(float angulo)
    {
        Matriz33 m = getMatrizIdentidad();
        return m;
        
        }
        
        public static Matriz33 getMatrizSesgadoX(float shx)
    {
        Matriz33 m = getMatrizIdentidad();
        return m;
        
        }
        
        public static Matriz33 getMatrizSesgadoY(float shy)
    {
        Matriz33 m = getMatrizIdentidad();
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
