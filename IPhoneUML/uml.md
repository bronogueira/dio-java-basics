classDiagram
    class IPhone {
      +Aplicativo[] aplicativos
      +void power()
    }

    class Aplicativo {
      -int id
      -String titulo
      +void abrirApp()
      +void fecharApp()
    }

    class ReprodutorMusical {
      +void tocar()
      +void pausar()
      +void selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
      +void ligar(String numero)
      +void atender()
      +void iniciarCorreioVoz()
    }

    class NavegadorInternet {
      +void exibirPagina(String url)
      +void adicionarNovaAba()
      +void atualizarPagina()
    }

    IPhone <-- Aplicativo
    Aplicativo --|> ReprodutorMusical
    Aplicativo --|> AparelhoTelefonico
    Aplicativo --|> NavegadorInternet