package io.openliberty.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import cgcc.integracao.conteudo.ResponseObter;

@Path("/cgcc_integracao_conteudo/rest")
public class OrquestradorBawNovoEndpoint{
    private static final String template = "Hello, ZZZZZZZZZZZZZZZZZZZZZ %s!";

//    @GET
//    @Path("/v1/Sample")
//    @Produces("application/json")
//    public Object sample(@QueryParam("centroCusto") @DefaultValue("centroCusto") String centroCusto) {
//        return new Greeting(String.format(template, centroCusto));
//    }
    
    
    @GET
    @Path("/v1/conteudo/obterPorId")
    @Produces("application/json")
	public Object getAttr(  @DefaultValue("") @QueryParam("centroCusto") String centroCusto,	
							@DefaultValue("") @QueryParam("canal") String canal,
							@DefaultValue("") @QueryParam("usuario") String usuario,
							@DefaultValue("") @QueryParam("senha") String senha,
							@DefaultValue("") @QueryParam("objectStore") String objectStore,
							@DefaultValue("") @QueryParam("id") String id) {

		Object msgRequest = new Object();
		if ("".equals(centroCusto) ) {
			return MsgResponse400(msgRequest, "Centro de Custo obrigatório(a)");
		}
		else if ("".equals(canal) ) {
			return MsgResponse400(msgRequest, "Canal obrigatório(a)");
		}
		else if ("".equals(usuario) ) { 
			return MsgResponse400(msgRequest, "Usuário obrigatório(a)");
		}
		else if ("".equals(senha) ) { 
			return MsgResponse400(msgRequest, "Senha obrigatório(a)");
		}
		else  if ("".equals(objectStore) ) {
			return MsgResponse400(msgRequest, "Object Store obrigatório(a)");
		}
		else if ("".equals(id) ) {
			return MsgResponse400(msgRequest, "Id obrigatório(a)");
		}
		else
		{
			return MsgResponseBase200Arq(msgRequest);
//			return msgRequest;
		}
    }
    

//###########################################################################
// RESPOSTAS POSSÍVEIS	
//###########################################################################
 	private Object MsgResponseBase200(Object MsgRequest) {
 		Map<String, Object> msgResponse = new HashMap<>();
         msgResponse.put("status", Response.Status.OK.getStatusCode());
         msgResponse.put("mensagem", "OK");
 		return Response.status(Response.Status.OK).entity(msgResponse).build();
 	}

 	private Object MsgResponseBase200Arq(Object MsgRequest) {
		ResponseObter responseObter = new ResponseObter();
 		responseObter.setStatus(200);
 		responseObter.setMensagem("OK");
 		ArrayList<String> msgArrayList = new ArrayList<String>();
 		msgArrayList.add("arquivo1");
 		msgArrayList.add("arquivo2");
 		responseObter.setArquivos(msgArrayList);
 		Map<String, Object> msgResponse = new HashMap<>();
 		msgResponse.put("status", Response.Status.OK.getStatusCode());
        msgResponse.put("mensagem", "OK");
        msgResponse.put("arquivo", msgArrayList);
		return Response.status(Response.Status.OK).entity(msgResponse).build();

 	}

    private Object MsgResponseCriar201(Object MsgRequest) {
        Map<String, Object> msgResponse = new HashMap<>();
        msgResponse.put("status", Response.Status.CREATED.getStatusCode());
        msgResponse.put("mensagem", "OK");
        msgResponse.put("id", "ID");
		return Response.status(Response.Status.CREATED).entity(msgResponse).build();
 	}
 	
 	private Object MsgResponse400(Object MsgRequest, String Msg) {
 		Map<String, Object> msgResponse = new HashMap<>();
         msgResponse.put("status", Response.Status.BAD_REQUEST.getStatusCode());
         msgResponse.put("mensagem", Msg);
 		return Response.status(Response.Status.BAD_REQUEST).entity(msgResponse).build();
    }
 }

