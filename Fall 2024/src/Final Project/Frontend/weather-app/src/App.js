import React, { useState } from "react";
import axios from "axios";
import {
  Container,
  TextField,
  Button,
  Typography,
  CircularProgress,
  Card,
  CardContent,
  Grid,
} from "@mui/material";
import { WiDaySunny, WiCloudy, WiRain, WiSnow } from "react-icons/wi";

const App = () => {
  const [address, setAddress] = useState({
    street: "",
    city: "",
    state: "",
    zip: "",
  });
  const [weather, setWeather] = useState(null);
  const [loading, setLoading] = useState(false);
  const [error, setError] = useState("");

  const handleInputChange = (e) => {
    setAddress({ ...address, [e.target.name]: e.target.value });
  };

  const getWeather = async () => {
    setLoading(true);
    setError("");
    try {
      const response = await axios.post(
        "http://localhost:8080/api/weather",
        address
      );
      setWeather(response.data);
    } catch (err) {
      setError("Unable to retrieve weather data. Please check the address.");
    }
    setLoading(false);
  };

  const renderWeatherIcon = (condition) => {
    if (condition.includes("Sunny")) return <WiDaySunny size={50} />;
    if (condition.includes("Cloud")) return <WiCloudy size={50} />;
    if (condition.includes("Rain")) return <WiRain size={50} />;
    if (condition.includes("Snow")) return <WiSnow size={50} />;
    return <WiDaySunny size={50} />;
  };

  return (
    <Container maxWidth="sm" style={{ marginTop: "50px" }}>
      <Typography variant="h3" align="center" gutterBottom>
        Weather Forecast App
      </Typography>
      <Card style={{ padding: "20px", marginBottom: "20px" }}>
        <CardContent>
          <Typography variant="h6" gutterBottom>
            Enter Address
          </Typography>
          <Grid container spacing={2}>
            <Grid item xs={12}>
              <TextField
                fullWidth
                label="Street"
                name="street"
                value={address.street}
                onChange={handleInputChange}
                variant="outlined"
              />
            </Grid>
            <Grid item xs={6}>
              <TextField
                fullWidth
                label="City"
                name="city"
                value={address.city}
                onChange={handleInputChange}
                variant="outlined"
              />
            </Grid>
            <Grid item xs={3}>
              <TextField
                fullWidth
                label="State"
                name="state"
                value={address.state}
                onChange={handleInputChange}
                variant="outlined"
              />
            </Grid>
            <Grid item xs={3}>
              <TextField
                fullWidth
                label="ZIP Code"
                name="zip"
                value={address.zip}
                onChange={handleInputChange}
                variant="outlined"
              />
            </Grid>
            <Grid item xs={12}>
              <Button
                variant="contained"
                color="primary"
                fullWidth
                onClick={getWeather}
                disabled={loading}
              >
                {loading ? <CircularProgress size={24} /> : "Get Weather"}
              </Button>
            </Grid>
          </Grid>
          {error && (
            <Typography color="error" style={{ marginTop: "20px" }}>
              {error}
            </Typography>
          )}
        </CardContent>
      </Card>

      {weather && (
        <Card>
          <CardContent>
            <Typography variant="h5" align="center" gutterBottom>
              Weather in {weather.location}
            </Typography>
            <Grid container justifyContent="center" spacing={3}>
              <Grid item>{renderWeatherIcon(weather.conditions)}</Grid>
            </Grid>
            <Grid container spacing={2} style={{ marginTop: "20px" }}>
              <Grid item xs={6}>
                <Typography variant="body1">
                  <strong>Temperature:</strong> {weather.temperature.current}°C
                </Typography>
              </Grid>
              <Grid item xs={6}>
                <Typography variant="body1">
                  <strong>High:</strong> {weather.temperature.high}°C
                </Typography>
              </Grid>
              <Grid item xs={6}>
                <Typography variant="body1">
                  <strong>Low:</strong> {weather.temperature.low}°C
                </Typography>
              </Grid>
              <Grid item xs={6}>
                <Typography variant="body1">
                  <strong>Wind Speed:</strong> {weather.windSpeed}
                </Typography>
              </Grid>
              <Grid item xs={6}>
                <Typography variant="body1">
                  <strong>Humidity:</strong> {weather.humidity}%
                </Typography>
              </Grid>
              <Grid item xs={12} align="center">
                <Typography variant="body1">
                  <strong>Condition:</strong> {weather.conditions}
                </Typography>
              </Grid>
            </Grid>
          </CardContent>
        </Card>
      )}
    </Container>
  );
};

export default App;
