package com.udr013.localization;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class FormatDates {
	// DEFAULT = MEDIUM // DateFormat.FULL = 0 DateFormat.LONG = 1 , DateFormat.MEDIUM = 2,
	// DateFormat.SHORT = 3
	private static int[] styles = new int[] { DateFormat.FULL, DateFormat.LONG, DateFormat.MEDIUM, DateFormat.SHORT };
	private static String[] styleName = new String[] { "FULL", "LONG", "MEDIUM", "SHORT" };
	private static Locale[] locales = new Locale[] { Locale.ROOT, Locale.US, Locale.GERMANY, Locale.FRANCE,
			Locale.JAPAN, Locale.UK };

	public static void main(String[] args) {
		Date date = new Date();

		for (Locale locale : locales) {
			specificLocale(locale, date);
		}
	}

	private static void specificLocale(Locale locale, Date date) {
		p("\nSpecific Locale :" + locale.getDisplayCountry());
		for (int style : styles) {
			DateFormat specificDate = DateFormat.getDateInstance(style, locale);
			p(styleName[style] + ": " + specificDate.format(date));

		}
	}

	static void p(String s) {
		System.out.println(s);
	}
}
