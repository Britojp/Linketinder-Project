import br.com.liketinder.models.empresa.Empresa
import br.com.liketinder.models.menu.Menu
import br.com.liketinder.models.pessoa.PessoaFisica

static void main(String[] args) {

  def candidatos = [
          new PessoaFisica("Carlos Silva", "carlos@email.com", "123.456.789-00", 30, "SP", "01000-000", "Desenvolvedor backend", ["Java", "Spring", "SQL"]),
          new PessoaFisica("Mariana Souza", "mariana@email.com", "987.654.321-00", 25, "RJ", "20000-000", "Engenheira de software", ["Python", "Django", "Machine Learning"]),
          new PessoaFisica("Roberto Lima", "roberto@email.com", "111.222.333-44", 28, "MG", "30000-000", "Fullstack developer", ["Angular", "Node.js", "TypeScript"]),
          new PessoaFisica("Ana Costa", "ana@email.com", "555.666.777-88", 32, "RS", "90000-000", "Arquiteta de software", ["Kotlin", "Microservices", "AWS"]),
          new PessoaFisica("Fernando Torres", "fernando@email.com", "999.888.777-66", 27, "SC", "88000-000", "Analista de dados", ["SQL", "Power BI", "Python"])
  ]


  def empresas = [
          new Empresa("Tech Solutions", "contato@techsolutions.com", "12.345.678/0001-99", "Brasil", "SP", "01000-000", "Empresa de tecnologia especializada em desenvolvimento web.", ["Java", "Spring Boot", "Angular"]),
          new Empresa("InovaTech", "suporte@inovatech.com", "98.765.432/0001-55", "Brasil", "RJ", "20000-000", "Empresa focada em inovação e inteligência artificial.", ["Python", "Machine Learning", "Django"]),
          new Empresa("DataCorp", "info@datacorp.com", "23.456.789/0001-66", "Brasil", "MG", "30000-000", "Líder em soluções de Big Data e análise de dados.", ["SQL", "Data Science", "Power BI"]),
          new Empresa("Segurança Digital", "security@segdigital.com", "56.789.123/0001-77", "Brasil", "SC", "40000-000", "Empresa de cibersegurança para proteção de sistemas empresariais.", ["CyberSecurity", "Pentest", "Kali Linux"]),
          new Empresa("CloudHub", "cloud@cloudhub.com", "67.890.234/0001-88", "Brasil", "BA", "50000-000", "Provedora de soluções em nuvem e DevOps.", ["AWS", "Docker", "Kubernetes"])
  ]

  Menu menu = new Menu(candidatos, empresas)
  menu.exibirMenu()
}