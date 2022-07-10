package com.service;

import com.model.Order;

 import org.springframework.stereotype.Service;

//use appropriate annotation to configure BillService as a Service
@Service
 public class BillService {
	
	//calculate the totalCost and return the cost
	public double calculateTotalCost(Order order) {
		double cost=0.0;
		//fill the code
		if(order.getDisplayType().equals("QLED"))
		{
			if(order.getBrandName().equals("LG"))
			{
				double price =13000.0;
				cost =price+(price*12.0)/100.0;
			}
			else if(order.getBrandName().equals("Micromax"))
			{
				double price =9000.0;
				cost =price+(price*12.0)/100.0;
			}
			else if(order.getBrandName().equals("Samsung"))
			{
				double price =15000.0;
				cost =price+(price*12.0)/100.0;
			}
			else if(order.getBrandName().equals("MI"))
			{
				double price =10000.0;
				cost =price+(price*12.0)/100.0;
			}
			else if(order.getBrandName().equals("Sony"))
			{
				double price =16000.0;
				cost =price+(price*12.0)/100.0;
			}
		}
		else if(order.getDisplayType().equals("OLED"))
		{
			if(order.getBrandName().equals("LG"))
			{
				double price =15000.0;
				cost =price+(price*12.0)/100.0;
			}
			else if(order.getBrandName().equals("Micromax"))
			{
				double price =11000.0;
				cost =price+(price*12.0)/100.0;
			}
			else if(order.getBrandName().equals("Samsung"))
			{
				double price =17000.0;
				cost =price+(price*12.0)/100.0;
			}
			else if(order.getBrandName().equals("MI"))
			{
				double price =12000.0;
				cost =price+(price*12.0)/100.0;
			}
			else if(order.getBrandName().equals("Sony"))
			{
				double price =18000.0;
				cost =price+(price*12.0)/100.0;
			}
			
		}
		else if(order.getDisplayType().equals("LED"))
		{
			if(order.getBrandName().equals("LG"))
			{
				double price =17000.0;
				cost =price+(price*12.0)/100.0;
			}
			else if(order.getBrandName().equals("Micromax"))
			{
				double price =13000.0;
				cost =price+(price*12.0)/100.0;
			}
			else if(order.getBrandName().equals("Samsung"))
			{
				double price =19000.0;
				cost =price+(price*12.0)/100.0;
			}
			else if(order.getBrandName().equals("MI"))
			{
				double price =14000.0;
				cost =price+(price*12.0)/100.0;
			}
			else if(order.getBrandName().equals("Sony"))
			{
				double price =20000.0;
				cost =price+(price*12.0)/100.0;
			}
		}
		else if(order.getDisplayType().equals("LCD"))
		{
			if(order.getBrandName().equals("LG"))
			{
				double price =19000.0;
				cost =price+(price*12.0)/100.0;
			}
			else if(order.getBrandName().equals("Micromax"))
			{
				double price =15000.0;
				cost =price+(price*12.0)/100.0;
			}
			else if(order.getBrandName().equals("Samsung"))
			{
				double price =21000.0;
				cost =price+(price*12.0)/100.0;
			}
			else if(order.getBrandName().equals("MI"))
			{
				double price =16000.0;
				cost =price+(price*12.0)/100.0;
			}
			else if(order.getBrandName().equals("Sony"))
			{
				double price =22000.0;
				cost =price+(price*12.0)/100.0;
			}
		}
		else if(order.getDisplayType().equals("Plasma"))
		{
			if(order.getBrandName().equals("LG"))
			{
				double price =21000.0;
				cost =price+(price*12.0)/100.0;
			}
			else if(order.getBrandName().equals("Micromax"))
			{
				double price =17000.0;
				cost =price+(price*12.0)/100.0;
			}
			else if(order.getBrandName().equals("Samsung"))
			{
				double price =23000.0;
				cost =price+(price*12.0)/100.0;
			}
			else if(order.getBrandName().equals("MI"))
			{
				double price =18000.0;
				cost =price+(price*12.0)/100.0;
			}
			else if(order.getBrandName().equals("Sony"))
			{
				double price =24000.0;
				cost =price+(price*12.0)/100.0;
			}
		}
		
		
		return cost;
	}

}
