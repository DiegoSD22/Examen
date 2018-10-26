/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bimestral.sanchezdg;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author DiegoSD
 */
public interface RepositorioTarjetas extends MongoRepository<TarjetaHabiente, String>{
    
}
