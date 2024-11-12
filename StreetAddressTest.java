// import org.junit.jupiter.api.Test;
// import static org.junit.jupiter.api.Assertions.*;

// public class StreetAddressTest {

//   @Test
//   public void testFormatAddress() {
//     StreetAddress address = new StreetAddress("4600", "Silver Hill Rd", "Washington", "DC", "20233", "USA");
//     String expected = "4600+Silver+Hill+Rd%2C+Washington%2C+DC 20233";
//     assertEquals(expected, address.formatAddress());
//   }

//   @Test
//   public void testFormatAddressWithSpaces() {
//     StreetAddress address = new StreetAddress("123", "Main Street", "Anytown", "CA", "12345", "USA");
//     String expected = "123+Main+Street%2C+Anytown%2C+CA 12345";
//     assertEquals(expected, address.formatAddress());
//   }

//   @Test
//   public void testFormatAddressWithMultipleSpaces() {
//     StreetAddress address = new StreetAddress("789", "Elm   Street", "Othertown", "TX", "67890", "USA");
//     String expected = "789+Elm+Street%2C+Othertown%2C+TX 67890";
//     assertEquals(expected, address.formatAddress());
//   }
// }