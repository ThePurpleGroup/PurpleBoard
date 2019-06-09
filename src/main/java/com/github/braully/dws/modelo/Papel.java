/**
 * This file was generated by the Jeddict
 */
package com.github.braully.dws.modelo;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author strike
 */
@Entity
public class Papel {

    @Id
    @GeneratedValue
    private Long id;

    @Basic
    private String nome;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}