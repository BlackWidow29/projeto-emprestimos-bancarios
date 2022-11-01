package br.com.giorni.projetoemprestimosbancarios.dataprovider.database.entity;

import javax.persistence.*;

@Entity
public class Endereco {
    @Id
    private String cep;
    @Column
    private String logradouro;
    @Column
    private String bairro;
    @Column
    private String numero;
    @Column
    private String cidade;
    @Column
    private String complemento;
    @ManyToOne
    @JoinColumn(name = "uf_id")
    private Estado uf;
}
