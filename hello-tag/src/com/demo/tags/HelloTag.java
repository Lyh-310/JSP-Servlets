package com.demo.tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class HelloTag extends TagSupport {
	
	public int doStartTag() throws JspException {  
        JspWriter out=pageContext.getOut();//returns the instance of JspWriter  
        try{  
         //out.print(Calendar.getInstance().getTime());//printing date and time using JspWriter  
        	out.print("It is snow day today!");
        }catch(Exception e){System.out.println(e);}  
        return SKIP_BODY;//will not evaluate the body content of the tag  
    }  

}
