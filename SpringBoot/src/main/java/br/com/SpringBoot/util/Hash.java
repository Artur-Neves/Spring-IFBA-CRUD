package br.com.SpringBoot.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

// TODO: Auto-generated Javadoc
/**
 * The Class Hash.
 */
public class Hash {

/**
 * Md 5.
 *
 * @param senha the senha
 * @return the string
 * @throws NoSuchAlgorithmException the no such algorithm exception
 */
public static String md5(String senha) throws NoSuchAlgorithmException{
MessageDigest mesagedig = MessageDigest.getInstance("MD5");
BigInteger hash = new BigInteger(1, mesagedig.digest(senha.getBytes()));
return hash.toString(16);

}
}
