package isoccer.model.staff;

public abstract class Member {
   protected String cpf, email, name;
   public final int id;
   protected long phone;
   protected double salary;

   protected Member(int id) {
      this.cpf = this.email = this.name = "-";
      this.id = id;
   }

   public String getCPF() {
      return this.cpf;
   }

   public String getEmail() {
      return this.email;
   }

   public String getName() {
      return this.name;
   }

   public double getSalary() {
      return this.salary;
   }

   public long getPhone() {
      return this.phone;
   }

   public abstract String getType();

   @Override
   public String toString() {
      return "Nome: " + this.name + "\nE-mail: " + this.email + "\nCPF: " + this.cpf +
         "\nSalário: " + this.salary + "\nTelefone: " + this.phone + "\nFunção: " + this.getType();
   }
}