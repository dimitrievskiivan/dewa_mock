package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Attributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-26T18:06:25.282Z[Etc/UTC]")
public class Attributes   {
  @JsonProperty("nome")
  private String nome;

  @JsonProperty("valore")
  @Valid
  private List<String> valore = new ArrayList<>();

  @JsonProperty("operazione")
  private String operazione;

  public Attributes nome(String nome) {
    this.nome = nome;
    return this;
  }

  /**
   * Get nome
   * @return nome
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Attributes valore(List<String> valore) {
    this.valore = valore;
    return this;
  }

  public Attributes addValoreItem(String valoreItem) {
    this.valore.add(valoreItem);
    return this;
  }

  /**
   * Get valore
   * @return valore
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public List<String> getValore() {
    return valore;
  }

  public void setValore(List<String> valore) {
    this.valore = valore;
  }

  public Attributes operazione(String operazione) {
    this.operazione = operazione;
    return this;
  }

  /**
   * Get operazione
   * @return operazione
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getOperazione() {
    return operazione;
  }

  public void setOperazione(String operazione) {
    this.operazione = operazione;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Attributes attributes = (Attributes) o;
    return Objects.equals(this.nome, attributes.nome) &&
        Objects.equals(this.valore, attributes.valore) &&
        Objects.equals(this.operazione, attributes.operazione);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, valore, operazione);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attributes {\n");
    
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    valore: ").append(toIndentedString(valore)).append("\n");
    sb.append("    operazione: ").append(toIndentedString(operazione)).append("\n");
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

