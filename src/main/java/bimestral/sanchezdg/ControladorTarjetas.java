/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bimestral.sanchezdg;


import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author DiegoSD
 */
@RestController
@RequestMapping("/api")
public class ControladorTarjetas {
    @Autowired RepositorioTarjetas repoTar;
    
    
    //Buscamos todos
    @GetMapping(path="/tarjeta")
    public List<TarjetaHabiente> todos(){
        return repoTar.findAll();
    }
    
    //Buscamos por id
    @GetMapping(path="/tarjeta/{id}")
    public TarjetaHabiente buscarPorId(@PathVariable String id){
        return repoTar.findById(id).get();
    }
    
    //Vamos a guardar para ello siempre se ocupa el post
    @PostMapping(path="/tarjeta", consumes="application/json")
    public Estatus guardar(@RequestBody String json) throws Exception{
        //Primero convertimos este String json a un objeto java
        ObjectMapper maper=new ObjectMapper();
        TarjetaHabiente tarjeta=maper.readValue(json, TarjetaHabiente.class);
        System.out.println(tarjeta);
        Estatus estatus= new Estatus();
        estatus.setSuccess(true);
        estatus.setMensaje("Tarjeta guardada con exito");
        return estatus;
    }
    
     //Generaremos actualizar
     @PutMapping("/tarjetaAct")
     public Estatus actualizar(@RequestBody String json)throws Exception{
        
        //Primero convertimos este String json a un objeto java
        ObjectMapper maper=new ObjectMapper();
        TarjetaHabiente tarjeta =maper.readValue(json, TarjetaHabiente.class);
        repoTar.save(tarjeta);
        System.out.println("Se actualizo: "+tarjeta);
        Estatus estatus = new Estatus();
        estatus.setSuccess(true);
        estatus.setMensaje("Tarjeta guardada con exito");
        return estatus;
    }
    
    //Generamos borrar
    @DeleteMapping("/tarjetaB/{id}")
    public Estatus borrarPorId(@PathVariable String id)throws Exception{
        
        TarjetaHabiente tarjeta = new TarjetaHabiente();
        repoTar.deleteById(id);
       
        Estatus estatus = new Estatus();
        estatus.setSuccess(true);
        estatus.setMensaje("Tarjeta borrada con exito");
        return estatus;
    
    }
}
