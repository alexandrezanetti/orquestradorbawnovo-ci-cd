/*
 * API de Integração com GCC - Conteúdo
 * Provê funcionalidades para criação, recuperação e atualização de conteúdo no repositório GCC
 *
 * OpenAPI spec version: 1.2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package cgcc.integracao.conteudo;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Contempla as informações a serem enviadas na requisição de exclusão de conteúdo, através de seu ID, no repositório GCC
 */
@ApiModel(description = "Contempla as informações a serem enviadas na requisição de exclusão de conteúdo, através de seu ID, no repositório GCC")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-02T20:33:16.213Z")
public class RequestExcluirPorId {
  @SerializedName("centroCusto")
  private String centroCusto = null;

  @SerializedName("canal")
  private String canal = null;

  @SerializedName("usuario")
  private String usuario = null;

  @SerializedName("senha")
  private String senha = null;

  @SerializedName("objectStore")
  private String objectStore = null;

  @SerializedName("id")
  private String id = null;

  public RequestExcluirPorId centroCusto(String centroCusto) {
    this.centroCusto = centroCusto;
    return this;
  }

   /**
   * Centro de custo que esta executando a requisição
   * @return centroCusto
  **/
  @ApiModelProperty(required = true, value = "Centro de custo que esta executando a requisição")
  public String getCentroCusto() {
    return centroCusto;
  }

  public void setCentroCusto(String centroCusto) {
    this.centroCusto = centroCusto;
  }

  public RequestExcluirPorId canal(String canal) {
    this.canal = canal;
    return this;
  }

   /**
   * Canal que está executando a requisição
   * @return canal
  **/
  @ApiModelProperty(required = true, value = "Canal que está executando a requisição")
  public String getCanal() {
    return canal;
  }

  public void setCanal(String canal) {
    this.canal = canal;
  }

  public RequestExcluirPorId usuario(String usuario) {
    this.usuario = usuario;
    return this;
  }

   /**
   * Usuário para autenticação no repositório GCC (o usuário deve estar criptografado no padrão GCC)
   * @return usuario
  **/
  @ApiModelProperty(required = true, value = "Usuário para autenticação no repositório GCC (o usuário deve estar criptografado no padrão GCC)")
  public String getUsuario() {
    return usuario;
  }

  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  public RequestExcluirPorId senha(String senha) {
    this.senha = senha;
    return this;
  }

   /**
   * Senha para autenticação no repositório GCC (a senha deve estar criptografada no padrão GCC)
   * @return senha
  **/
  @ApiModelProperty(required = true, value = "Senha para autenticação no repositório GCC (a senha deve estar criptografada no padrão GCC)")
  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

  public RequestExcluirPorId objectStore(String objectStore) {
    this.objectStore = objectStore;
    return this;
  }

   /**
   * ObjectStore onde será executada a operação no repositório
   * @return objectStore
  **/
  @ApiModelProperty(example = "OS-CAMBIO", required = true, value = "ObjectStore onde será executada a operação no repositório")
  public String getObjectStore() {
    return objectStore;
  }

  public void setObjectStore(String objectStore) {
    this.objectStore = objectStore;
  }

  public RequestExcluirPorId id(String id) {
    this.id = id;
    return this;
  }

   /**
   * ID do conteúdo
   * @return id
  **/
  @ApiModelProperty(example = "{6032036D-0000-C13A-9A1C-4651367FC6E7}", required = true, value = "ID do conteúdo")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestExcluirPorId requestExcluirPorId = (RequestExcluirPorId) o;
    return Objects.equals(this.centroCusto, requestExcluirPorId.centroCusto) &&
        Objects.equals(this.canal, requestExcluirPorId.canal) &&
        Objects.equals(this.usuario, requestExcluirPorId.usuario) &&
        Objects.equals(this.senha, requestExcluirPorId.senha) &&
        Objects.equals(this.objectStore, requestExcluirPorId.objectStore) &&
        Objects.equals(this.id, requestExcluirPorId.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(centroCusto, canal, usuario, senha, objectStore, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestExcluirPorId {\n");
    
    sb.append("    centroCusto: ").append(toIndentedString(centroCusto)).append("\n");
    sb.append("    canal: ").append(toIndentedString(canal)).append("\n");
    sb.append("    usuario: ").append(toIndentedString(usuario)).append("\n");
    sb.append("    senha: ").append(toIndentedString(senha)).append("\n");
    sb.append("    objectStore: ").append(toIndentedString(objectStore)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

