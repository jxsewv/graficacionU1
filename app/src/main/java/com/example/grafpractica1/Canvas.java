/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.grafpractica1;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.PerspectiveCamera;
import com.badlogic.gdx.graphics.VertexAttributes;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g3d.Environment;
import com.badlogic.gdx.graphics.g3d.Material;
import com.badlogic.gdx.graphics.g3d.Model;
import com.badlogic.gdx.graphics.g3d.ModelBatch;
import com.badlogic.gdx.graphics.g3d.ModelInstance;
import com.badlogic.gdx.graphics.g3d.attributes.ColorAttribute;
import com.badlogic.gdx.graphics.g3d.environment.DirectionalLight;
import com.badlogic.gdx.graphics.g3d.shaders.DefaultShader;
import com.badlogic.gdx.graphics.g3d.utils.CameraInputController;
import com.badlogic.gdx.graphics.g3d.utils.DefaultShaderProvider;
import com.badlogic.gdx.graphics.g3d.utils.ModelBuilder;
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
    
    VentanaPrincipal padre;
    
    //para 3d
    Environment environment;
    ModelBatch modelbatch;
    PerspectiveCamera camera;
    ModelBuilder builder;
    CameraInputController camInput;
    
    
    DefaultListModel<Figura> listaFiguras;
    DefaultListModel<Figura3D> listaFiguras3D;
    
    
    public Canvas(VentanaPrincipal padre){
        this.padre = padre; 
        listaFiguras = new DefaultListModel<>();
        listaFiguras3D = new DefaultListModel<>();
        
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
        
       environment = new Environment();
       environment.set(new ColorAttribute(ColorAttribute.AmbientLight, 0.4f, 0.4f, 0.4f, 1f));
       environment.add(new DirectionalLight().set(0.8f, 0.8f, 0.8f, -1f, -0.8f, -0.2f));
       
        DefaultShader.Config shader_config = new DefaultShader.Config();
        shader_config.numDirectionalLights = 1;
        shader_config.numPointLights = 0;
        shader_config.numBones = 16;
       
       modelbatch = new ModelBatch(new DefaultShaderProvider(shader_config));
       
       
       camera = new PerspectiveCamera(67, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
       camera.position.set(10f,10f,10f);
       camera.lookAt(0, 0, 0);
       camera.near = 1f;
       camera.far = 300f;
       camera.update();
       
       builder = new ModelBuilder();
       camInput = new CameraInputController(camera);
       Gdx.input.setInputProcessor(camInput);
       
      
       
  
        
    }
    
    
    @Override
    public void resize(int i, int i1) {
    //System.out.println("rezise");
    }
    //float i =0;
    
    
     
    
    //Punto p1 = new Punto(50, 50);
    //Punto p2 = new Punto(100, 100);
    
    public void render2D(){
        
    Gdx.gl.glClearColor(0, 0f, 0f, 1);
    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    
    

    shpRender.begin(ShapeRenderer.ShapeType.Filled);

 
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
    
    public void render3D(){
    //Gdx.gl.glClearColor(0f, 0f, 0f, 1);
    //Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    Gdx.gl.glViewport(0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT);  
    
    if(padre.BTNArriba.getModel().isPressed()){
        camera.position.y += 0.1f;
    }
    else if(padre.BTNAbajo.getModel().isPressed()){
        camera.position.y -=0.1f;
    }
    else if(padre.BTNIzquierda.getModel().isPressed()){
        camera.position.x +=0.1f;
    }
    else if(padre.BTNDerecha.getModel().isPressed()){
        camera.position.x -=0.1f;
    }
    else if(padre.BTNFrente.getModel().isPressed()){
        camera.position.z +=0.1f;
    }
    else if(padre.BTNAtras.getModel().isPressed()){
        camera.position.z -=0.1f;
    }
    
    
    camera.update();
    camInput.update();
    
    modelbatch.begin(camera);
        for (int i = 0; i < listaFiguras3D.size(); i++) {
            Figura3D f3d = listaFiguras3D.get(i);
            if(!f3d.isInicializado()){
                f3d.inicializar(builder);
            }
            
            f3d.Dibujar(modelbatch, environment);
        }
    modelbatch.end();
    
 
    
    }
            
    @Override
    public void render() {
        if (padre.radioButton2d.isSelected())
            render2D();
        else
            render3D();
   
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
