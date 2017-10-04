/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.spring.boot.aula.repository2;

import io.spring.boot.aula.entity.Perfil;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Nataniel Paiva <nataniel.paiva@gmail.com>
 */
public interface PerfilRepository extends MongoRepository<Perfil, String> {
    
}

