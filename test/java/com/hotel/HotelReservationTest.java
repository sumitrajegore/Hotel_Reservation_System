package com.hotel;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class HotelReservationTest {
	
	@Test
    public void givenHotel_whenInvokeAddHotel_shoulBeAbleToAdd() {
		
        HotelReservationServise hotelReservationService = new HotelReservationServise();
        Hotel hotel = new Hotel("Lakewood",110);
        hotelReservationService.addHotel(hotel);
        List<Hotel> hotellist = hotelReservationService.getHotels();
        Assert.assertTrue(hotellist.contains(hotel));
    }
}
