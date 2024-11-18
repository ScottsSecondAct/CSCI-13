const config = {
  API_BASE_URL:
    process.env.NODE_ENV === "development"
      ? "http://localhost:8080/api" // Development API
      : "https://api.yourproductionurl.com/api", // Production API
};

export default config;
