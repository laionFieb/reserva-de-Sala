package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class UploadArquivo {

public static final int TIMEOUT = 300;

/**
 *
 * @author Breno Albergaria Argolo
 * @since 09/10/2024, 10:47:13
 *
 */
public static Var uploadArquivos() throws Exception {
 return new Callable<Var>() {

   private Var arquivo = Var.VAR_NULL;
   private Var info = Var.VAR_NULL;
   private Var transfere = Var.VAR_NULL;
   private Var renomear = Var.VAR_NULL;
   private Var caminhoArquivo = Var.VAR_NULL;
   private Var leituraArquivo = Var.VAR_NULL;
   private Var leituraTesteArquivo = Var.VAR_NULL;
   private Var textoparaBase64 = Var.VAR_NULL;
   private Var base64paraTexto = Var.VAR_NULL;

   public Var call() throws Exception {
    arquivo =
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("vars.dynamicfile311"));
    info =
    cronapi.json.Operations.toJson(arquivo);
    transfere =
    cronapi.io.Operations.fileMove(
    Var.valueOf(
    cronapi.io.Operations.fileAppReclycleDir().getObjectAsString() +
    cronapi.io.Operations.fileSeparator().getObjectAsString() +
    cronapi.json.Operations.getJsonOrMapField(info,
    Var.valueOf("path")).getObjectAsString()),
    cronapi.io.Operations.fileAppDir());
    if (transfere.getObjectAsBoolean()) {
        renomear =
        cronapi.io.Operations.fileRename(
        Var.valueOf(
        cronapi.io.Operations.fileAppDir().getObjectAsString() +
        cronapi.io.Operations.fileSeparator().getObjectAsString() +
        cronapi.json.Operations.getJsonOrMapField(info,
        Var.valueOf("path")).getObjectAsString()),
        Var.valueOf(
        cronapi.json.Operations.getJsonOrMapField(info,
        Var.valueOf("name")).getObjectAsString() +
        cronapi.json.Operations.getJsonOrMapField(info,
        Var.valueOf("fileExtension")).getObjectAsString()));
    }
    caminhoArquivo =
    Var.valueOf(
    cronapi.io.Operations.fileAppDir().getObjectAsString() +
    cronapi.io.Operations.fileSeparator().getObjectAsString() +
    cronapi.json.Operations.getJsonOrMapField(info,
    Var.valueOf("name")).getObjectAsString() +
    cronapi.json.Operations.getJsonOrMapField(info,
    Var.valueOf("fileExtension")).getObjectAsString());
    System.out.println(
    Var.valueOf(
    cronapi.io.Operations.fileAppDir().getObjectAsString() +
    cronapi.io.Operations.fileSeparator().getObjectAsString() +
    cronapi.json.Operations.getJsonOrMapField(info,
    Var.valueOf("name")).getObjectAsString() +
    cronapi.json.Operations.getJsonOrMapField(info,
    Var.valueOf("fileExtension")).getObjectAsString()).getObjectAsString());
    leituraArquivo =
    cronapi.io.Operations.fileOpenToRead(caminhoArquivo);
    leituraTesteArquivo =
    cronapi.io.Operations.fileReadAll(leituraArquivo);
    textoparaBase64 =
    cronapi.conversion.Operations.StringToBase64(leituraTesteArquivo);
    base64paraTexto =
    cronapi.conversion.Operations.base64ToString(textoparaBase64);
    cronapi.io.Operations.fileOpenToWrite(
    Var.valueOf(
    cronapi.io.Operations.fileAppDir().getObjectAsString() +
    cronapi.io.Operations.fileSeparator().getObjectAsString() +
    Var.valueOf("decode.txt").getObjectAsString()),
    cronapi.conversion.Operations.base64ToString(textoparaBase64));
    return textoparaBase64;
   }
 }.call();
}

/**
 *
 * @author Breno Albergaria Argolo
 * @since 09/10/2024, 10:47:13
 *
 */
public static void uploadModal() throws Exception {
  new Callable<Var>() {

   private Var path = Var.VAR_NULL;

   public Var call() throws Exception {
    path = Var.VAR_NULL;
    uploadArquivos();
    cronapi.database.Operations.insert(Var.valueOf("app.entity.Arquivo"),Var.valueOf("arquivo",Var.VAR_NULL),Var.valueOf("infoArquivo",path));
   return Var.VAR_NULL;
   }
 }.call();
}

}

