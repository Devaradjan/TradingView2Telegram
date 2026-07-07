
package com.devaa.adxsignalalert.model;
public class TradingAlert{
 public String getSymbol() {
  return symbol;
 }

 public void setSymbol(String symbol) {
  this.symbol = symbol;
 }

 public String getTimeFrame() {
  return timeFrame;
 }

 public void setTimeFrame(String timeFrame) {
  this.timeFrame = timeFrame;
 }

 public String getSignal() {
  return signal;
 }

 public void setSignal(String signal) {
  this.signal = signal;
 }

 public String getIndicator() {
  return indicator;
 }

 public void setIndicator(String indicator) {
  this.indicator = indicator;
 }

 public double getPrice() {
  return price;
 }

 public void setPrice(double price) {
  this.price = price;
 }

 public double getStrength() {
  return strength;
 }

 public void setStrength(double strength) {
  this.strength = strength;
 }

 public String symbol,timeFrame,signal,indicator;
 public double price,strength;
}
