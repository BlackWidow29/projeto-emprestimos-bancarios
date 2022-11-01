package br.com.giorni.projetoemprestimosbancarios.dataprovider.database.entity.parcela;

import br.com.giorni.projetoemprestimosbancarios.dataprovider.database.entity.Contrato;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
public class ParcelaContratoId implements Serializable {

    @Column(name = "numero_parcela")
    private Long numeroParcela;

    @ManyToOne
    @JoinColumn(name = "contrato_id")
    private Contrato contrato;
}
