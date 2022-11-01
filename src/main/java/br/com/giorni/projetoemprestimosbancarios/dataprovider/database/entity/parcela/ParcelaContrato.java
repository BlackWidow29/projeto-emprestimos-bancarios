package br.com.giorni.projetoemprestimosbancarios.dataprovider.database.entity.parcela;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class ParcelaContrato {

    @EmbeddedId
    private ParcelaContratoId parcelaContratoId;

    @Column(name = "valor_parcela")
    private Double valorParcela;

    @Column(name = "codigo_situacao_parcela")
    private Integer codigoSituacaoParcela;

    @Column(name = "data_vencimento_parcela")
    private LocalDate dataVencimentoParcela;
}
