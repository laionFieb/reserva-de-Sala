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
 * @author BRENO ALBERGARIA ARGOLO
 * @since 16/10/2024, 10:01:29
 *
 */
public static void enviarEmail() throws Exception {
  new Callable<Var>() {

   private Var emailSolicitante = Var.VAR_NULL;

   public Var call() throws Exception {
    emailSolicitante =
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("Reserva.active.emailResponsavelEvento"));
    cronapi.email.Operations.sendEmail(
    Var.valueOf("reservadesalas@fieb.org.br"), emailSolicitante,
    Var.valueOf("breno.albergaria@fieb.org.br"),
    Var.valueOf(""),
    Var.valueOf("Confirmação de Reserva"),
    Var.valueOf("Prezado(a), \nA sua reserva foi concluida com sucesso!\n\nAtenciosamente,"),
    Var.valueOf("Prezado(a), \nA sua reserva foi concluida com sucesso!\n\nAtenciosamente,"),
    Var.valueOf(""),
    Var.valueOf("mailing.fieb.org.br"),
    Var.valueOf("25"),
    Var.valueOf("reservadesalas@fieb.org.br"),
    Var.valueOf(""),
    Var.valueOf("PLAIN"));
   return Var.VAR_NULL;
   }
 }.call();
}

}

