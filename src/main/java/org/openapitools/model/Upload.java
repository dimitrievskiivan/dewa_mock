package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Attributes;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Upload
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-26T18:06:25.282Z[Etc/UTC]")
public class Upload   {
  @JsonProperty("token")
  private String token;

  @JsonProperty("utenteFw")
  private String utenteFw;

  @JsonProperty("codiceFonte")
  private String codiceFonte;

  @JsonProperty("codiceCliente")
  private String codiceCliente;

  @JsonProperty("sistema")
  private String sistema;

  @JsonProperty("title")
  private String title;

  @JsonProperty("idFw")
  private String idFw;

  @JsonProperty("estensioneFile")
  private String estensioneFile;

  @JsonProperty("contenuto")
  private String contenuto;

  @JsonProperty("impronta")
  private String impronta;

  @JsonProperty("attributi")
  @Valid
  private List<Attributes> attributi = new ArrayList<>();

  public Upload token(String token) {
    this.token = token;
    return this;
  }

  /**
   * Get token
   * @return token
  */
  @ApiModelProperty(example = "THE_PROPER_TOKEN", required = true, value = "")
  @NotNull

@Size(max=100) 
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public Upload utenteFw(String utenteFw) {
    this.utenteFw = utenteFw;
    return this;
  }

  /**
   * Get utenteFw
   * @return utenteFw
  */
  @ApiModelProperty(example = "current_user?", value = "")

@Size(max=50) 
  public String getUtenteFw() {
    return utenteFw;
  }

  public void setUtenteFw(String utenteFw) {
    this.utenteFw = utenteFw;
  }

  public Upload codiceFonte(String codiceFonte) {
    this.codiceFonte = codiceFonte;
    return this;
  }

  /**
   * Get codiceFonte
   * @return codiceFonte
  */
  @ApiModelProperty(example = "050", required = true, value = "")
  @NotNull

@Size(max=3) 
  public String getCodiceFonte() {
    return codiceFonte;
  }

  public void setCodiceFonte(String codiceFonte) {
    this.codiceFonte = codiceFonte;
  }

  public Upload codiceCliente(String codiceCliente) {
    this.codiceCliente = codiceCliente;
    return this;
  }

  /**
   * Get codiceCliente
   * @return codiceCliente
  */
  @ApiModelProperty(example = "OMLA_CODE", required = true, value = "")
  @NotNull

@Size(max=30) 
  public String getCodiceCliente() {
    return codiceCliente;
  }

  public void setCodiceCliente(String codiceCliente) {
    this.codiceCliente = codiceCliente;
  }

  public Upload sistema(String sistema) {
    this.sistema = sistema;
    return this;
  }

  /**
   * Get sistema
   * @return sistema
  */
  @ApiModelProperty(example = "NSO", required = true, value = "")
  @NotNull

@Size(max=10) 
  public String getSistema() {
    return sistema;
  }

  public void setSistema(String sistema) {
    this.sistema = sistema;
  }

  public Upload title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  @ApiModelProperty(example = "ORDINE123456", value = "")

@Size(max=255) 
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Upload idFw(String idFw) {
    this.idFw = idFw;
    return this;
  }

  /**
   * Get idFw
   * @return idFw
  */
  @ApiModelProperty(example = "ORDINE123456789012345678901234", required = true, value = "")
  @NotNull

@Size(max=30) 
  public String getIdFw() {
    return idFw;
  }

  public void setIdFw(String idFw) {
    this.idFw = idFw;
  }

  public Upload estensioneFile(String estensioneFile) {
    this.estensioneFile = estensioneFile;
    return this;
  }

  /**
   * Get estensioneFile
   * @return estensioneFile
  */
  @ApiModelProperty(example = "xml", required = true, value = "")
  @NotNull

@Size(max=10) 
  public String getEstensioneFile() {
    return estensioneFile;
  }

  public void setEstensioneFile(String estensioneFile) {
    this.estensioneFile = estensioneFile;
  }

  public Upload contenuto(String contenuto) {
    this.contenuto = contenuto;
    return this;
  }

  /**
   * Get contenuto
   * @return contenuto
  */
  @ApiModelProperty(example = "PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0iVVRGLTgiP=", required = true, value = "")
  @NotNull


  public String getContenuto() {
    return contenuto;
  }

  public void setContenuto(String contenuto) {
    this.contenuto = contenuto;
  }

  public Upload impronta(String impronta) {
    this.impronta = impronta;
    return this;
  }

  /**
   * Get impronta
   * @return impronta
  */
  @ApiModelProperty(example = "07115624d900bee860254e5e21f33c9048d859fd2ae006eb4ece1438f56ac65107f927182d3b2ceb9f170d3330c97375a9ed26e5ab8728957481f1ac9039db62", required = true, value = "")
  @NotNull


  public String getImpronta() {
    return impronta;
  }

  public void setImpronta(String impronta) {
    this.impronta = impronta;
  }

  public Upload attributi(List<Attributes> attributi) {
    this.attributi = attributi;
    return this;
  }

  public Upload addAttributiItem(Attributes attributiItem) {
    this.attributi.add(attributiItem);
    return this;
  }

  /**
   * Get attributi
   * @return attributi
  */
  @ApiModelProperty(example = "[{nome=fw_ent_doc_od_cod_for, valore=[008], operazione=U}, {nome=fw_ent_doc_od_cod_doc, valore=[0115], operazione=U}, {nome=fw_ent_doc_dewa_des, valore=[Ordine Cliente], operazione=U}]", required = true, value = "")
  @NotNull

  @Valid

  public List<Attributes> getAttributi() {
    return attributi;
  }

  public void setAttributi(List<Attributes> attributi) {
    this.attributi = attributi;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Upload upload = (Upload) o;
    return Objects.equals(this.token, upload.token) &&
        Objects.equals(this.utenteFw, upload.utenteFw) &&
        Objects.equals(this.codiceFonte, upload.codiceFonte) &&
        Objects.equals(this.codiceCliente, upload.codiceCliente) &&
        Objects.equals(this.sistema, upload.sistema) &&
        Objects.equals(this.title, upload.title) &&
        Objects.equals(this.idFw, upload.idFw) &&
        Objects.equals(this.estensioneFile, upload.estensioneFile) &&
        Objects.equals(this.contenuto, upload.contenuto) &&
        Objects.equals(this.impronta, upload.impronta) &&
        Objects.equals(this.attributi, upload.attributi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, utenteFw, codiceFonte, codiceCliente, sistema, title, idFw, estensioneFile, contenuto, impronta, attributi);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Upload {\n");
    
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    utenteFw: ").append(toIndentedString(utenteFw)).append("\n");
    sb.append("    codiceFonte: ").append(toIndentedString(codiceFonte)).append("\n");
    sb.append("    codiceCliente: ").append(toIndentedString(codiceCliente)).append("\n");
    sb.append("    sistema: ").append(toIndentedString(sistema)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    idFw: ").append(toIndentedString(idFw)).append("\n");
    sb.append("    estensioneFile: ").append(toIndentedString(estensioneFile)).append("\n");
    sb.append("    contenuto: ").append(toIndentedString(contenuto)).append("\n");
    sb.append("    impronta: ").append(toIndentedString(impronta)).append("\n");
    sb.append("    attributi: ").append(toIndentedString(attributi)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

