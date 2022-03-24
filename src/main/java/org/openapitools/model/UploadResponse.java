package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UploadResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-26T18:06:25.282Z[Etc/UTC]")
public class UploadResponse   {
  @JsonProperty("idDctm")
  private String idDctm;

  @JsonProperty("versione")
  private String versione;

  public UploadResponse idDctm(String idDctm) {
    this.idDctm = idDctm;
    return this;
  }

  /**
   * Get idDctm
   * @return idDctm
  */
  @ApiModelProperty(example = "an id in Dewa", value = "")


  public String getIdDctm() {
    return idDctm;
  }

  public void setIdDctm(String idDctm) {
    this.idDctm = idDctm;
  }

  public UploadResponse versione(String versione) {
    this.versione = versione;
    return this;
  }

  /**
   * Get versione
   * @return versione
  */
  @ApiModelProperty(example = "a version in Dewa", value = "")


  public String getVersione() {
    return versione;
  }

  public void setVersione(String versione) {
    this.versione = versione;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadResponse uploadResponse = (UploadResponse) o;
    return Objects.equals(this.idDctm, uploadResponse.idDctm) &&
        Objects.equals(this.versione, uploadResponse.versione);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idDctm, versione);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadResponse {\n");
    
    sb.append("    idDctm: ").append(toIndentedString(idDctm)).append("\n");
    sb.append("    versione: ").append(toIndentedString(versione)).append("\n");
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

