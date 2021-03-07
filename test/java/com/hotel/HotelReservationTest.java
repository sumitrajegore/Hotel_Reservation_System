package com.hotel;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class HotelReservationTest {
	
	@Test
    public void givenHotel_whenInvokeAddHotel_shoulBeAbleToAdd() {
		
        HotelReservationServise hotelReservationService = new HotelReservationServise();
        Hotel hotel = new Hotel("Lakewood",110,90);
        hotelReservationService.addHotel(hotel);
        List<Hotel> hotellist = hotelReservationService.getHotels();
        Assert.assertTrue(hotellist.contains(hotel));
    }
	
    @Test
    public void given3Hotels_whenInvokeFindCheapestHotel_shouldBeAbleToReturnCheapestHotel() {
	        HotelReservationServise hotelReservationService = new HotelReservationServise();
	        Hotel Lakewood = new Hotel("Lakewood",110,90);
	        Hotel Bridgewood = new Hotel("Bridgewood",160,50);
	        Hotel RidgeWood = new Hotel("Ridgewood",220,150);
	        hotelReservationService.addHotel(Lakewood);
	        hotelReservationService.addHotel(Bridgewood);
	        hotelReservationService.addHotel(RidgeWood);
	        int countDays = hotelReservationService.countDays("2020-09-10","2020-09-12");
	        System.out.println("");
	        System.out.println("Total count days : " +countDays);
	        Hotel result = hotelReservationService.findCheapestHotel();
	        Assert.assertTrue(hotelReservationService.hotelList.contains(result));
	    }
    
    @Test
    public void givenHotel_with3Parameters_whenInvokeAddHotel_shoulBeAbleToAdd() {
	        HotelReservationServise hotelReservationService = new HotelReservationServise();
	        Hotel Lakewood = new Hotel("Lakewood",110,90);
	        Hotel Bridgewood = new Hotel("Bridgewood",160,50);
	        Hotel RidgeWood = new Hotel("Ridgewood",220,150);
	        hotelReservationService.addHotel(Lakewood);
	        hotelReservationService.addHotel(Bridgewood);
	        hotelReservationService.addHotel(RidgeWood);
	        System.out.println(Lakewood);
	        System.out.println(Bridgewood);
	        System.out.println(RidgeWood);
	        
	    }
}
