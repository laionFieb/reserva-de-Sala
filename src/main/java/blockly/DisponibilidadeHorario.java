package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class DisponibilidadeHorario {

public static final int TIMEOUT = 300;

/**
 *
 * @author Breno Albergaria Argolo
 * @since 30/09/2024, 17:51:04
 *
 */
public static void disponibilidadeHorario() throws Exception {
  new Callable<Var>() {

   public Var call() throws Exception {
    System.out.println(
    cronapi.database.Operations.query(Var.valueOf("app.entity.Reserva"),Var.valueOf("select \n	r.dataInicio, \n	r.dataFim \nfrom \n	Reserva r  \nwhere \n	r.sala = :sala"),Var.valueOf("sala",
    Var.valueOf("Redir"))).getObjectAsString());
   return Var.VAR_NULL;
   }
 }.call();
}

}

