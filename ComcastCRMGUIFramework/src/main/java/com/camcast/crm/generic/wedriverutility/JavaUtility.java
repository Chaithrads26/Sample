 package com.camcast.crm.generic.wedriverutility;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
public int getRandomNumber()
{
	Random ranDom=new Random();
	int randomNumber=ranDom.nextInt(5000);
	return randomNumber;
}
	public String getSystemDateYYYYMMDD()
	{
		Date dateObj=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		String date=sdf.format(dateObj);
		return date;
		}
	public String getRequiredDateYYYYMMDD(int days)
	{
		Date dateObj=new Date();
		
		SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd");
		String date=sim.format(dateObj);
		Calendar cal = sim.getCalendar();  
	     cal.add(Calendar.DAY_OF_MONTH,days);
	     String reqDate = sim.format(cal.getTime());
	     return reqDate;
	}
	}


