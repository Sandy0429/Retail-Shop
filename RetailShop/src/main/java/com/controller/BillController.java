package com.controller;

import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.model.Order;
import com.service.BillService;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.RequestMethod;
 import org.springframework.validation.Validator;

 
//use appropriate annotation to configure BillController as Controller

@Controller
public class BillController {
	
	@Autowired
	private BillService billService;
	
	@RequestMapping(value="/showPage",method=RequestMethod.GET)
	    	public String showPage(@ModelAttribute("order") Order order)
	    	{
	    	    return "showpage";
	    	}

	
	//invoke the service class - calculateTotalCost method.
	@RequestMapping(value="/billDesk",method=RequestMethod.POST)
	public String calculateTotalCost(@ModelAttribute("order") @Valid Order order, 
			BindingResult result,ModelMap model) {
		//fill the code
		if(result.hasErrors())
		{
			return "showpage";
		}
		else
		{
			String customerName=order.getCustomerName();
			String displayType= order.getDisplayType();
			String brandName=order.getBrandName();
			double totalCost = billService.calculateTotalCost(order);

			    		    model.put("customerName",customerName);
			    		    model.put("displayType", displayType);
			    		    model.put("brandName", brandName);
			    		    model.put("totalCost",totalCost);
			   return "billdesk";

		}
		
		
	}
	
	@ModelAttribute("brandList")
	public List<String> populateBrandName()
	{
		List<String> brandList= new ArrayList<>();
		brandList.add("LG");
		brandList.add("MI");
		brandList.add("Samsung");
		brandList.add("Micromax");
		brandList.add("Sony");
		return brandList;
		
	}
	
	@ModelAttribute("displayList")
	public List<String> populateDisplayType()
	{
		List<String> displayList= new ArrayList<>();
		displayList.add("QLED");
		displayList.add("OLED");
		displayList.add("LED");
		displayList.add("LCD");
		displayList.add("Plasma");
		return displayList;
		
	}
	
	

}
