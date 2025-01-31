package br.com.liketinder.models.empresa

import br.com.liketinder.models.pessoa.Pessoa

class Empresa implements Pessoa {
    String nome
    String email
    String estado
    String CNPJ;
    String pais;
    String CEP;
    String descricao;
    List<String> competencias;

    Empresa(String nome, String email, String CNPJ, String pais, String estado, String CEP, String descricao, List<String> competencias) {
        setNome(nome);
        setEmail(email);
        this.CNPJ = CNPJ
        this.pais = pais;
        setEstado(estado);
        setCEP(CEP);
        setDescricao(descricao);
        setCompetencias(competencias);
    }

    @Override
    String getNome() {
        return nome;
    }

    @Override
    void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    String getEmail() {
        return email;
    }

    @Override
    void setEmail(String email) {
        this.email = email;
    }

    @Override
    String getEstado() {
        return estado;
    }

    @Override
    void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    String toString() {
        return "Empresa(nome='$nome', email='$email', CNPJ='$CNPJ', pais='$pais', estado='$estado', CEP='$CEP', descricao='$descricao', competencias=$competencias)"
    }
}

