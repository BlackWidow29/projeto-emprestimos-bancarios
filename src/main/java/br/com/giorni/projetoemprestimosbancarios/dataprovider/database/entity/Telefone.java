package br.com.giorni.projetoemprestimosbancarios.dataprovider.database.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Telefone {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private String numero;
    @Column
    private Boolean principal;
    @ManyToOne
    @JoinColumn(name = "cliente")
    private Cliente cliente;
}
