package pl.zzpj2020.solid.dip.weathertracker.violation;


public class WeatherTracker {
    String currentConditions;
    Device device;

    public WeatherTracker(Device device) {
        this.device = device;
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
        if (weatherDescription == "rainy") {
            String alert = device.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
        if (weatherDescription == "sunny") {
            String alert = device.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
    }
}
