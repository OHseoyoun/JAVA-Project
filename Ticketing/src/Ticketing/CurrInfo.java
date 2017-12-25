package Ticketing;

public class CurrInfo { 
	static boolean chmem;
	static String id="";
	static String pwd="";
	static int seattime;
	static int howtime;
	static int amount=0;
	static String type;
	static int month=0;
	static int day=0;
	static int inning=0;
	static String area=null;
	static int seatnum=0;
	static String payment="";
	static String bank="";
	
	public static void setType(String type) {
		CurrInfo.type = type;
	}
	public static void setCurrId(String mid){
		id=mid;
	}
	public static void setPwd(String pwd) {
		CurrInfo.pwd = pwd;
	}
	public static void setSeattime(int seattime) {
		CurrInfo.seattime = seattime;
	}
	public static void setHowtime(int howtime) {
		CurrInfo.howtime = howtime;
	}
	public static void setAmount(int amount) {
		CurrInfo.amount = amount;
	}
	public static String getCurrId()
	{
		return id;
	}
	public static int getSeattime() {
		return seattime;
	}
	public static int getHowtime() {
		return howtime;
	}
	public static int getAmount() {
		return amount;
	}
	public static String getType() {
		return type;
	}
	public static String getPwd() {
		return pwd;
	}
	public static int getMonth() {
		return month;
	}
	public static void setMonth(int month) {
		CurrInfo.month = month;
	}
	public static int getDay() {
		return day;
	}
	public static void setDay(int day) {
		CurrInfo.day = day;
	}
	public static int getInning() {
		return inning;
	}
	public static void setInning(int inning) {
		CurrInfo.inning = inning;
	}
	public static String getArea() {
		return area;
	}
	public static void setArea(String area) {
		CurrInfo.area = area;
	}
	public static int getSeatnum() {
		return seatnum;
	}
	public static void setSeatnum(int seatnum) {
		CurrInfo.seatnum = seatnum;
	}
	public static String getPayment() {
		return payment;
	}
	public static void setPayment(String payment) {
		CurrInfo.payment = payment;
	}
	public static String getBank() {
		return bank;
	}
	public static void setBank(String bank) {
		CurrInfo.bank = bank;
	}
	public static boolean isChmem() {
		return chmem;
	}
	public static void setChmem(boolean chmem) {
		CurrInfo.chmem = chmem;
	}
}
