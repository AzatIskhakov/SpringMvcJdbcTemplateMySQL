package com.airplanes.spring;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.airplanes.dao.AirplaneDao;
import com.airplanes.model.Airplane;

@Controller
public class AirplaneController {
	
	final Logger logger = LoggerFactory.getLogger(AirplaneController.class);
	
	@Autowired
	AirplaneDao airplaneDao;
	
	@RequestMapping(value="/viewAirplanes", method=RequestMethod.GET)
	public ModelAndView listOfAirplanes() {
		
		logger.info("Listing airplanes");
		
		List<Airplane> list = airplaneDao.getAllAirplanes();
		
		return new ModelAndView("viewAirplanes", "list", list);
	}

}
