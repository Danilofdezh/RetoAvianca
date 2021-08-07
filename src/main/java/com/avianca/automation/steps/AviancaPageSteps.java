package com.avianca.automation.steps;

import com.avianca.automation.models.DataInjection;
import com.avianca.automation.pageobjects.AviancaPage;
import com.avianca.automation.utils.Times;
import net.thucydides.core.annotations.Step;


import java.util.concurrent.TimeUnit;

public class AviancaPageSteps {
    AviancaPage aviancaPage = new AviancaPage();
    DataInjection dataInjection = new DataInjection();


    @Step
    public void openBrowser(){
        aviancaPage.open();
    }

    @Step
    public void fillFieldInAviancaPages() throws InterruptedException {
        aviancaPage.getDriver().manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        Times.waitFor(2000);
        aviancaPage.sendNumeroReserva(dataInjection.getNumeroReserva());
        aviancaPage.sendApellidoPasajero(dataInjection.getApellidoPasajero());
        Times.waitFor(1000);


    }

}