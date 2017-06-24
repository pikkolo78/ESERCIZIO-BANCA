public class BankAccountTester
{
   public static void main(String[] args)
   {
    BankAccount harrychecking = new BankAccount(1000);// creazione primo oggetto "fondo1" con versamento nel costruttore
    BankAccount momsSaving = new BankAccount();//creazione secondo oggetto "fondo2"
    harrychecking.bankAccountPrelievo(500);
    System.out.println("Il saldo rimanente in banca e': " + harrychecking.bankAccountPrelievo(400));

    momsSaving.versamento(3432.3);
    momsSaving.versamento(853.7);
    momsSaving.prelievo(954.4);
    momsSaving.interessi(10);
    System.out.println("Il bilancio del conto in banca al netto degli interessi e': "+ momsSaving.getFondoDue());



   }



}
