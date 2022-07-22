
public class HotelMid {
	void hotelRoomId()
	{
		System.out.println("502");
		System.out.println("----------------");
		
	}
	void checkin(String checkinDay)
	{
		
		System.out.println("check In time is = "+checkinDay);
	
	}
	String  checkout(String checkoutDay)
	{

		System.out.println("----------------");
		return checkoutDay;
		
	}
	String wayOfgreeting()
	{
		System.out.println("----------------");
		return "thank you for visiting";
		
	}

	
	
	public static void main(String args[] )
	{
		HotelMid hotelMidobj = new HotelMid();
		hotelMidobj.hotelRoomId();
		hotelMidobj.checkin("Monday");
		String m =hotelMidobj.checkout("Saturday");
		System.out.println("checkout day is= "+m);
		
		System.out.println(""+hotelMidobj.wayOfgreeting());
 	
		
	}

}
