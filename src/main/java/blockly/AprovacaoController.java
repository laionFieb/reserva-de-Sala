package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class AprovacaoController {

public static final int TIMEOUT = 300;

/**
 *
 * @author Ebert Castro
 * @since 15/10/2024, 11:27:39
 *
 */
public static void FecharModal() throws Exception {
  new Callable<Var>() {

   public Var call() throws Exception {
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.hideModal"),
    Var.valueOf("modal61550"));
   return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @param idAprovacao
 *
 * @author Ebert Castro
 * @since 15/10/2024, 11:27:39
 *
 */
public static void aprovarReserva(@ParamMetaData(description = "idAprovacao", id = "a33419b6") Var idAprovacao) throws Exception {
  new Callable<Var>() {

   public Var call() throws Exception {
    cronapi.database.Operations.execute(Var.valueOf("app.entity.Aprovacao"), Var.valueOf("update \n	Aprovacao  \nset \n	status = :status, \n	data_Aprovacao = :data_Aprovacao \nwhere \n	id = :id"),Var.valueOf("status",
    Var.valueOf(2)),Var.valueOf("data_Aprovacao",
    cronapi.dateTime.Operations.getNow()),Var.valueOf("id",
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("Aprovacao.active.AprovacaoID"))));
    atualizarFonte();
   return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @author Ebert Castro
 * @since 15/10/2024, 11:27:39
 *
 */
public static void atualizarFonte() throws Exception {
  new Callable<Var>() {

   public Var call() throws Exception {
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.refreshDatasource"),
    Var.valueOf("Aprovacao"),
    Var.valueOf("true"));
   return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @author Ebert Castro
 * @since 15/10/2024, 11:27:39
 *
 */
public static void exibirModalNegar() throws Exception {
  new Callable<Var>() {

   public Var call() throws Exception {
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.showModal"),
    Var.valueOf("modal61550"));
   return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @param status
 *
 * @author Ebert Castro
 * @since 15/10/2024, 11:27:39
 *
 */
public static Var getStatus(@ParamMetaData(description = "status", id = "92a895ed") Var status) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    if (
    Var.valueOf(status.equals(
    Var.valueOf(1))).getObjectAsBoolean()){
      return
    Var.valueOf("Em aprovação");
    }
    if (
    Var.valueOf(status.equals(
    Var.valueOf(2))).getObjectAsBoolean()){
      return
    Var.valueOf("Aprovado");
    }
    if (
    Var.valueOf(status.equals(
    Var.valueOf(3))).getObjectAsBoolean()){
      return
    Var.valueOf("Negado");
    }
    if (
    Var.valueOf(status.equals(
    Var.valueOf(4))).getObjectAsBoolean()){
      return
    Var.valueOf("Cancelado");
    }
    return
Var.valueOf("Inválido");
   }
 }.call();
}

/**
 *
 * @param aprovacaoDado<app.entity.Aprovacao>
 *
 * @author Ebert Castro
 * @since 15/10/2024, 11:27:39
 *
 */
public static Var getStatusFonte(@ParamMetaData(description = "aprovacaoDado", id = "bd910511") Var aprovacaoDado) throws Exception {
 return new Callable<Var>() {

   private Var status = Var.VAR_NULL;
   private Var idAprovacao = Var.VAR_NULL;

   public Var call() throws Exception {
    return
Var.valueOf(getStatus(
cronapi.object.Operations.getObjectField(aprovacaoDado,
Var.valueOf("status"))));
   }
 }.call();
}

/**
 *
 * @param idAprovacao
 *
 * @author Ebert Castro
 * @since 15/10/2024, 11:27:39
 *
 */
public static void motivoReprov(@ParamMetaData(description = "idAprovacao", id = "de1f0386") Var idAprovacao) throws Exception {
  new Callable<Var>() {

   public Var call() throws Exception {
    cronapi.database.Operations.execute(Var.valueOf("app.entity.Aprovacao"), Var.valueOf("update \n	Aprovacao  \nset \n	motivo_reprovacao = :motivo_reprovacao, \n	data_Aprovacao = :data_Aprovacao, \n	status = :status \nwhere \n	id = :id"),Var.valueOf("motivo_reprovacao",
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("vars.input6701"))),Var.valueOf("data_Aprovacao",
    cronapi.dateTime.Operations.getNow()),Var.valueOf("status",
    Var.valueOf(3)),Var.valueOf("id",
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("Aprovacao.active.AprovacaoID"))));
    atualizarFonte();
    System.out.println(
    Var.valueOf("FIM").getObjectAsString());
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.hideModal"),
    Var.valueOf("modal61550"));
   return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @param idAprovacao
 *
 * @author Ebert Castro
 * @since 15/10/2024, 11:27:39
 *
 */
public static Var negarReserva(@ParamMetaData(description = "idAprovacao", id = "a33419b6") Var idAprovacao) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.showModal"),
    Var.valueOf("modal61550"));
    cronapi.database.Operations.execute(Var.valueOf("app.entity.Aprovacao"), Var.valueOf("update \n	Aprovacao  \nset \n	status = :status, \n	data_Aprovacao = :data_Aprovacao, \n	motivo_reprovacao = :motivo_reprovacao \nwhere \n	id = :id"),Var.valueOf("status",
    Var.valueOf(3)),Var.valueOf("data_Aprovacao",
    cronapi.dateTime.Operations.getNow()),Var.valueOf("motivo_reprovacao",
    Var.valueOf("")),Var.valueOf("id",idAprovacao));
    atualizarFonte();
    return Var.VAR_NULL;
   }
 }.call();
}

}

