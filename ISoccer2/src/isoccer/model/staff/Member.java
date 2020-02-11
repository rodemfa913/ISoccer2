package isoccer.model.staff;

import isoccer.model.RegEx;

public abstract class Member {
   private String cpf, email, name;
   protected static final Exception formatException = new Exception("Formato incorreto.");
   public final int id;
   public long phone;
   private double salary;

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

   protected abstract String getType();

   public void setCPF(String cpf) throws Exception {
      if (!cpf.matches(RegEx.cpf))
         throw formatException;
      this.cpf = cpf;
   }

   public void setEmail(String email) throws Exception {
      if (!email.matches(RegEx.email))
         throw formatException;
      this.email = email;
   }

   public void setName(String name) {
      if (name.isEmpty())
         name = "-";
      this.name = name;
   }

   public void setSalary(double salary) {
      if (salary < 0.0)
         salary = 0.0;
      this.salary = salary;
   }

   @Override
   public String toString() {
      return "Nome: " + this.name + "\nE-mail: " + this.email + "\nCPF: " + this.cpf +
         "\nSalário: " + this.salary + "\nTelefone: " + this.phone + "\nFunção: " + this.getType();
   }
}