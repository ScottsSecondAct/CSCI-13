import React from "react";
import { Box, Card, CardContent, CardMedia, Typography } from "@mui/material";

const WeatherForecastList = ({ weatherForecasts }) => (
  <Box sx={{ mb: 4 }}>
    <Typography variant="h6" gutterBottom>
      Weather Forecasts
    </Typography>
    {weatherForecasts.length > 0 ? (
      weatherForecasts.map((forecast, index) => (
        <Card key={index} sx={{ mb: 2 }}>
          <CardContent>
            <Typography variant="h6">{forecast.name}</Typography>
            {forecast.icon && (
              <CardMedia
                component="img"
                image={forecast.icon}
                alt="Weather icon"
                sx={{ width: 100, height: 100, mb: 2 }}
              />
            )}
            <Typography>
              <strong>Temperature:</strong> {forecast.temperature}°
              {forecast.temperatureUnit}
            </Typography>
            <Typography>
              <strong>Condition:</strong> {forecast.shortForecast}
            </Typography>
            <Typography>
              <strong>Details:</strong> {forecast.detailedForecast}
            </Typography>
          </CardContent>
        </Card>
      ))
    ) : (
      <Typography>No weather forecasts available.</Typography>
    )}
  </Box>
);

export default WeatherForecastList;
