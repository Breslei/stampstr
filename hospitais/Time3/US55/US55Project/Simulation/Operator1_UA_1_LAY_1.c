/*********************************************************
 **
 ** File  Operator1_UA_1_LAY_1.c
 **
 ** Automatically generated by SCADE Suite UA Adaptor
 ** Version 18.0 (build i12)
 ** 
 ** Date of generation: 2017-09-17T23:21:58
 ** Command line: C:/Program Files/ANSYS Inc/v180/SCADE/SCADE/bin/uaadaptor.exe -sdy C:\Users\Julhio\Documents\ITA\CE-237\stampstr\hospitais\Time3\US55\US55Project\US55Project.sdy -n C:\Program Files\ANSYS Inc\v180\SCADE\SCADE Display\config\a661_description\a661.xml -outdir C:/Users/Julhio/Documents/ITA/CE-237/stampstr/hospitais/Time3/US55/US55Project/Simulation -k C:/Users/Julhio/Documents/ITA/CE-237/stampstr/hospitais/Time3/US55/US55Project/Simulation/kcg_trace.xml -o Operator1_UA_1 -i US55Project_interface.h -encoding ASCII C:\Users\Julhio\Documents\ITA\CE-237\stampstr\hospitais\Time3\US55\T01\Batimento.sgfx
 *********************************************************/
#include "kcg_sensors.h"
#include "Operator1_UA_1.h"
#include "Operator1_UA_1_constants.h"
#include "Operator1_UA_1_private.h"

/* Perform UA Request for layer 1 */
A661_INTERNAL uaa_size a661_com_A661_CMD_UA_REQUEST_layer_1(buffer_el msg[], 
  outC_Operator1* scade_ctx,  extern_out_ctx_t * extern_ctx){
  uaa_size offset = 0;
  if (scade_ctx->EmitToCDS){
    
    if (scade_ctx->EmitToCDS){
      offset = offset + a661_com_A661_CMD_UA_REQUEST_8(msg + offset,
        A661_REQ_LAYER_VISIBLE, 0);
    }
    if (scade_ctx->EmitToCDS){
      offset = offset + a661_com_A661_CMD_UA_REQUEST_8(msg + offset,
        A661_REQ_LAYER_ACTIVE, 0);
    }
  }
  return offset ;
}

/* Pack messages for layer 1 */
 uaa_size a661_com_layer_1(buffer_el msg[], 
  outC_Operator1* scade_ctx,  extern_out_ctx_t* extern_ctx){
  uaa_size offset = 0;
  if (scade_ctx->EmitToCDS){
    LAYER("a661_layer#1");
    offset = 8;
    a661_msg_cmd_header(msg, 1, Operator1_UA_1_DEFAULT_CONTEXT_NUMBER);
    if (scade_ctx->EmitToCDS){
      WIDGET("GpArcCircle#3");
      offset = offset + a661_com_csp_widget_GpArcCircle(msg + offset, 3,
        scade_ctx->EmitToCDS, scade_ctx->SignalToLed, scade_ctx->EmitToCDS,
        scade_ctx->SignalToLed);
    }
    if (scade_ctx->EmitToCDS){
      offset = offset + a661_com_A661_CMD_UA_REQUEST_layer_1(msg + offset,
        scade_ctx, extern_ctx);
    }
    WRITE_ULONG(msg + offset, A661_END_BLOCK);
    offset = offset + 4;
    WRITE_ULONG(msg + 4, offset);
  }
  return offset ;
}

/*********************************************************
 ** End of file
 ** End of generation: 2017-09-17T23:21:58
 *********************************************************/

