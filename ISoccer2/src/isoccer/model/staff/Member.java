package isoccer.model.staff;

public abstract class Member {
   public String cpf, email, name;
   public final int id;
   public long phone;
   public double salary;

   protected Member(int id) {
      this.cpf = this.email = this.name = "-";
      this.id = id;
   }

   protected abstract String getType();

   @Override
   public String toString() {
      return "Nome: " + this.name + "\nE-mail: " + this.email + "\nCPF: " + this.cpf +
         "\nSalário: " + this.salary + "\nTelefone: " + this.phone + "\nFunção: " + this.getType();
   }
}