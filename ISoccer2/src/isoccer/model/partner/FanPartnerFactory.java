package isoccer.model.partner;

import isoccer.ISoccer;
import isoccer.exception.FormatException;
import isoccer.model.Factory;
import isoccer.model.Model;
import isoccer.model.RegEx;

public abstract class FanPartnerFactory implements Factory<FanPartner> {
   public abstract void setContribution(double contribution);

   @Override
   public FanPartner get() throws Exception {
      return FanPartnerFactory.getPartner();
   }

   public static FanPartner getPartner() throws Exception {
      System.out.print("Id: ");
      int id = Integer.parseInt(ISoccer.input.nextLine());
      return Model.me.getPartner(id);
   }

   @Override
   public void put(FanPartner partner) {
      Model.me.setPartner(partner);
   }

   @Override
   public void setInfo(FanPartner partner) throws Exception {
      System.out.print("Nome: ");
      String name = ISoccer.input.nextLine();

      if (name.isEmpty())
         name = "-";

      partner.name = name;
      System.out.print("E-mail: ");
      String email = ISoccer.input.nextLine();

      if (!email.matches(RegEx.email))
         throw new FormatException();

      partner.email = email;
      System.out.print("CPF: ");
      String cpf = ISoccer.input.nextLine();

      if (!cpf.matches(RegEx.cpf))
         throw new FormatException();

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