package com.amc.ebg.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Encrypter {

    private static final Logger logger = LoggerFactory.getLogger(Encrypter.class);

    public static String convertToMD5(final String value) {
        logger.debug("public static String convertToMD5(final String value)");
        StringBuffer hexString = new StringBuffer();

        String convertValue = (value == null ? "" : value);

        if (convertValue.isEmpty()) {
            return "";
        } else {
            MessageDigest algorithm = null;
            try {
                algorithm = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException nsae) {

            }
            byte[] defaultBytes = convertValue.getBytes();
            algorithm.reset();
            algorithm.update(defaultBytes);
            byte messageDigest[] = algorithm.digest();

            for (int i = 0; i < messageDigest.length; i++) {
                String hex = Integer.toHexString(0xff & messageDigest[i]);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
        }
        return hexString.toString();
    }
}
