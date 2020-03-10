package pl.zzpj2020.solid.dip.weathertracker.violation;

public class Phone implements Device{
    public String generateWeatherAlert(String weatherConditions) {
        String alert = "It is " + weatherConditions;
        return alert;
    }
}
