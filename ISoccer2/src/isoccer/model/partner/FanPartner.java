package isoccer.model.partner;

public abstract class FanPartner {
   protected String address, cpf, email, name;
   protected boolean defaulting;
   public final int id;
   protected long phone;

   protected FanPartner(int id) {
      this.address = this.cpf = this.email = this.name = "-";
      this.id = id;
   }

   public String getAddress() {
      return this.address;
   }

   public abstract double getContribution();

   public String getCPF() {
      return this.cpf;
   }

   public String getEmail() {
      return this.email;
   }

   public String getName() {
      return this.name;
   }

   public long getPhone() {
      return this.phone;
   }

   public boolean isDefaulting() {
      return this.defaulting;
   }

   @Override
   public String toString() {
      return "Nome: " + this.name + "\nE-mail: " + this.email + "\nCPF: " +
         this.cpf + "\nEndereço: " + this.address + "\nTelefone: " +
         this.phone + "\nValor de contribuição: " + this.getContribution();
   }
}