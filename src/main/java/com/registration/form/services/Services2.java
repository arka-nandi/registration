package com.registration.form.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registration.form.model.OnlineForm;
import com.registration.form.repository.UserRepo;

//import com.registration.form.model.OnlineForm;

@Service
public class Services2 {
	@Autowired
	UserRepo repo;
	@Autowired 
	Optional<OnlineForm> of1;
	
	
	public boolean checkEmail(OnlineForm of) {
		String mail=of.getEmail();
		of1=repo.findByEmail(mail);
		if(of1.isPresent())
			return true;
		else
			return false;
		
	}
	public String dateChange(String date)
	{
		char[] ch=new char[9];
		ch[0]=date.charAt(2);
		ch[1]=date.charAt(3);
		ch[2]=date.charAt(4);
		ch[3]=date.charAt(5);
		ch[4]=date.charAt(6);
		String s="";
		if(ch[3]=='0' && ch[4]=='1')
			s="JAN";
		else if(ch[3]=='0' && ch[4]=='2')
			s="FEB";
		else if(ch[3]=='0' && ch[4]=='3')
			s="MAR";
		else if(ch[3]=='0' && ch[4]=='4')
			s="APR";
		else if(ch[3]=='0' && ch[4]=='5')
			s="MAY";
		else if(ch[3]=='0' && ch[4]=='6')
			s="JUN";
		else if(ch[3]=='0' && ch[4]=='7')
			s="JUL";
		else if(ch[3]=='0' && ch[4]=='8')
			s="AUG";
		else if(ch[3]=='0' && ch[4]=='9')
			s="SEP";
		else if(ch[3]=='1' && ch[4]=='0')
			s="OCT";
		else if(ch[3]=='1' && ch[4]=='1')
			s="NOV";
		else 
			s="DEC";
		ch[3]=s.charAt(0);
		ch[4]=s.charAt(1);
		ch[5]=s.charAt(2);
		ch[6]=date.charAt(7);
		ch[7]=date.charAt(8);
		ch[8]=date.charAt(9);
		String newDate=String.valueOf(ch);
		return newDate;		
		
		
	}
}
