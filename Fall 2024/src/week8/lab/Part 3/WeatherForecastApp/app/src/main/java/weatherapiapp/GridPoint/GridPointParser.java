package weatherapiapp.GridPoint;

import com.fasterxml.jackson.databind.ObjectMapper;

public class GridPointParser {
  	private ObjectMapper objectMapper;

	public GridPointParser() {
		objectMapper = new ObjectMapper();
	}

	public GridPoint ToGridPointObject(String jsonString) {

		try {
			// Convert JSON string to Java Object
			return objectMapper.readValue(jsonString, GridPoint.class);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public String ToJsonString(GridPoint gridPoint) {

		try {
			// Convert Java Object to JSON string
			return objectMapper.writeValueAsString(gridPoint);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
