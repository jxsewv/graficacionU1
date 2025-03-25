/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.grafpractica1;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import javax.swing.DefaultListModel;

/**
 *
 * @author chuch
 */
public class Canvas implements ApplicationListener {

    SpriteBatch sptbatch;
    BitmapFont bmpfont;
    ShapeRenderer shpRender;
    
    
    DefaultListModel<Figura> listaFiguras;
    
    public Canvas(){
        listaFiguras = new DefaultListModel<>();
        
        //Figura f = new Figura("f1");  
        //f.getListaPuntos().addElement(new Punto(50,50));
        //f.getListaPuntos().addElement(new Punto(50,100));
        
        //listaFiguras.addElement(f);
        
        
        //f = new Figura("f2 ");  
        //f.getListaPuntos().addElement(new Punto(100,200));
        //f.getListaPuntos().addElement(new Punto(300,300));
        //f.getListaPuntos().addElement(new Punto(400,600));
        
        //listaFiguras.addElement(f);
        
        
     
    }
    
    
    @Override
    public void create() {
        //System.out.println("Se llamo a create");
        sptbatch = new SpriteBatch();
        bmpfont = new BitmapFont();
        shpRender = new ShapeRenderer();
    }
    
    
    @Override
    public void resize(int i, int i1) {
    //System.out.println("rezise");
    }
    //float i =0;
    
    
     
    
    //Punto p1 = new Punto(50, 50);
    //Punto p2 = new Punto(100, 100);
    
    @Override
    public void render() {
   
    Gdx.gl.glClearColor(0, 0f, 0f, 1);
    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    
    

    shpRender.begin(ShapeRenderer.ShapeType.Line);

 
    for (int j = 0; j < listaFiguras.getSize(); j++) {
        listaFiguras.get(j).dibujar(shpRender);
    }

    shpRender.end();
    
    // Dibujar cuadrícula 
    shpRender.begin(ShapeRenderer.ShapeType.Line);
    shpRender.setColor(Color.DARK_GRAY);
    int gridSize = 20; // Tamaño de cada celda
    int width = Gdx.graphics.getWidth();
    int height = Gdx.graphics.getHeight();

    // Dibujar líneas verticales
    for (int x = 0; x < width; x += gridSize) {
        shpRender.line(x, 0, x, height);
    }

    // Dibujar líneas horizontales
    for (int y = 0; y < height; y += gridSize) {
        shpRender.line(0, y, width, y);
    }
    shpRender.end();
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
        sptbatch.dispose();
        bmpfont.dispose();
        shpRender.dispose();
    }
    
    
}
