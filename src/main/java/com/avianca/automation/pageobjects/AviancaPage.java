
package com.avianca.automation.pageobjects;


import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.avianca.com/co/es/")
public class AviancaPage extends PageObject {

 //public By reservarVueloLink = By.id("reservatuvuelo");
 public By gestionaReservaLink = By.id("misviajes");
 public By numeroReservaInput = By.id("numeroReserva");
 public By ApellidoPasajeroInput = By.id("apellidoReserva");

 public void sendGestionarReserva(){
  getDriver().findElement(gestionaReservaLink).click();
 }
 public void sendNumeroReserva(String string){
  getDriver().findElement(numeroReservaInput).sendKeys(string);
 }
 public void sendApellidoPasajero(String string){
  getDriver().findElement(ApellidoPasajeroInput).sendKeys(string);
 }



}