public class BankAccount
{
   private double fondo1;
   private double fondo2;


      public BankAccount(double versamento)
      {
       this.fondo1=this.fondo1 + versamento;
      }
      public double bankAccountPrelievo(double prelievo)
      {
        this.fondo1=this.fondo1-prelievo;
        return this.fondo1;
      }





      public BankAccount()
      {
        this.fondo2=0;
      }
      public void versamento(double vers)//tramite il metodo si versa denaro
      {
        this.fondo2=this.fondo2+vers;
      }
      public void prelievo(double preli)//tramite il metodo si preleva denaro sottraendolo dall attributo "fondo2"
      {
        this.fondo2=this.fondo2-preli;
      }
      public double getFondoDue()//metodo per sapere il denaro disponibile nel conto
      {
        return this.fondo2;
      }
      public void interessi(double tasso) //metodo per calcolare gli interessi sul conto
      {
      double interesse=(this.fondo2*tasso)/100;
      this.fondo2=this.fondo2-interesse;
      }











}
