package isoccer.model.partner;

public abstract class FanPartner {
   public String address, cpf, email, name;
   public boolean defaulting;
   public final int id;
   public long phone;

   protected FanPartner(int id) {
      this.address = this.cpf = this.email = this.name = "-";
      this.id = id;
   }

   protected abstract double getContribution();

   @Override
   public String toString() {
      return "Nome: " + this.name + "\nE-mail: " + this.email + "\nCPF: " +
         this.cpf + "\nEndereço: " + this.address + "\nTelefone: " +
         this.phone + "\nValor de contribuição: " + this.getContribution();
   }
}