package br.com.liketinder.controller.match

import br.com.liketinder.controller.curtida.Curtida
import br.com.liketinder.models.empresa.Empresa
import br.com.liketinder.models.pessoa.PessoaFisica

class Match {
    List<Curtida> listaCurtidas = []

    void candidatoCurteEmpresa(PessoaFisica candidato, Empresa empresa) {
        Curtida curtidaExistente = listaCurtidas.find { it.candidato == candidato && it.empresa == empresa }

        if (!curtidaExistente) {
            Curtida novaCurtida = new Curtida(candidato: candidato, empresa: empresa)
            listaCurtidas.add(novaCurtida)
            println("${candidato.nome} curtiu a empresa ${empresa.nome}")
        }
    }

    void empresaCurteCandidato(Empresa empresa, PessoaFisica candidato) {
        Curtida curtidaExistente = listaCurtidas.find { it.candidato == candidato && it.empresa == empresa }

        if (curtidaExistente) {
            if (curtidaExistente.isMatch()) {
                println(" MATCH! ${candidato.nome} e ${empresa.nome} deram match!")
            } else {
                println("${empresa.nome} curtiu ${candidato.nome}, mas ainda não há um match.")
            }
        } else {
            Curtida novaCurtida = new Curtida(candidato: candidato, empresa: empresa)
            listaCurtidas.add(novaCurtida)
            println("${empresa.nome} curtiu ${candidato.nome}, mas ainda não há um match.")
        }
    }
}
