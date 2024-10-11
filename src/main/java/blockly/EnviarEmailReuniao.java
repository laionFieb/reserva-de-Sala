package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class EnviarEmailReuniao {

public static final int TIMEOUT = 300;

/**
 *
 * @param Consulta a Entidades<app.entity.Reserva>
 *
 * @author Breno Albergaria Argolo
 * @since 25/09/2024, 09:30:05
 *
 */
public static Var enviarEmailReuniao(@ParamMetaData(description = "Consulta_a_Entidades", id = "f65230d6") Var Consulta_a_Entidades) throws Exception {
 return new Callable<Var>() {

   private Var tipodeAgenda = Var.VAR_NULL;

   public Var call() throws Exception {
    tipodeAgenda =
    cronapi.list.Operations.get((
    cronapi.database.Operations.query(Var.valueOf("app.entity.ReservaTipo_Agenda"),Var.valueOf("select \n	r.reserva \nfrom \n	ReservaTipo_Agenda r  \nwhere \n	r.reserva.id = :reservaId"),Var.valueOf("reservaId",Var.VAR_NULL))), Var.VAR_ZERO);
    return Var.VAR_NULL;
   }
 }.call();
}

}

