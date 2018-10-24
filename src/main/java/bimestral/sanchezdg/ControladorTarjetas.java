/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bimestral.sanchezdg;


import com.fasterxml.jackson.databind.ObjectMapper;
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
 * @author T-107
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
        //Recibimos a json con los brazos abiertos
        ObjectMapper maper=new ObjectMapper();
        TarjetaHabiente tarjeta=maper.readValue(json, TarjetaHabiente.class);
        System.out.println(tarjeta);
        Estatus estatus= new Estatus();
        estatus.setSuccess(true);
        estatus.setMensaje("Tarjeta guardada con exito");
        return estatus;
    }
}
