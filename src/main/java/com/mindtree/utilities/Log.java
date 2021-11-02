package com.mindtree.utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.FileAppender;


public class Log extends FileAppender{

	@Override
	public void setFile(String file) {
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd__hh-mm-ss");
		
		file = file.replaceAll("%pattern", format.format(date));
		
		super.setFile(file);
	}
	
	}
