/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.grafpractica1;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;

/**
 *
 * @author chuch
 */
public class Canvas implements ApplicationListener {

    @Override
    public void create() {
        //System.out.println("Se llamo a create");
    }
    

    @Override
    public void resize(int i, int i1) {
    //System.out.println("rezise");
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(0, .5f, .5f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    }

    @Override
    public void pause() {
      //  System.out.println("pause");
    }

    @Override
    public void resume() {
        //System.out.println("resune");
    }

    @Override
    public void dispose() {
        //System.out.println("dispose");
    }
    
    
}
