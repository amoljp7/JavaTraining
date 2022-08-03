
public class OwnNestedClass {

	public static void main(String[] args) {
		
			SmartPhone sp1 = new SmartPhone("Apple", "Iphone 13 Pro Max", 109000.57f);
			
			SmartPhone sp2 = new SmartPhone("Samsung", "Galaxy Note 22", 909000.57f);
			
			SmartPhone sp3 = new SmartPhone("Google", "Pixel 8", 69000.57f);
			
			sp1.printPhone();	
			sp2.printPhone();	
			sp3.printPhone();	
	}

}


class SmartPhone
{
	String BrandName;
	String ModelNo;
	float price;
	Camera cam;
	PhoneSpeakers ps;
	
	
	
	public SmartPhone(String brandName, String modelNo,float price ) {
		super();
		BrandName = brandName;
		ModelNo = modelNo;
		this.price = price;
		cam = new Camera("sony IMX 1000",1.5f, 50,true);
		ps = new PhoneSpeakers("Harman", 100,true);
	}

	public void printPhone() {
		System.out.println("+-------------SMARTPHONE DETAILS---------------+");
		System.out.println("SmartPhone Name: " + BrandName);
		System.out.println("Smartphone Model: " + ModelNo);
		System.out.println("CAMERA DETAILS");
		System.out.println(cam);
		System.out.println("Phone Speakers Details");
		System.out.println(ps);
		System.out.println("+----------------------------------------------+");
		
	}
	

	public class Camera
	{
		private String cameraBrand;
		private float foucs;
		private float megapixels;
		private boolean IsNightMode;
		
	
		public Camera(String cameraBrand, float foucs, float megapixels, boolean isNightMode) {
			super();
			this.cameraBrand = cameraBrand;
			this.foucs = foucs;
			this.megapixels = megapixels;
			IsNightMode = isNightMode;
		}
		
		public String getCameraBrand() {
			return cameraBrand;
		}
		public void setCameraBrand(String cameraBrand) {
			this.cameraBrand = cameraBrand;
		}
		public float getFoucs() {
			return foucs;
		}
		public void setFoucs(float foucs) {
			this.foucs = foucs;
		}
		public float getMegapixels() {
			return megapixels;
		}
		public void setMegapixels(float megapixels) {
			this.megapixels = megapixels;
		}
		public boolean isIsNightMode() {
			return IsNightMode;
		}
		public void setIsNightMode(boolean isNightMode) {
			IsNightMode = isNightMode;
		}

		@Override
		public String toString() {
			return "Camera [cameraBrand=" + cameraBrand + ", foucs=" + foucs + ", megapixels=" + megapixels
					+ ", IsNightMode=" + IsNightMode + "]";
		}
		
	}
	
	
	public class PhoneSpeakers
	{
		private String speakerBrand;
		private int basslimit;
		private boolean headphoneJack;
		
		public PhoneSpeakers(String speakerBrand, int basslimit, boolean headphoneJack) {
			super();
			this.speakerBrand = speakerBrand;
			this.basslimit = basslimit;
			this.headphoneJack = headphoneJack;
		}

		public String getSpeakerBrand() {
			return speakerBrand;
		}

		public void setSpeakerBrand(String speakerBrand) {
			this.speakerBrand = speakerBrand;
		}

		public int getBasslimit() {
			return basslimit;
		}

		public void setBasslimit(int basslimit) {
			this.basslimit = basslimit;
		}

		public boolean isHeadphoneJack() {
			return headphoneJack;
		}

		public void setHeadphoneJack(boolean headphoneJack) {
			this.headphoneJack = headphoneJack;
		}

		@Override
		public String toString() {
			return "PhoneSpeakers [speakerBrand=" + speakerBrand + ", basslimit=" + basslimit + ", headphoneJack="
					+ headphoneJack + "]";
		}
		
		
		
	}
	
}