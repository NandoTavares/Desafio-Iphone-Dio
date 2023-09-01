public class iphone implements reprodutor, telefone, internet {

  @Override
  public void tocar() {
    System.out.println("Tocando música...");
  }

  @Override
  public void pausar() {
    System.out.println("Parando...");
  }

  @Override
  public void selecionarMusica() {
    System.out.println("Selecione a musica...");
  }

  @Override
  public void ligar() {
    System.out.println("Ta ligando meu patrão");
  }

  @Override
  public void atender() {
    System.out.println("Atendido");
  }

  @Override
  public void iniciarCorreioVoz() {
    System.out.println("Iniciar correios de voz");
  }

  @Override
  public void exibirPagina() {
    System.out.println("Exibindo a pagina");
  }

  @Override
  public void adicionarNovaAba() {
    System.out.println("Adicionando Nova Aba");
  }

  @Override
  public void atualizarPagina() {
    System.out.println("Atualizando");
  }


  

  public void executarAcao(String acao, String... argumentos) {
    switch (acao) {
        case "ligar":
        System.out.println("Ta ligando meu patrão");
        break;
      case "atender":
        System.out.println("Atendido");
        break;
      case "tocar":
        System.out.println("Tocando música...");
        break;
      case "pausar":
        System.out.println("Parando...");
        break;
      case "selecionarMusica":
        System.out.println("Selecione a musica...");
        break;
      case "exibirPagina":
        System.out.println("Exibindo a pagina");
        break;
      case "adicionarNovaAba":
        System.out.println("Adicionando Nova Aba");
        break;
      case "atualizarPagina":
        System.out.println("Atualizando");
        break;
      default:
        System.out.println("Ação inválida");
    }
  }

  public static void main(String[] args) {
    iphone celular = new iphone();
    System.out.println("Digite a ação que você deseja executar:");
    String acao = System.console().readLine();
    celular.executarAcao(acao);
  }
}