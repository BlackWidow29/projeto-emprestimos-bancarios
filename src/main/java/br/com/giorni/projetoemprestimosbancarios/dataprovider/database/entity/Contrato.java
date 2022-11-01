package br.com.giorni.projetoemprestimosbancarios.dataprovider.database.entity;

import br.com.giorni.projetoemprestimosbancarios.domain.enums.SituacaoContrato;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Contrato {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "numero_contrato")
    private BigInteger numeroContrato;

    @Column(name = "saldo_devedor")
    private Double saldoDevedor;

    @Column(name = "saldo_total")
    private Double saldoTotal;

    @Column(name = "taxa_juros")
    private Float taxaJuros;

    @Column(name = "situacao_contrato")
    private SituacaoContrato situacaoContrato;

}
