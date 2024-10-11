package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class RetornarTipoAgendaUnidade {

public static final int TIMEOUT = 300;

/**
 *
 * @author Breno Albergaria Argolo
 * @since 26/09/2024, 08:24:18
 *
 */
public static Var retornarTipoAgendaUnidade() throws Exception {
 return new Callable<Var>() {

   private Var unidade = Var.VAR_NULL;

   public Var call() throws Exception {
    unidade =
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("Reserva.active.unidade"));
    cronapi.database.Operations.query(Var.valueOf("app.entity.UnidadeTipo_Agenda"),Var.valueOf("select \n	u.unidade.id, \n	u.tipo_Agenda.id \nfrom \n	UnidadeTipo_Agenda u  \nwhere \n	u.unidade.id = :unidadeId"),Var.valueOf("unidadeId",unidade));
    return Var.VAR_NULL;
   }
 }.call();
}

}

