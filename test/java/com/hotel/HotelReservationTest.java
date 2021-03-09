package com.hotel;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class HotelReservationTest {
	
		@Test
		public void givenHotel_whenInvokeAddHotel_shoulBeAbleToAdd() {
		
        		HotelReservationServise hotelReservationService = new HotelReservationServise();
      			Hotel hotel = new Hotel("Lakewood", 3, 110, 90, 80, 80);
        		hotelReservationService.addHotel(hotel);
        		List<Hotel> hotellist = hotelReservationService.getHotels();
        		System.out.println(" ");
        		System.out.println(" TEST 1 : Add Hotel details");
        		System.out.println(hotellist);
        		Assert.assertTrue(hotellist.contains(hotel));
    		}
		
	    	@Test
		public void given3Hotels_whenInvokeFindCheapestHotel_shouldBeAbleToReturnCheapestHotel() {
	    	
	        	HotelReservationServise hotelReservationService = new HotelReservationServise();
	        	Hotel Lakewood = new Hotel("Lakewood", 3, 110, 90, 80, 80);
	        	Hotel Bridgewood = new Hotel("Bridgewood", 4, 160, 50, 110, 50);
	        	Hotel RidgeWood = new Hotel("Ridgewood", 5, 220, 150, 110, 40);

  		  }

		 @Test
	    	public void given3Hotels_whenInvokeFindCheapestHotel_shouldBeAbleToReturnCheapestHotel() {
			
	       		HotelReservationServise hotelReservationService = new HotelReservationServise();
	        	Hotel Lakewood = new Hotel("Lakewood",110);
	       	 	Hotel Bridgewood = new Hotel("Bridgewood",160);
	        	Hotel RidgeWood = new Hotel("Ridgewood",220);
	       		hotelReservationService.addHotel(Lakewood);
	        	hotelReservationService.addHotel(Bridgewood);
	        	hotelReservationService.addHotel(RidgeWood);
	        	int countDays = hotelReservationService.countDays("2020-09-10", "2020-09-12");
	        	System.out.println(" ");
	        	System.out.println("Total count days : " +countDays);
	        	Hotel result = hotelReservationService.findCheapestHotel();
	        	Assert.assertTrue(hotelReservationService.hotelList.contains(result));
	   	 }
    
    		@Test
    		public void givenHotel_with3Parameters_whenInvokeAddHotel_shoulBeAbleToAdd() {
	        	HotelReservationServise hotelReservationService = new HotelReservationServise();
	        	Hotel Lakewood = new Hotel("Lakewood", 3, 110, 90, 80, 80);
	        	Hotel Bridgewood = new Hotel("Bridgewood", 4, 160, 50, 110, 50);
	        	Hotel RidgeWood = new Hotel("Ridgewood", 5, 220, 150, 110, 40);
	        	hotelReservationService.addHotel(Lakewood);
	        	hotelReservationService.addHotel(Bridgewood);
	        	hotelReservationService.addHotel(RidgeWood);
	        	System.out.println(" ");
	        	System.out.println(" TEST 3 : Add weekday and weekend rate for regular custumer to each hotel");
	       		System.out.println(" TEST 5 : Add rateing for each hotel hotel");
	        	System.out.println(" TEST 9 : Add weekday and weekend rate for reward custumer to each hotel");
	        	System.out.println(Lakewood);
	        	System.out.println(Bridgewood);
	        	System.out.println(RidgeWood);
	    	}
    		@Test
		public void given3Hotels_whenweek_day_and_end_FindCheapestHotel_shouldBeAbleToReturnCheapestHotel() {
	    	
	        	HotelReservationServise hotelReservationService = new HotelReservationServise();
	        	Hotel Lakewood = new Hotel("Lakewood", 3, 110, 90, 80, 80);
	        	Hotel Bridgewood = new Hotel("Bridgewood", 4, 160, 50, 110, 50);
	        	Hotel RidgeWood = new Hotel("Ridgewood", 5, 220, 150, 110, 40);
	        	hotelReservationService.addHotel(Lakewood);
	        	hotelReservationService.addHotel(Bridgewood);
	        	hotelReservationService.addHotel(RidgeWood);
	        	int countDays = hotelReservationService.countDays("2020-09-10", "2020-09-12");
	        	System.out.println(" ");
	        	System.out.println("Total count days : " +countDays);
	        	Hotel result = hotelReservationService.findCheapestHotel_weekday_weekend();
	       		Assert.assertTrue(hotelReservationService.hotelList.contains(result));
	    	}
    	
    		@Test
		public void given3Hotels_FindCheapestHotel_rating_shouldBeAbleToReturnCheapestHotelrateing() {
	    	
	       		HotelReservationServise hotelReservationService = new HotelReservationServise();
	        	Hotel Lakewood = new Hotel("Lakewood", 3, 110, 90, 80, 80);
	       		Hotel Bridgewood = new Hotel("Bridgewood", 4, 160, 50, 110, 50);
	        	Hotel RidgeWood = new Hotel("Ridgewood", 5, 220, 150, 110, 40);
	        	hotelReservationService.addHotel(Lakewood);
	        	hotelReservationService.addHotel(Bridgewood);
	        	hotelReservationService.addHotel(RidgeWood);
	        	int countDays = hotelReservationService.countDays("2020-09-10", "2020-09-12");
	        	System.out.println(" ");
	        	System.out.println("Total count days : " +countDays);
	        	Hotel result = hotelReservationService.findCheapestHotelrateing();
	        	Assert.assertTrue(hotelReservationService.hotelList.contains(result));
	    	}
    	
    		@Test
		public void given3Hotels_FindBestestHotel_rating_shouldBeAbleToReturnBestestHotelrateing() {
	    	
	        	HotelReservationServise hotelReservationService = new HotelReservationServise();
	        	Hotel Lakewood = new Hotel("Lakewood", 3, 110, 90, 80, 80);
	        	Hotel Bridgewood = new Hotel("Bridgewood", 4, 160, 50, 110, 50);
	        	Hotel RidgeWood = new Hotel("Ridgewood", 5, 220, 150, 110, 40);
	       		hotelReservationService.addHotel(Lakewood);
	        	hotelReservationService.addHotel(Bridgewood);
	        	hotelReservationService.addHotel(RidgeWood);
	        	int countDays = hotelReservationService.countDays("2020-09-10", "2020-09-12");
	       		System.out.println(" ");
	        	System.out.println("Total count days : " +countDays);
	        	Hotel result = hotelReservationService.findBestestHotelrateing();
	        	Assert.assertTrue(hotelReservationService.hotelList.contains(result));
	    	}
    	
    		@Test
		public void given3Hotels_FindCheapestHotel_reward_rate_shouldBeAbleToReturnCheapestHotelrate() {
	    	
	        	HotelReservationServise hotelReservationService = new HotelReservationServise();
	        	Hotel Lakewood = new Hotel("Lakewood", 3, 110, 90, 80, 80);
	        	Hotel Bridgewood = new Hotel("Bridgewood", 4, 160, 50, 110, 50);
	        	Hotel RidgeWood = new Hotel("Ridgewood", 5, 220, 150, 110, 40);
	        	hotelReservationService.addHotel(Lakewood);
	        	hotelReservationService.addHotel(Bridgewood);
	        	hotelReservationService.addHotel(RidgeWood);
	        	int countDays = hotelReservationService.countDays("2020-09-10", "2020-09-12");
	        	System.out.println(" ");
	        	System.out.println("Total count days : " +countDays);
	        	Hotel result = hotelReservationService.findCheapestHotelrate_reward();
	        	Assert.assertTrue(hotelReservationService.hotelList.contains(result));
	    	}
    	
    		@Test
		public void given3Hotels_FindCheapestHotel_custumer_rate_shouldBeAbleToReturnCheapestHotelrate() {
	    	
	        	HotelReservationServise hotelReservationService = new HotelReservationServise();
	        	Hotel Lakewood = new Hotel("Lakewood", 3, 110, 90, 80, 80);
	        	Hotel Bridgewood = new Hotel("Bridgewood", 4, 160, 50, 110, 50);
	        	Hotel RidgeWood = new Hotel("Ridgewood", 5, 220, 150, 110, 40);
	        	hotelReservationService.addHotel(Lakewood);
	        	hotelReservationService.addHotel(Bridgewood);
	        	hotelReservationService.addHotel(RidgeWood);
	        	int countDays = hotelReservationService.countDays("2020-09-10", "2020-09-12");
	        	System.out.println(" ");
	        	System.out.println("Total count days : " +countDays);
	        	Hotel result = hotelReservationService.findCheapestHotelrate_regular();
	        	Assert.assertTrue(hotelReservationService.hotelList.contains(result));
	    	}
}
