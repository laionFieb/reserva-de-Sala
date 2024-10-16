package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class VerificarHoararioInicio {

public static final int TIMEOUT = 300;

/**
 *
 * @author Breno Albergaria Argolo
 * @since 13/09/2024, 17:44:45
 *
 */
public static Var verificarHoararioInicio() throws Exception {
 return new Callable<Var>() {

   private Var dataInicio = Var.VAR_NULL;
   private Var horaInicio = Var.VAR_NULL;

   public Var call() throws Exception {
    dataInicio =
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("Reserva.active.dataInicio"));
    horaInicio =
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("Reserva.active.horaInicio"));
    if (
    Var.valueOf(
    Var.valueOf(
    cronapi.dateTime.Operations.getNowNoHour().compareTo(dataInicio) > 0).getObjectAsBoolean() &&
    Var.valueOf(
    cronapi.dateTime.Operations.getNow().compareTo(horaInicio) > 0).getObjectAsBoolean()).getObjectAsBoolean()) {
      {}
    }
    return Var.VAR_NULL;
   }
 }.call();
}

}

