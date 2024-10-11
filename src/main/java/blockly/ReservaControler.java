package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class ReservaControler {

public static final int TIMEOUT = 300;

/**
 *
 * @param dadoReserva<app.entity.ReservaTipo_Agenda>
 *
 * @author Breno Albergaria Argolo
 * @since 09/10/2024, 14:24:02
 *
 */
public static void criarAprovacao(@ParamMetaData(description = "dadoReserva", id = "04597959") Var dadoReserva) throws Exception {
  new Callable<Var>() {

   private Var tipoAgenda = Var.VAR_NULL;
   private Var status = Var.VAR_NULL;
   private Var dataAprovacao = Var.VAR_NULL;

   public Var call() throws Exception {
    tipoAgenda =
    cronapi.list.Operations.getFirst((
    cronapi.database.Operations.query(Var.valueOf("app.entity.ReservaTipo_Agenda"),Var.valueOf("select \n	r.tipo_Agenda.nome \nfrom \n	ReservaTipo_Agenda r  \nwhere \n	r.reserva = :reserva"),Var.valueOf("reserva",
    cronapi.object.Operations.getObjectField(dadoReserva,
    Var.valueOf("reserva"))))));
    status =
    Var.valueOf(1);
    dataAprovacao =
    Var.VAR_NULL;
    // Bloco de verificação se é do tipo reunião e não rpecisa de autorização
    if (
    Var.valueOf(
    Var.valueOf(tipoAgenda.equals(
    Var.valueOf("Reunião"))).getObjectAsBoolean() &&
    Var.valueOf(
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("Sala.active.autorizacao")).equals(
    Var.VAR_FALSE)).getObjectAsBoolean()).getObjectAsBoolean()) {
        dataAprovacao =
        cronapi.dateTime.Operations.getNow();
        status =
        Var.valueOf(2);
        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"),
        Var.valueOf("A reserva foi realizada com sucesso!"));
        // Bloco de verificação se é do tipo reunião e  precisa de autorização
    } else if (
    Var.valueOf(
    Var.valueOf(tipoAgenda.equals(
    Var.valueOf("Reunião"))).getObjectAsBoolean() &&
    Var.valueOf(
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("Sala.active.autorizacao")).equals(
    Var.VAR_TRUE)).getObjectAsBoolean()).getObjectAsBoolean()) {
        status =
        Var.valueOf(1);
        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("info"),
        Var.valueOf("A reserva foi encaminhada pora aprovação!"));
    }
    cronapi.database.Operations.insert(Var.valueOf("app.entity.Aprovacao"),Var.valueOf("id",
    cronapi.util.Operations.generateUUID()),Var.valueOf("data_Aprovacao",dataAprovacao),Var.valueOf("motivo_reprovacao",
    Var.VAR_NULL),Var.valueOf("reserva",
    cronapi.object.Operations.getObjectField(dadoReserva,
    Var.valueOf("reserva"))),Var.valueOf("status",status));
   return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @param enviarEmail<app.entity.Reserva>
 *
 * @author Breno Albergaria Argolo
 * @since 09/10/2024, 14:24:02
 *
 */
public static void enviarEmail(@ParamMetaData(description = "enviarEmail", id = "b2096e25") Var enviarEmail) throws Exception {
  new Callable<Var>() {

   private Var userLogged = Var.VAR_NULL;
   private Var horarioFim = Var.VAR_NULL;

   public Var call() throws Exception {
    userLogged =
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("Reserva.active.user_name"));
    horarioFim =
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("Reserva.active.dataFim"));
   return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @param diaTodo<app.entity.Reserva>
 *
 * @author Breno Albergaria Argolo
 * @since 09/10/2024, 14:24:02
 *
 */
public static void horaDiaTodo(@ParamMetaData(description = "diaTodo", id = "3e4295e7") Var diaTodo) throws Exception {
  new Callable<Var>() {

   private Var diaTodoAjuste = Var.VAR_NULL;

   public Var call() throws Exception {
    diaTodoAjuste =
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("Reserva.active.dataInicio"));
    if (
    Var.valueOf(
    cronapi.dateTime.Operations.getNowNoHour().compareTo(diaTodoAjuste) > 0).getObjectAsBoolean()) {
        cronapi.util.Operations.throwException(
        Var.valueOf("A data selecionada é inferior a data atual!"));
    }
   return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @param dadoReserva<app.entity.Reserva>
 *
 * @author Breno Albergaria Argolo
 * @since 09/10/2024, 14:24:02
 *
 */
public static void validar(@ParamMetaData(description = "dadoReserva", id = "04597959") Var dadoReserva) throws Exception {
  new Callable<Var>() {

   public Var call() throws Exception {
    verificarData(dadoReserva);
    verificarDiaTodo(dadoReserva);
   return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @param reserva<app.entity.Reserva>
 *
 * @author Breno Albergaria Argolo
 * @since 09/10/2024, 14:24:02
 *
 */
public static void verificarData(@ParamMetaData(description = "reserva", id = "9493ea39") Var reserva) throws Exception {
  new Callable<Var>() {

   private Var dataInicio = Var.VAR_NULL;

   public Var call() throws Exception {
    dataInicio =
    cronapi.object.Operations.getObjectField(reserva,
    Var.valueOf("dataInicio"));
    if (
    Var.valueOf(
    cronapi.dateTime.Operations.getNow().compareTo(dataInicio) > 0).getObjectAsBoolean()) {
        cronapi.util.Operations.throwException(
        Var.valueOf("A data inicial não pode ser inferior a data atual."));
    }
   return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @param dadosReserva<app.entity.Reserva>
 *
 * @author Breno Albergaria Argolo
 * @since 09/10/2024, 14:24:02
 *
 */
public static void verificarDiaTodo(@ParamMetaData(description = "dadosReserva", id = "cae4e1e9") Var dadosReserva) throws Exception {
  new Callable<Var>() {

   private Var dataDiaTodo = Var.VAR_NULL;
   private Var novaDataInicial = Var.VAR_NULL;
   private Var novaDataFinal = Var.VAR_NULL;

   public Var call() throws Exception {
    if (
    cronapi.object.Operations.getObjectField(dadosReserva,
    Var.valueOf("dia_todo")).getObjectAsBoolean()) {
        dataDiaTodo =
        cronapi.object.Operations.getObjectField(dadosReserva,
        Var.valueOf("dataInicio"));
        novaDataInicial =
        cronapi.dateTime.Operations.newDate(
        cronapi.dateTime.Operations.getYear(dataDiaTodo),
        cronapi.dateTime.Operations.getMonth(dataDiaTodo),
        cronapi.dateTime.Operations.getDay(dataDiaTodo),
        Var.valueOf(8),
        Var.VAR_NULL,
        Var.VAR_NULL);
        novaDataFinal =
        cronapi.dateTime.Operations.newDate(
        cronapi.dateTime.Operations.getYear(dataDiaTodo),
        cronapi.dateTime.Operations.getMonth(dataDiaTodo),
        cronapi.dateTime.Operations.getDay(dataDiaTodo),
        Var.valueOf(18),
        Var.VAR_NULL,
        Var.VAR_NULL);
        cronapi.database.Operations.updateField(dadosReserva,
        Var.valueOf("dataInicio"), novaDataInicial);
        cronapi.database.Operations.updateField(dadosReserva,
        Var.valueOf("dataFim"), novaDataFinal);
    }
   return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @author Breno Albergaria Argolo
 * @since 09/10/2024, 14:24:02
 *
 */
public static void verificarDisnponibilidade() throws Exception {
  new Callable<Var>() {

   private Var reserva = Var.VAR_NULL;

   public Var call() throws Exception {
    if (
    Var.valueOf(
    cronapi.json.Operations.getJsonOrMapField(
    cronapi.list.Operations.getFirst((
    cronapi.database.Operations.query(Var.valueOf("app"),Var.valueOf("SELECT CASE\n         WHEN COUNT(*) > 0 THEN 1\n         ELSE 0\n       END\nFROM RESERVA\nWHERE FK_UNIDADE = :unidade\n  AND FK_SALA = :sala\n  AND (\n    (:datainicio BETWEEN DATAINICIO AND DATAFIM\n     OR :datafim BETWEEN DATAINICIO AND DATAFIM\n     OR DATAINICIO BETWEEN :datainicio AND :datafim\n     OR DATAFIM BETWEEN :datainicio AND :datafim)\n  );"),Var.valueOf("unidade",
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("Reserva.active.unidade"))),Var.valueOf("sala",
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("Reserva.active.sala"))),Var.valueOf("datainicio",
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("Reserva.active.dataInicio"))),Var.valueOf("datafim",
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("Reserva.active.dataFim")))))),
    Var.valueOf("expression")).compareTo(
    Var.valueOf(0)) > 0).getObjectAsBoolean()) {
        cronapi.util.Operations.throwException(
        Var.valueOf("Já existe uma reserva neste horário!"));
        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.hideComponent"),
        Var.valueOf("btn_crud_post_92240"));
    } else {
        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"),
        Var.valueOf("Horário disponível!"));
    }
   return Var.VAR_NULL;
   }
 }.call();
}

}

