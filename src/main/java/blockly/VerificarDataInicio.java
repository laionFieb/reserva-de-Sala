package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class VerificarDataInicio {

public static final int TIMEOUT = 300;

/**
 *
 * @author Breno Albergaria Argolo
 * @since 01/10/2024, 19:17:55
 *
 */
public static void ajustarHoraDiaTodo() throws Exception {
  new Callable<Var>() {

   private Var dataDioTodo = Var.VAR_NULL;

   public Var call() throws Exception {
    dataDioTodo =
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("Reserva.active.dataInicio"));
    if (
    Var.valueOf(
    cronapi.dateTime.Operations.getNowNoHour().compareTo(dataDioTodo) > 0).getObjectAsBoolean()) {
        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("error"),
        Var.valueOf("A data selecionada é inferior a data atual!"));
    }
   return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @author Breno Albergaria Argolo
 * @since 01/10/2024, 19:17:55
 *
 */
public static Var verificarDataInicio() throws Exception {
 return new Callable<Var>() {

   private Var dataInicio = Var.VAR_NULL;
   private Var dataInicioNova = Var.VAR_NULL;
   private Var dataAtualNova = Var.VAR_NULL;

   public Var call() throws Exception {
    dataInicio =
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("Reserva.active.dataInicio"));
    dataInicioNova =
    cronapi.dateTime.Operations.newDate(
    cronapi.dateTime.Operations.getYear(dataInicio),
    cronapi.dateTime.Operations.getMonth(dataInicio),
    cronapi.dateTime.Operations.getDay(dataInicio),
    cronapi.dateTime.Operations.getHour(dataInicio),
    cronapi.dateTime.Operations.getMinute(dataInicio),
    Var.VAR_NULL);
    dataAtualNova =
    cronapi.dateTime.Operations.newDate(
    cronapi.dateTime.Operations.getYear(
    cronapi.dateTime.Operations.getNow()),
    cronapi.dateTime.Operations.getMonth(
    cronapi.dateTime.Operations.getNow()),
    cronapi.dateTime.Operations.getDay(
    cronapi.dateTime.Operations.getNow()),
    cronapi.dateTime.Operations.getHour(
    cronapi.dateTime.Operations.getNow()),
    cronapi.dateTime.Operations.getMinute(
    cronapi.dateTime.Operations.getNow()),
    Var.VAR_NULL);
    System.out.println(
    Var.valueOf("DATA NOVA").getObjectAsString());
    System.out.println(dataInicioNova.getObjectAsString());
    if (
    Var.valueOf(dataAtualNova.compareTo(dataInicioNova) > 0).getObjectAsBoolean()) {
        System.out.println(
        cronapi.dateTime.Operations.getNow().getObjectAsString());
        System.out.println(dataInicio.getObjectAsString());
        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("error"),
        Var.valueOf("A data selecionada é inferior a data atual. Escolha outra data válida."));
        System.out.println(
        cronapi.dateTime.Operations.getNow().getObjectAsString());
        System.out.println(dataInicio.getObjectAsString());
    }
    return Var.VAR_NULL;
   }
 }.call();
}

}

