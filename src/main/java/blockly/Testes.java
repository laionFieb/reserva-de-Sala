package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Testes {

public static final int TIMEOUT = 300;

/**
 *
 * @author Francisco Iago De Sousa Mendes
 * @since 17/09/2024, 16:22:09
 *
 */
public static void Executar() throws Exception {
  new Callable<Var>() {

   public Var call() throws Exception {
    System.out.println(
    cronapi.dateTime.Operations.getMonth(
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("vars.dataDiaTodo"))).getObjectAsString());
   return Var.VAR_NULL;
   }
 }.call();
}

}

