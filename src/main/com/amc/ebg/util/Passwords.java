package com.amc.ebg.util;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang.StringUtils;

//import com.intel.ebs.agent.driver.util.StringUtil;

/**
 * Password generation utility.
 * @author Timoteo Ponce
 *
 */
public class Passwords {

	public static final String hash(String plainPassword){
		if(StringUtils.isNotBlank(plainPassword)){
			return DigestUtils.md5Hex(plainPassword).substring(0, 7);
		}
		return plainPassword;
	}
	
	public  static String getStringFromRightSide(final String token,final String line){
		int index=line.indexOf(token);
		String rightSide=line;
		if(index>=0){
			rightSide=line.substring(index+token.length(), line.length());
		}
		return rightSide;
		
	}
	public static String getStringFromLeftSide(final String token, final String line){
		int index=line.indexOf(token);
		String leftSide=line;
		if(index>=0){
			leftSide=line.substring(0, index);
		}
		
		return leftSide;
	}
	
	public static void main(String []args){
		String mmm="amcd@p@p";
		String token="@p";
		System.out.println(getStringFromRightSide(token, mmm));
		System.out.println(getStringFromLeftSide(token, mmm));
	}
}
