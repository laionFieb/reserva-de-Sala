package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class AnexarArquivo {

public static final int TIMEOUT = 300;

/**
 *
 * @param x<reservaDataDiaTodo>
 *
 * @author Breno Albergaria Argolo
 * @since 11/10/2024, 08:49:59
 *
 */
public static void anexarArquivo(@ParamMetaData(description = "x", id = "bfb8f751") Var x) throws Exception {
  new Callable<Var>() {

   private Var definirArquivo = Var.VAR_NULL;
   private Var info = Var.VAR_NULL;

   public Var call() throws Exception {
    cronapi.util.Operations.sleep(
    Var.valueOf(5));
    definirArquivo =
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("vars.dynamicfile311"));
    info =
    cronapi.json.Operations.toJson(definirArquivo);
    System.out.println(
    Var.valueOf("MOTIVO").getObjectAsString());
    System.out.println(
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("vars.dynamicfile311")).getObjectAsString());
    System.out.println(
    Var.valueOf("JSON ARQUIVO").getObjectAsString());
    System.out.println(
    cronapi.json.Operations.toJson(definirArquivo).getObjectAsString());
    System.out.println(
    Var.valueOf("LEITURA ARQUIVO").getObjectAsString());
    System.out.println(
    cronapi.io.Operations.fileReadAllToBytes(
    cronapi.io.Operations.fileOpenToRead(
    Var.valueOf(
    cronapi.io.Operations.fileAppReclycleDir().getObjectAsString() +
    cronapi.io.Operations.fileSeparator().getObjectAsString() +
    cronapi.json.Operations.getJsonOrMapField(info,
    Var.valueOf("path")).getObjectAsString()))).getObjectAsString());
    System.out.println(
    Var.valueOf("ID DA RESERVA").getObjectAsString());
    System.out.println(
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("Reserva.active.id")).getObjectAsString());
    System.out.println(
    Var.valueOf("INFO").getObjectAsString());
    System.out.println(info.getObjectAsString());
    cronapi.database.Operations.insert(Var.valueOf("app.entity.Arquivo"),Var.valueOf("arquivo",
    cronapi.io.Operations.fileReadAllToBytes(
    cronapi.io.Operations.fileOpenToRead(
    Var.valueOf(
    cronapi.io.Operations.fileAppReclycleDir().getObjectAsString() +
    cronapi.io.Operations.fileSeparator().getObjectAsString() +
    cronapi.json.Operations.getJsonOrMapField(info,
    Var.valueOf("path")).getObjectAsString())))),Var.valueOf("infoArquivo",info),Var.valueOf("reserva",
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("Reserva.active.id"))));
   return Var.VAR_NULL;
   }
 }.call();
}

}

