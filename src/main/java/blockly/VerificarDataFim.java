package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class VerificarDataFim {

public static final int TIMEOUT = 300;

/**
 *
 * @author Breno Albergaria Argolo
 * @since 01/10/2024, 17:53:17
 *
 */
public static void Executar() throws Exception {
  new Callable<Var>() {

   private Var dataIncio = Var.VAR_NULL;
   private Var dataFim = Var.VAR_NULL;
   private Var dataInicioNova = Var.VAR_NULL;
   private Var dataFimNova = Var.VAR_NULL;

   public Var call() throws Exception {
    dataIncio =
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("Reserva.active.dataInicio"));
    dataFim =
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("Reserva.active.dataFim"));
    dataInicioNova =
    cronapi.dateTime.Operations.newDate(
    cronapi.dateTime.Operations.getYear(dataIncio),
    cronapi.dateTime.Operations.getMonth(dataIncio),
    cronapi.dateTime.Operations.getDay(dataIncio),
    cronapi.dateTime.Operations.getHour(dataIncio),
    cronapi.dateTime.Operations.getMinute(dataIncio),
    Var.VAR_NULL);
    dataFimNova =
    cronapi.dateTime.Operations.newDate(
    cronapi.dateTime.Operations.getYear(dataFim),
    cronapi.dateTime.Operations.getMonth(dataFim),
    cronapi.dateTime.Operations.getDay(dataFim),
    cronapi.dateTime.Operations.getHour(dataFim),
    cronapi.dateTime.Operations.getMinute(dataFim),
    Var.VAR_NULL);
    if (
    Var.valueOf(dataFimNova.compareTo(dataInicioNova) <= 0).getObjectAsBoolean()) {
        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("error"),
        Var.valueOf("O horário selecionado é igual ou inferior a data de inicio. Escolha um novo horário."));
    } else if (
    Var.valueOf(
    cronapi.database.Operations.query(Var.valueOf("app"),Var.valueOf("SELECT CASE\n         WHEN COUNT(*) > 0 THEN 1\n         ELSE 0\n       END AS existe_reserva\nFROM RESERVA\nWHERE FK_UNIDADE = :unidade\n  AND FK_SALA = :sala\n  AND (\n    (:datainicio BETWEEN DATAINICIO AND DATAFIM\n     OR :datafim BETWEEN DATAINICIO AND DATAFIM\n     OR DATAINICIO BETWEEN :datainicio AND :datafim\n     OR DATAFIM BETWEEN :datainicio AND :datafim)\n  );"),Var.valueOf("unidade",
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("Reserva.active.unidade"))),Var.valueOf("sala",
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("Reserva.active.sala"))),Var.valueOf("datainicio",
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("Reserva.active.dataInicio"))),Var.valueOf("datafim",
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("Reserva.active.dataFim")))).compareTo(
    Var.valueOf(0)) > 0).getObjectAsBoolean()) {
        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("error"),
        Var.valueOf("O horário selecionado é igual ou inferior a data de inicio. Escolha um novo horário."));
    }
   return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @author Breno Albergaria Argolo
 * @since 01/10/2024, 17:53:17
 *
 */
public static void disponibilidadeSala() throws Exception {
  new Callable<Var>() {

   public Var call() throws Exception {
    if (
    Var.valueOf(
    cronapi.database.Operations.executeNativeQuery(Var.valueOf("app.entity.Reserva"),Var.valueOf("SELECT CASE\n     WHEN COUNT(*) > 0 THEN 1\n     ELSE 0\n   END AS existe_reserva\nFROM RESERVA\nWHERE FK_UNIDADE = :unidade\n  AND FK_SALA = :sala\n  AND (\n    (:datainicio BETWEEN DATAINICIO AND DATAFIM\n     OR :datafim BETWEEN DATAINICIO AND DATAFIM\n     OR DATAINICIO BETWEEN :datainicio AND :datafim\n     OR DATAFIM BETWEEN :datainicio AND :datafim)\n  );"),Var.valueOf("unidade",
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("Reserva.active.unidade"))),Var.valueOf("sala",
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("Reserva.active.sala"))),Var.valueOf("datainicio",
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("Reserva.active.dataInicio"))),Var.valueOf("datafim",
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("Reserva.active.dataFim")))).equals(
    Var.valueOf(1))).getObjectAsBoolean()) {
        cronapi.util.Operations.throwException(
        Var.valueOf("Já existe uma reserva para este horário!"));
    }
   return Var.VAR_NULL;
   }
 }.call();
}

}

