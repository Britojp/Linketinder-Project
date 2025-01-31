package br.com.liketinder.controller.curtida

import br.com.liketinder.models.empresa.Empresa
import br.com.liketinder.models.pessoa.PessoaFisica

class Curtida {
    PessoaFisica candidato;
    Empresa empresa;


    boolean isMatch(){
        return candidato != null && empresa != null;
    }
}
