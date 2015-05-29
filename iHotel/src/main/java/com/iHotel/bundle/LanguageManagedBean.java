package com.iHotel.bundle;

import java.util.Locale;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

import java.io.Serializable;

@ManagedBean
@SessionScoped
public class LanguageManagedBean implements Serializable {
	private static final long serialVersionUID = 4623156212052563115L;
	
	public static String EN = "en";
	public static String MS_MY = "ms_my";
	
	private String localeCode;
	private Locale locale;
	

	public LanguageManagedBean() {
		localeCode = EN;
		locale = new Locale(localeCode);
	}

	public void languageChangeListener(ValueChangeEvent event) {
		FacesContext facesContext = FacesContext.getCurrentInstance();
		String localeString = event.getNewValue().toString();
		locale = new Locale(localeString);
		
		facesContext.getViewRoot().setLocale(locale);
	}

	public Locale getLocale() {
		return locale;
	}

	public void setLocale(Locale locale) {
		this.locale = locale;
	}

	public String getLocaleCode() {
		return localeCode;
	}

	public void setLocaleCode(String localeCode) {
		this.localeCode = localeCode;
	}
	
	
}
