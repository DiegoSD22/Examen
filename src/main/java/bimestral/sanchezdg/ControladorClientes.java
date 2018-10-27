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
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author T-107
 */

@RestController
@RequestMapping("/api")
public class ControladorClientes {
    @Autowired RepositorioCliente repoCli;
    
    //Vamos a guardar para ello siempre se ocupa el post
    @PostMapping(path="/cliente", consumes="application/json")
    public Estatus guardar(@RequestBody String json) throws Exception{
        //Primero convertimos este String json a un objeto java
        ObjectMapper maper=new ObjectMapper();
        Cliente cli=maper.readValue(json, Cliente.class);
        System.out.println(cli);
        Estatus estatus= new Estatus();
        estatus.setSuccess(true);
        estatus.setMensaje("Cliente guardado con exito");
        return estatus;
    }
    
    //Buscamos todos
    @GetMapping(path="/cliente")
    public List<Cliente> todos(){
        return repoCli.findAll();
    }
    
        //Buscamos por id
    @GetMapping(path="/cliente/{id}")
    public Cliente buscarPorId(@PathVariable String id){
        return repoCli.findById(id).get();
    }
    
    //Generaremos actualizar
     @PutMapping("/clienteAct")
     public Estatus actualizar(@RequestBody String json)throws Exception{
        
        //Primero convertimos este String json a un objeto java
        ObjectMapper maper=new ObjectMapper();
        Cliente cli =maper.readValue(json, Cliente.class);
        repoCli.save(cli);
        System.out.println("Se actualizo: "+cli);
        Estatus estatus = new Estatus();
        estatus.setSuccess(true);
        estatus.setMensaje("Cliente editado con exito");
        return estatus;
    }
    
     //Generamos borrar
    @DeleteMapping("/clienteB/{id}")
    public Estatus borrarPorId(@PathVariable String id)throws Exception{
        
        Cliente cli = new Cliente();
        repoCli.deleteById(id);     
        Estatus estatus = new Estatus();
        estatus.setSuccess(true);
        estatus.setMensaje("Cliente borrado con exito");
        return estatus;
    
    }
}
