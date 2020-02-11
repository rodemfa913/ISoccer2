package isoccer.model.partner;

import isoccer.ISoccer;
import isoccer.model.Factory;
import isoccer.model.RegEx;

public abstract class FanPartnerFactory implements Factory<FanPartner> {
   private static int count;
   protected static Exception formatException = new Exception("Formato incorreto.");

   protected int getCount() {
      return FanPartnerFactory.count++;
   }

   public abstract void setContribution(double contribution);

   protected void setInfo(FanPartner partner) throws Exception {
      System.out.print("Nome: ");
      String name = ISoccer.input.nextLine();

      if (name.isEmpty())
         name = "-";

      partner.name = name;
      System.out.print("E-mail: ");
      String email = ISoccer.input.nextLine();

      if (!email.matches(RegEx.email))
         throw FanPartnerFactory.formatException;

      partner.email = email;
      System.out.print("CPF: ");
      String cpf = ISoccer.input.nextLine();

      if (!cpf.matches(RegEx.cpf))
         throw FanPartnerFactory.formatException;

      partner.cpf = cpf;
      System.out.print("Telefone: ");
      partner.phone = Long.parseLong(ISoccer.input.nextLine());
      System.out.print("Endereço: ");
      String address = ISoccer.input.nextLine();

      if (address.isEmpty())
         address = "-";

      partner.address = address;
   }
}