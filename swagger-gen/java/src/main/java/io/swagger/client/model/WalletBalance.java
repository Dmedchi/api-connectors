/*
 * Bybit API
 * ## REST API for the Bybit Exchange. Base URI: [https://api-testnet.bybit.com]  
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@bybit.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

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
 * Get wallet balance response
 */
@ApiModel(description = "Get wallet balance response")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-23T17:07:23.289+08:00")
public class WalletBalance {
  @SerializedName("equity")
  private Double equity = null;

  @SerializedName("available_balance")
  private Double availableBalance = null;

  @SerializedName("used_margin")
  private Double usedMargin = null;

  @SerializedName("order_margin")
  private Double orderMargin = null;

  @SerializedName("position_margin")
  private Double positionMargin = null;

  @SerializedName("occ_closing_fee")
  private Double occClosingFee = null;

  @SerializedName("occ_funding_fee")
  private Double occFundingFee = null;

  @SerializedName("wallet_balance")
  private Double walletBalance = null;

  @SerializedName("realised_pnl")
  private Double realisedPnl = null;

  @SerializedName("unrealised_pnl")
  private Double unrealisedPnl = null;

  @SerializedName("cum_realised_pnl")
  private Double cumRealisedPnl = null;

  @SerializedName("given_cash")
  private Double givenCash = null;

  @SerializedName("service_cash")
  private Double serviceCash = null;

  public WalletBalance equity(Double equity) {
    this.equity = equity;
    return this;
  }

   /**
   * Get equity
   * @return equity
  **/
  @ApiModelProperty(value = "")
  public Double getEquity() {
    return equity;
  }

  public void setEquity(Double equity) {
    this.equity = equity;
  }

  public WalletBalance availableBalance(Double availableBalance) {
    this.availableBalance = availableBalance;
    return this;
  }

   /**
   * Get availableBalance
   * @return availableBalance
  **/
  @ApiModelProperty(value = "")
  public Double getAvailableBalance() {
    return availableBalance;
  }

  public void setAvailableBalance(Double availableBalance) {
    this.availableBalance = availableBalance;
  }

  public WalletBalance usedMargin(Double usedMargin) {
    this.usedMargin = usedMargin;
    return this;
  }

   /**
   * Get usedMargin
   * @return usedMargin
  **/
  @ApiModelProperty(value = "")
  public Double getUsedMargin() {
    return usedMargin;
  }

  public void setUsedMargin(Double usedMargin) {
    this.usedMargin = usedMargin;
  }

  public WalletBalance orderMargin(Double orderMargin) {
    this.orderMargin = orderMargin;
    return this;
  }

   /**
   * Get orderMargin
   * @return orderMargin
  **/
  @ApiModelProperty(value = "")
  public Double getOrderMargin() {
    return orderMargin;
  }

  public void setOrderMargin(Double orderMargin) {
    this.orderMargin = orderMargin;
  }

  public WalletBalance positionMargin(Double positionMargin) {
    this.positionMargin = positionMargin;
    return this;
  }

   /**
   * Get positionMargin
   * @return positionMargin
  **/
  @ApiModelProperty(value = "")
  public Double getPositionMargin() {
    return positionMargin;
  }

  public void setPositionMargin(Double positionMargin) {
    this.positionMargin = positionMargin;
  }

  public WalletBalance occClosingFee(Double occClosingFee) {
    this.occClosingFee = occClosingFee;
    return this;
  }

   /**
   * Get occClosingFee
   * @return occClosingFee
  **/
  @ApiModelProperty(value = "")
  public Double getOccClosingFee() {
    return occClosingFee;
  }

  public void setOccClosingFee(Double occClosingFee) {
    this.occClosingFee = occClosingFee;
  }

  public WalletBalance occFundingFee(Double occFundingFee) {
    this.occFundingFee = occFundingFee;
    return this;
  }

   /**
   * Get occFundingFee
   * @return occFundingFee
  **/
  @ApiModelProperty(value = "")
  public Double getOccFundingFee() {
    return occFundingFee;
  }

  public void setOccFundingFee(Double occFundingFee) {
    this.occFundingFee = occFundingFee;
  }

  public WalletBalance walletBalance(Double walletBalance) {
    this.walletBalance = walletBalance;
    return this;
  }

   /**
   * Get walletBalance
   * @return walletBalance
  **/
  @ApiModelProperty(value = "")
  public Double getWalletBalance() {
    return walletBalance;
  }

  public void setWalletBalance(Double walletBalance) {
    this.walletBalance = walletBalance;
  }

  public WalletBalance realisedPnl(Double realisedPnl) {
    this.realisedPnl = realisedPnl;
    return this;
  }

   /**
   * Get realisedPnl
   * @return realisedPnl
  **/
  @ApiModelProperty(value = "")
  public Double getRealisedPnl() {
    return realisedPnl;
  }

  public void setRealisedPnl(Double realisedPnl) {
    this.realisedPnl = realisedPnl;
  }

  public WalletBalance unrealisedPnl(Double unrealisedPnl) {
    this.unrealisedPnl = unrealisedPnl;
    return this;
  }

   /**
   * Get unrealisedPnl
   * @return unrealisedPnl
  **/
  @ApiModelProperty(value = "")
  public Double getUnrealisedPnl() {
    return unrealisedPnl;
  }

  public void setUnrealisedPnl(Double unrealisedPnl) {
    this.unrealisedPnl = unrealisedPnl;
  }

  public WalletBalance cumRealisedPnl(Double cumRealisedPnl) {
    this.cumRealisedPnl = cumRealisedPnl;
    return this;
  }

   /**
   * Get cumRealisedPnl
   * @return cumRealisedPnl
  **/
  @ApiModelProperty(value = "")
  public Double getCumRealisedPnl() {
    return cumRealisedPnl;
  }

  public void setCumRealisedPnl(Double cumRealisedPnl) {
    this.cumRealisedPnl = cumRealisedPnl;
  }

  public WalletBalance givenCash(Double givenCash) {
    this.givenCash = givenCash;
    return this;
  }

   /**
   * Get givenCash
   * @return givenCash
  **/
  @ApiModelProperty(value = "")
  public Double getGivenCash() {
    return givenCash;
  }

  public void setGivenCash(Double givenCash) {
    this.givenCash = givenCash;
  }

  public WalletBalance serviceCash(Double serviceCash) {
    this.serviceCash = serviceCash;
    return this;
  }

   /**
   * Get serviceCash
   * @return serviceCash
  **/
  @ApiModelProperty(value = "")
  public Double getServiceCash() {
    return serviceCash;
  }

  public void setServiceCash(Double serviceCash) {
    this.serviceCash = serviceCash;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletBalance walletBalance = (WalletBalance) o;
    return Objects.equals(this.equity, walletBalance.equity) &&
        Objects.equals(this.availableBalance, walletBalance.availableBalance) &&
        Objects.equals(this.usedMargin, walletBalance.usedMargin) &&
        Objects.equals(this.orderMargin, walletBalance.orderMargin) &&
        Objects.equals(this.positionMargin, walletBalance.positionMargin) &&
        Objects.equals(this.occClosingFee, walletBalance.occClosingFee) &&
        Objects.equals(this.occFundingFee, walletBalance.occFundingFee) &&
        Objects.equals(this.walletBalance, walletBalance.walletBalance) &&
        Objects.equals(this.realisedPnl, walletBalance.realisedPnl) &&
        Objects.equals(this.unrealisedPnl, walletBalance.unrealisedPnl) &&
        Objects.equals(this.cumRealisedPnl, walletBalance.cumRealisedPnl) &&
        Objects.equals(this.givenCash, walletBalance.givenCash) &&
        Objects.equals(this.serviceCash, walletBalance.serviceCash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(equity, availableBalance, usedMargin, orderMargin, positionMargin, occClosingFee, occFundingFee, walletBalance, realisedPnl, unrealisedPnl, cumRealisedPnl, givenCash, serviceCash);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletBalance {\n");
    
    sb.append("    equity: ").append(toIndentedString(equity)).append("\n");
    sb.append("    availableBalance: ").append(toIndentedString(availableBalance)).append("\n");
    sb.append("    usedMargin: ").append(toIndentedString(usedMargin)).append("\n");
    sb.append("    orderMargin: ").append(toIndentedString(orderMargin)).append("\n");
    sb.append("    positionMargin: ").append(toIndentedString(positionMargin)).append("\n");
    sb.append("    occClosingFee: ").append(toIndentedString(occClosingFee)).append("\n");
    sb.append("    occFundingFee: ").append(toIndentedString(occFundingFee)).append("\n");
    sb.append("    walletBalance: ").append(toIndentedString(walletBalance)).append("\n");
    sb.append("    realisedPnl: ").append(toIndentedString(realisedPnl)).append("\n");
    sb.append("    unrealisedPnl: ").append(toIndentedString(unrealisedPnl)).append("\n");
    sb.append("    cumRealisedPnl: ").append(toIndentedString(cumRealisedPnl)).append("\n");
    sb.append("    givenCash: ").append(toIndentedString(givenCash)).append("\n");
    sb.append("    serviceCash: ").append(toIndentedString(serviceCash)).append("\n");
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

