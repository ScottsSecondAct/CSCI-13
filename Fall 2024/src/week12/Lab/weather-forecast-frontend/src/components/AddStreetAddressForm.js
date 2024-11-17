import React from "react";
import { Box, TextField, Button, Typography } from "@mui/material";

const AddStreetAddressForm = ({
  newStreetAddress,
  setNewStreetAddress,
  onAddStreetAddress,
  onCancel,
}) => (
  <Box sx={{ mb: 4 }}>
    <Typography variant="h6" gutterBottom>
      Add New Street Address
    </Typography>
    <TextField
      fullWidth
      label="Street Number"
      variant="outlined"
      value={newStreetAddress.number}
      onChange={(e) =>
        setNewStreetAddress({ ...newStreetAddress, number: e.target.value })
      }
      sx={{ mb: 2 }}
    />
    <TextField
      fullWidth
      label="Street"
      variant="outlined"
      value={newStreetAddress.street}
      onChange={(e) =>
        setNewStreetAddress({ ...newStreetAddress, street: e.target.value })
      }
      sx={{ mb: 2 }}
    />
    <TextField
      fullWidth
      label="City"
      variant="outlined"
      value={newStreetAddress.city}
      onChange={(e) =>
        setNewStreetAddress({ ...newStreetAddress, city: e.target.value })
      }
      sx={{ mb: 2 }}
    />
    <TextField
      fullWidth
      label="State"
      variant="outlined"
      value={newStreetAddress.state}
      onChange={(e) =>
        setNewStreetAddress({ ...newStreetAddress, state: e.target.value })
      }
      sx={{ mb: 2 }}
    />
    <TextField
      fullWidth
      label="ZIP Code"
      variant="outlined"
      value={newStreetAddress.zipCode}
      onChange={(e) =>
        setNewStreetAddress({ ...newStreetAddress, zipCode: e.target.value })
      }
      sx={{ mb: 2 }}
    />
    <Button variant="contained" color="primary" onClick={onAddStreetAddress}>
      Add
    </Button>
    <Button variant="outlined" color="secondary" onClick={onCancel}>
      Cancel
    </Button>
  </Box>
);

export default AddStreetAddressForm;
