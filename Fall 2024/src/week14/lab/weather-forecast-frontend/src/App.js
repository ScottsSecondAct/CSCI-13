import React, { useState, useEffect } from "react";
import axios from "axios";
import config from "./config";
import { Container, Typography, Box } from "@mui/material";
import StreetAddressDropdown from "./components/StreetAddressDropdown";
import AddStreetAddressForm from "./components/AddStreetAddressForm";
import WeatherForecastList from "./components/WeatherForecastList";
import NewStreetAddressButton from "./components/NewStreetAddressButton";

const App = () => {
  const [streetAddresses, setStreetAddresses] = useState([]);
  const [weatherForecasts, setWeatherForecasts] = useState([]);
  const [selectedStreetAddress, setSelectedStreetAddress] = useState("");
  const [showNewStreetAddressForm, setShowNewStreetAddressForm] =
    useState(false);
  const [newStreetAddress, setNewStreetAddress] = useState({
    number: "",
    street: "",
    city: "",
    state: "",
    zipCode: "",
  });

  const fetchStreetAddresses = async () => {
    try {
      const response = await axios.get(
        `${config.API_BASE_URL}/street-address/`
      );
      setStreetAddresses(response.data);
    } catch (error) {
      console.error("Error fetching addresses:", error);
    }
  };

  const fetchWeatherForecasts = async (addressId) => {
    try {
      const response = await axios.get(
        `${config.API_BASE_URL}/weather-forecast/${addressId}`
      );
      setWeatherForecasts(response.data);
    } catch (error) {
      console.error("Error fetching weather forecasts:", error);
    }
  };

  useEffect(() => {
    fetchStreetAddresses();
  }, []);

  const handleStreetAddressChange = (event) => {
    const streetAddressId = event.target.value;
    setSelectedStreetAddress(streetAddressId);
    fetchWeatherForecasts(streetAddressId);
  };

  const handleAddStreetAddress = async () => {
    if (
      newStreetAddress.number &&
      newStreetAddress.street &&
      newStreetAddress.city &&
      newStreetAddress.state &&
      newStreetAddress.zipCode
    ) {
      try {
        const response = await axios.post(
          `${config.API_BASE_URL}/street-address/`,
          newStreetAddress
        );

        const addedStreetAddress = response.data;

        setStreetAddresses([...streetAddresses, addedStreetAddress]);

        setSelectedStreetAddress(addedStreetAddress.id);
        fetchStreetAddresses(addedStreetAddress.id);

        setNewStreetAddress({
          number: "",
          street: "",
          city: "",
          state: "",
          zipCode: "",
        });
        setShowNewStreetAddressForm(false);
      } catch (error) {
        console.error("Error adding new address:", error);
      }
    } else {
      alert("Please fill in all fields.");
    }
  };

  const handleCancel = () => {
    setShowNewStreetAddressForm(false); // Hide the form without changes
    setNewStreetAddress({
      number: "",
      street: "",
      city: "",
      state: "",
      zipCode: "",
    }); // Reset form fields
  };

  return (
    <Container maxWidth="md" sx={{ mt: 4 }}>
      <Typography variant="h4" gutterBottom>
        Weather Forecast App
      </Typography>

      {/* Dropdown and New Street Address Button */}
      <Box
        sx={{
          display: "flex",
          alignItems: "center",
          justifyContent: "space-between",
          mb: 4,
        }}
      >
        <Box sx={{ flex: 1, mr: 2 }}>
          <StreetAddressDropdown
            streetAddresses={streetAddresses}
            selectedStreetAddress={selectedStreetAddress}
            onStreetAddressChange={handleStreetAddressChange}
          />
        </Box>
        {!showNewStreetAddressForm && (
          <NewStreetAddressButton
            onShowForm={() => setShowNewStreetAddressForm(true)}
          />
        )}
      </Box>

      {showNewStreetAddressForm && (
        <AddStreetAddressForm
          newStreetAddress={newStreetAddress}
          setNewStreetAddress={setNewStreetAddress}
          onAddStreetAddress={handleAddStreetAddress}
          onCancel={handleCancel}
        />
      )}

      <WeatherForecastList weatherForecasts={weatherForecasts} />
    </Container>
  );
};

export default App;
