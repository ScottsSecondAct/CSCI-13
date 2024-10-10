package weatherapiapp.Location;

import com.fasterxml.jackson.databind.ObjectMapper;

public class LocationParser {
	private ObjectMapper objectMapper;

	public LocationParser() {
		objectMapper = new ObjectMapper();
	}

	public Location ToLocationObject(String jsonString) {

		try {
			// Convert JSON string to Java Object
			return objectMapper.readValue(jsonString, Location.class);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public String ToJsonString(Location location) {

		try {
			// Convert Java Object to JSON string
			return objectMapper.writeValueAsString(location);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
