package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity(post = "Public", get = "Public", execute = "Public", delete = "Public", put = "Public")
public class UserControl {

public static final int TIMEOUT = 300;

/**
 *
 * @author Breno Albergaria Argolo
 * @since 09/10/2024, 16:28:14
 *
 */
public static Var obterLoginDoUsuarioLogado() throws Exception {
 return new Callable<Var>() {

   private Var username = Var.VAR_NULL;
   private Var email = Var.VAR_NULL;
   private Var password = Var.VAR_NULL;
   private Var isMobile = Var.VAR_NULL;
   private Var consulta = Var.VAR_NULL;
   private Var usuario = Var.VAR_NULL;

   public Var call() throws Exception {
    return
cronapi.list.Operations.get((
cronapi.database.Operations.query(Var.valueOf("app.entity.User"),Var.valueOf("select \n	u.normalizedUserName \nfrom \n	User u"))), Var.VAR_ZERO);
   }
 }.call();
}

/**
 *
 * Descreva esta função...
 *
 * @param email
 * @param isMobile
 *
 * @author Breno Albergaria Argolo
 * @since 09/10/2024, 16:28:14
 *
 */
public static Var resetPassword(@ParamMetaData(description = "email", id = "53fc1de9") Var email, @ParamMetaData(description = "isMobile", id = "b11110b2") Var isMobile) throws Exception {
 return new Callable<Var>() {

   private Var username = Var.VAR_NULL;
   private Var password = Var.VAR_NULL;

   public Var call() throws Exception {
    return
cronapi.authentication.Operations.defaultResetPassword(email,
Var.valueOf("https://acesso.cronapp.io/img/header.png"),
Var.valueOf("https://acesso.cronapp.io/img/footer.png"), isMobile);
   }
 }.call();
}

/**
 *
 * Descreva esta função...
 *
 * @param username
 * @param email
 * @param password
 *
 * @author Breno Albergaria Argolo
 * @since 09/10/2024, 16:28:14
 *
 */
public static Var signUp(@ParamMetaData(description = "username", id = "b7d52451") Var username, @ParamMetaData(description = "email", id = "36bc1157") Var email, @ParamMetaData(description = "password", id = "097625e0") Var password) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return
cronapi.authentication.Operations.defaultSignUp(
cronapi.map.Operations.createObjectMapWith(Var.valueOf("username",username) , Var.valueOf("name",username) , Var.valueOf("email",email) , Var.valueOf("password",password)));
   }
 }.call();
}

/**
 *
 * @author Breno Albergaria Argolo
 * @since 09/10/2024, 16:28:14
 *
 */
public static Var userLogged() throws Exception {
 return new Callable<Var>() {

   private Var username = Var.VAR_NULL;
   private Var email = Var.VAR_NULL;
   private Var password = Var.VAR_NULL;
   private Var isMobile = Var.VAR_NULL;
   private Var consulta = Var.VAR_NULL;
   private Var usuario = Var.VAR_NULL;

   public Var call() throws Exception {
    return
cronapi.list.Operations.getFirst((
cronapi.database.Operations.query(Var.valueOf("app.entity.User"),Var.valueOf("select \n	u.id \nfrom \n	User u  \nwhere \n	u.normalizedUserName = :normalizedUserName"),Var.valueOf("normalizedUserName",
cronapi.text.Operations.normalize(
cronapi.util.Operations.getCurrentUserName())))));
   }
 }.call();
}

/**
 *
 * @author Breno Albergaria Argolo
 * @since 09/10/2024, 16:28:14
 *
 */
public static void usuarioDefault() throws Exception {
  new Callable<Var>() {

   private Var consulta = Var.VAR_NULL;
   private Var usuario = Var.VAR_NULL;

   public Var call() throws Exception {
    consulta =
    cronapi.list.Operations.getFirst((
    cronapi.database.Operations.query(Var.valueOf("app.entity.User"),Var.valueOf("select \n	u.id \nfrom \n	User u  \nwhere \n	u.normalizedUserName = :normalizedUserName"),Var.valueOf("normalizedUserName",
    cronapi.text.Operations.normalize(
    cronapi.util.Operations.getCurrentUserName())))));
    usuario =
    cronapi.util.Operations.getCurrentUserName();
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
    Var.valueOf("Reserva.active.promotorEvento"), usuario);
   return Var.VAR_NULL;
   }
 }.call();
}

}

