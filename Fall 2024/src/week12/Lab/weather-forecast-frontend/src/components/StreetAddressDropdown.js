import React from "react";
import { FormControl, Select, MenuItem, Typography } from "@mui/material";
import { FilePresent } from "@mui/icons-material";

const StreetAddressDropdown = ({
  streetAddresses,
  selectedStreetAddress,
  onStreetAddressChange,
}) => (
  <>
    {/* <Typography variant="subtitle1" sx={{ mb: 1 }}>
      Saved Street Addresses
    </Typography> */}
    <FormControl fullWidth>
      <Select
        labelId="street-address-list-label"
        value={selectedStreetAddress}
        onChange={onStreetAddressChange}
        displayEmpty
        sx={{ height: "56px" }}
      >
        <MenuItem value="" disabled>
          Select a Street address
        </MenuItem>
        {streetAddresses.map((streetAddress) => (
          <MenuItem key={streetAddress.id} value={streetAddress.id}>
            {`${streetAddress.number} ${streetAddress.street}, ${streetAddress.city}, ${streetAddress.state} ${streetAddress.zipCode}`}
          </MenuItem>
        ))}
      </Select>
    </FormControl>
  </>
);

export default StreetAddressDropdown;
