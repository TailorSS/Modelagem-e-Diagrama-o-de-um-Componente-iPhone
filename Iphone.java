import Apps.Navegador;
import Apps.ReprodutorMusical;
import Apps.Telefone;

abstract class Iphone implements Navegador, ReprodutorMusical, Telefone {
     public void exibirPagina(String url){
         System.out.println("Exibindo página");
     }
     public void adicionarNovaAba(){
         System.out.println("Nova aba adicionada");
     }
     public void atualizarPagina(){
         System.out.println("Página atualizada");
     }
     public void tocar(){
         System.out.println("Tocando musica");
     }
     public void pausar(){
         System.out.println("Musica pausada");
     }
     public void selecionarMusica(){
         System.out.println("Selecione a musica desejada");
     }
     public void ligar (String numero){
         System.out.println("Ligando para " + numero);
     }
     public void atender (){
         System.out.println("Chamada conectada");
     }
     public void iniciarCorreioVoz(){
         System.out.println("Deixe sua mensagem");
     }
}
