import React from "react";
import { Button } from "@mui/material";

const NewStreetAddressButton = ({ onShowForm }) => (
  <Button
    variant="contained"
    color="primary"
    // sx={{ mb: 4 }}
    sx={{ height: "56px", display: "flex", alignItems: "center" }}
    onClick={onShowForm}
  >
    New Street Address
  </Button>
);

export default NewStreetAddressButton;
