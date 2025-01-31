package br.com.liketinder.models.menu

import br.com.liketinder.models.pessoa.PessoaFisica
import br.com.liketinder.models.empresa.Empresa

class Menu {
    private List<PessoaFisica> candidatos = []
    private List<Empresa> empresas = []

    Menu(List<PessoaFisica> candidatos, List<Empresa> empresas) {
        this.candidatos = candidatos
        this.empresas = empresas
    }

    void exibirMenu() {
        Scanner scanner = new Scanner(System.in)
        int opcao

        do {
            println("\n===== MENU =====")
            println("1. Listar todos os candidatos")
            println("2. Listar todas as empresas")
            println("3. Sair")
            print("Escolha uma opção: ")

            try {
                opcao = scanner.nextInt()
                scanner.nextLine()

                switch (opcao) {
                    case 1:
                        listarCandidatos()
                        break
                    case 2:
                        listarEmpresas()
                        break
                    case 3:
                        println("Saindo do programa...")
                        break
                    default:
                        println("Opção inválida. Tente novamente.")
                }
            } catch (InputMismatchException e) {
                println("Entrada inválida. Digite um número válido.")
                scanner.nextLine() // Limpa o buffer
                opcao = 0
            }
        } while (opcao != 3)
    }

    private void listarCandidatos() {
        println("\n=== Lista de Candidatos ===")
        if (candidatos.isEmpty()) {
            println("Nenhum candidato cadastrado.")
        } else {
            candidatos.each { println(it) }
        }
    }

    private void listarEmpresas() {
        println("\n=== Lista de Empresas ===")
        if (empresas.isEmpty()) {
            println("Nenhuma empresa cadastrada.")
        } else {
            empresas.each { println(it) }
        }
    }
}
