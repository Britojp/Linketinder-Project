package br.com.liketinder.models.pessoa

import br.com.liketinder.models.empresa.Empresa

class PessoaFisica implements Pessoa {
     String nome
     String email
     String estado
     String CEP
     String descricao
     List<String> competencias
     String CPF
     int idade
     List<Empresa> listaEmpresas = []

    PessoaFisica(String nome, String email, String CPF, int idade, String estado, String CEP, String descricao, List<String> competencias) {
        this.setNome(nome)
        this.setEmail(email)
        this.CPF = CPF
        this.idade = idade
        this.setEstado(estado)
        this.setCEP(CEP)
        this.setDescricao(descricao)
        this.setCompetencias(competencias)
    }

    @Override
    String getNome() { return nome }

    @Override
    void setNome(String nome) { this.nome = nome }

    @Override
    String getEmail() { return email }

    @Override
    void setEmail(String email) { this.email = email }

    @Override
    String getEstado() { return estado }

    @Override
    void setEstado(String estado) { this.estado = estado }

    @Override
    String getCEP() { return CEP }

    @Override
    void setCEP(String CEP) { this.CEP = CEP }

    @Override
    String getDescricao() { return descricao }

    @Override
    void setDescricao(String descricao) { this.descricao = descricao }

    @Override
    List<String> getCompetencias() { return competencias }

    @Override
    void setCompetencias(List<String> competencias) { this.competencias = competencias }


    @Override
    String toString() {
        return "PessoaFisica(nome='$nome', email='$email', CPF='$CPF', idade=$idade, estado='$estado', CEP='$CEP', descricao='$descricao', competencias=$competencias)"
    }
}