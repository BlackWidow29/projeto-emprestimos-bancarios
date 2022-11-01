package br.com.giorni.projetoemprestimosbancarios.domain.enums;

public enum SituacaoContrato {
    EM_DIA("EM DIA"),
    EM_ATRASO("EM ATRASO"),
    CANCELADO("CANCELADO"),
    LIQUIDADO("LIQUIDADO");

    private final String situacao;

    SituacaoContrato(String situacao) {
    this.situacao = situacao;
    }

    public String getSituacao() {
        return situacao;
    }
}
