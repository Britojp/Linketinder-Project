package br.com.liketinder.models.pessoa


interface Pessoa {


    String getNome()
    void setNome(String nome)

    String getEmail()
    void setEmail(String email)

    String getEstado()
    void setEstado(String estado)

    String getCEP()
    void setCEP(String CEP)

    String getDescricao()
    void setDescricao(String descricao)

    List<String> getCompetencias()
    void setCompetencias(List<String> competencias)

}