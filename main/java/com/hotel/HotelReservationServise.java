package com.hotel;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import com.google.common.base.Predicate;

public class HotelReservationServise {	
	
	List<Hotel> hotelList = new ArrayList<>();
	
    public void addHotel(Hotel hotel) {
        hotelList.add(hotel);
    }
    public List<Hotel> getHotels() {
        return hotelList;
    }
    public int countDays(String firstDate,String lastDate) {
        LocalDate startDate = LocalDate.parse (firstDate);
        LocalDate endDate = LocalDate.parse(lastDate);
        return  (int) ChronoUnit.DAYS.between(startDate,endDate);
    }
    public Hotel findCheapestHotel() {
    	
        Hotel cheapestRate  =  hotelList.stream().min(Comparator.comparing(Hotel::getWeekdayrate))
        		                                 .orElseThrow(NoSuchElementException::new);
        System.out.println(" TEST2 : find cheapest hotel with rate");
        System.out.println(cheapestRate);
        return cheapestRate;
    }
    
    public Hotel findCheapestHotel_weekday_weekend() {
    	
        Hotel cheapestRateweekday  =  hotelList.stream().min(Comparator.comparing(Hotel::getWeekdayrate))
        		                                 .orElseThrow(NoSuchElementException::new);
        Hotel cheapestRateweekend  =  hotelList.stream().min(Comparator.comparing(Hotel::getWeekendrate))
                .orElseThrow(NoSuchElementException::new);
        System.out.println(" TEST4 : find cheapest hotel with weekdayrate weekendrate");
        System.out.println(cheapestRateweekday);
        System.out.println(cheapestRateweekend);
        return cheapestRateweekday;
    }
    
    public Hotel findCheapestHotelrateing() {
    	
        Hotel cheapestHotel =  hotelList.stream().min(Comparator.comparing(Hotel::getWeekendrate))
        		                                 .orElseThrow(NoSuchElementException::new);
        int cheapestRate = cheapestHotel.getWeekendrate();
        Predicate<Hotel> minimum = elements -> elements.getWeekendrate() == cheapestRate;
        List<Hotel> minimumRateHotelList = hotelList.stream().filter(minimum).collect(Collectors.toList());
        Hotel cheaprate_bestestRateing  =  minimumRateHotelList.stream()
        		                           .max(Comparator.comparing(Hotel::getRate))
        		                           .orElseThrow(NoSuchElementException::new);
        System.out.println(" TEST6 : find cheapest and best hotel with rateing");
        System.out.println(cheaprate_bestestRateing);
        return cheaprate_bestestRateing;
    }
    
    public Hotel findBestestHotelrateing() {
    	
        Hotel BestestRateing  =  hotelList.stream().max(Comparator.comparing(Hotel::getRate))
        		                                 .orElseThrow(NoSuchElementException::new);
        System.out.println(" TEST7 : find Bestest hotel with rateing");
        System.out.println(BestestRateing);
        return BestestRateing;
    }
    
    public Hotel findCheapestHotelrate_reward() {
    	
        Hotel cheapestHotel =  hotelList.stream().min(Comparator.comparing(Hotel::getRewardweekendrate))
        		                                 .orElseThrow(NoSuchElementException::new);
        int cheapestRate = cheapestHotel.getRewardweekendrate();
        Predicate<Hotel> minimum = elements -> elements.getRewardweekendrate() == cheapestRate;
        List<Hotel> minimumRateHotelList = hotelList.stream().filter(minimum).collect(Collectors.toList());
        Hotel cheaprate_bestestRateing_rewards  =  minimumRateHotelList.stream()
        		                                   .max(Comparator.comparing(Hotel::getRate))
        		                                   .orElseThrow(NoSuchElementException::new);
        System.out.println(" TEST10 : find cheapest and best hotel for reward custumer with rate");
        System.out.println(" TEST11 : find cheapest and best hotel for reward custumer with rate using stream ");
        System.out.println(cheaprate_bestestRateing_rewards);
        return cheaprate_bestestRateing_rewards;
    }
    
    public Hotel findCheapestHotelrate_regular() {
    	
        Hotel cheapestHotel =  hotelList.stream().min(Comparator.comparing(Hotel::getWeekendrate))
        		                                 .orElseThrow(NoSuchElementException::new);
        int cheapestRate = cheapestHotel.getWeekendrate();
        Predicate<Hotel> minimum = elements -> elements.getWeekendrate() == cheapestRate;
        List<Hotel> minimumRateHotelList = hotelList.stream().filter(minimum).collect(Collectors.toList());
        Hotel cheaprate_bestestRateing  =  minimumRateHotelList.stream()
        		                          .max(Comparator.comparing(Hotel::getRate))
        		                          .orElseThrow(NoSuchElementException::new);
        System.out.println(" TEST12 : find cheapest and best hotel for regular custumer with rate");
        System.out.println(cheaprate_bestestRateing);
        return cheaprate_bestestRateing;
    }
}
