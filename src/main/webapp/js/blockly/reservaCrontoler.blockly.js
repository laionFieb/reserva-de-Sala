window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.ReservaCrontoler = window.blockly.js.blockly.ReservaCrontoler || {};

/**
 * @function cadastrar
 *
 *
 *
 *
 * @author Breno Albergaria Argolo
 * @since 10/10/2024, 17:42:32
 *
 */
window.blockly.js.blockly.ReservaCrontoler.cadastrarArgs = [];
window.blockly.js.blockly.ReservaCrontoler.cadastrar = async function() {

  //
  (await this.cronapi.server('blockly.VerificarDataInicio.verificarDataInicio').toPromise().run());
  //
  (await this.cronapi.server('blockly.VerificarDataFim.Executar').toPromise().run());
  //
  (await this.cronapi.server('blockly.ReservaControler.verificarDisnponibilidade').toPromise().run());
  //
  (await this.cronapi.client('cronapi.screen.post').run("ReservaTipo_Agenda"));
  //
  (await this.cronapi.client('cronapi.screen.post').run("Reserva"));
  //
  (await this.cronapi.client('cronapi.screen.post').run("SalaTpoAgendaPersonalizado"));
  //
  (await this.cronapi.server('blockly.AnexarArquivo.anexarArquivo').names('bfb8f751').toPromise().run("Reserva"));
}
