package com.internousdev.template.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

		public String getDate() {
				Date date = new Date();
				SimpleDateFormat simpleDatefolmat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

				return simpleDatefolmat.format(date);
		}

}
