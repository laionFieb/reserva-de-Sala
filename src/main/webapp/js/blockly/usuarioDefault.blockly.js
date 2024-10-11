window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.UsuarioDefault = window.blockly.js.blockly.UsuarioDefault || {};

/**
 * @function usuarioDefault
 *
 *
 *
 *
 * @author Breno Albergaria Argolo
 * @since 26/09/2024, 17:08:06
 *
 */
window.blockly.js.blockly.UsuarioDefault.usuarioDefaultArgs = [];
window.blockly.js.blockly.UsuarioDefault.usuarioDefault = async function() {
 var usuarioLogado;
  //
  this.cronapi.screen.changeValueOfField("Reserva.active.promotorEvento", this.cronapi.util.getUserName());
}
