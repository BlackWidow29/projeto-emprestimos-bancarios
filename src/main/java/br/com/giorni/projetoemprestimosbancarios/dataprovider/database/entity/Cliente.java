package br.com.giorni.projetoemprestimosbancarios.dataprovider.database.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private String nome;
    @Column
    private String cpf;
    @Column
    private String agencia;
    @Column
    private String conta;
    @Column
    private String email;
    @OneToMany(mappedBy = "cliente")
    private Set<Telefone> telefones;
}
