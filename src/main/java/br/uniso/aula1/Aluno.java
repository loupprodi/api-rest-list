package br.uniso.aula1;

import jdk.nashorn.internal.ir.annotations.Immutable;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


@Entity
@Table(name="ALUNO")
@Data
public class Aluno implements Serializable {

    private static final long serialVersionUID = 1L;


    @Id
    @Column(name = "ra", nullable = false)
    private Integer ra;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "curso", nullable = false)
    private String curso;

    @Column(name = "idade", nullable = false)
    private Integer idade;

}