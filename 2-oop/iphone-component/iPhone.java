public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

  @Override
  public void tocar() {
      System.out.println("Tocando música.");
  }

  @Override
  public void pausar() {
      System.out.println("Música pausada.");
  }

  @Override
  public void selecionarMusica(String musica) {
      System.out.println("Selecionando a música: " + musica);
  }

  @Override
  public void ligar(String numero) {
      System.out.println("Ligando para o número: " + numero);
  }

  @Override
  public void atender() {
      System.out.println("Atendendo chamada.");
  }

  @Override
  public void iniciarCorreioVoz() {
      System.out.println("Iniciando correio de voz.");
  }

  @Override
  public void exibirPagina(String url) {
      System.out.println("Exibindo a página: " + url);
  }

  @Override
  public void adicionarNovaAba() {
      System.out.println("Adicionando nova aba.");
  }

  @Override
  public void atualizarPagina() {
      System.out.println("Atualizando a página.");
  }

  public static void main(String[] args) {
      iPhone meuiPhone = new iPhone();

      meuiPhone.tocar();
      meuiPhone.selecionarMusica("Bohemian Rhapsody");
      meuiPhone.pausar();
      System.out.println("---");

      meuiPhone.ligar("123456789");
      meuiPhone.atender();
      meuiPhone.iniciarCorreioVoz();
      System.out.println("---");

      meuiPhone.exibirPagina("www.google.com");
      meuiPhone.adicionarNovaAba();
      meuiPhone.atualizarPagina();
  }
}
