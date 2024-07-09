Diagrama de um Componente iPhone
classDiagram
    Iphone --|> Telefone
    Iphone --|> ReprodutorMusical
    Iphone --|> Navegador
    class Telefone{
      +ligar(String numero)
      +atender()
      +iniciarCorreioVoz()
    }
    class ReprodutorMusical{
      +tocar()
      +pausar()
      +selecionarMusica(String musica)
    }
    class Navegador{
      +exibirPagina(String url)
      +adicionarNovaAba()
      +atualizarPagina()
    }
