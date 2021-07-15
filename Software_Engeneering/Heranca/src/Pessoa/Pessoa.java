package Pessoa;

abstract class Pessoa
{
   private String nome;
   
   public void SetNome(String nome)
   {
      this.nome=nome;
   }
   public String getNome()
   {
      return nome;
   }
}
