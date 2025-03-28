/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.grafpractica1;

/**
 *
 * @author chuch
 */
public class matriz31 {
        public float [] datos;

    public matriz31() {
        datos = new float [3];
    }
    public matriz31(float n0,
                    float n1,
                    float n2
  
    ) {
        datos = new float [3];
        datos [0] = n0;
        datos [1] = n1;
        datos [2] = n2;

    }    

    @Override
    public String toString() {
        String s = "";

            for (int j = 0; j < 3; j++) {
                s += datos [j] + ",";
            }

        return s;
    
}
}