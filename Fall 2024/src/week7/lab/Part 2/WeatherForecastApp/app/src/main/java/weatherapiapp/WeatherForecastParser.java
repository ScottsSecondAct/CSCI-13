package weatherapiapp;

import com.fasterxml.jackson.databind.ObjectMapper;

public class WeatherForecastParser {

	private ObjectMapper objectMapper;

	public WeatherForecastParser() {
		objectMapper = new ObjectMapper();
	}

	public WeatherForecast ToWeatherForecastObject(String jsonString) {

		try {
			// Convert JSON string to Java Object
			return objectMapper.readValue(jsonString, WeatherForecast.class);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public String ToJsonString(WeatherForecast weatherForecast) {

		try {
			// Convert Java Object to JSON string
			return objectMapper.writeValueAsString(weatherForecast);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
