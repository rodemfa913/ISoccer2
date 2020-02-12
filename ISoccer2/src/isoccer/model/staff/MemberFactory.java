package isoccer.model.staff;

import isoccer.ISoccer;
import isoccer.model.Factory;
import isoccer.model.RegEx;
import isoccer.model.staff.Member;

public abstract class MemberFactory implements Factory<Member> {
   protected static Exception formatException = new Exception("Formato incorreto.");

   @Override
   public void setInfo(Member member) throws Exception {
      System.out.print("Nome: ");
      String name = ISoccer.input.nextLine();

      if (name.isEmpty())
         name = "-";

      member.name = name;
      System.out.print("E-mail: ");
      String email = ISoccer.input.nextLine();

      if (!email.matches(RegEx.email))
         throw MemberFactory.formatException;

      member.email = email;
      System.out.print("CPF: ");
      String cpf = ISoccer.input.nextLine();

      if (!cpf.matches(RegEx.cpf))
         throw MemberFactory.formatException;

      member.cpf = cpf;
      System.out.print("Salário: ");
      double salary = Double.parseDouble(ISoccer.input.nextLine());

      if (salary < 0)
         salary = 0;

      member.salary = salary;
      System.out.print("Telefone: ");
      member.phone = Long.parseLong(ISoccer.input.nextLine());
   }
}