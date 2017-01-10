package cn.Ares.utils;

import java.security.MessageDigest;

import org.apache.tomcat.util.codec.binary.Base64;


public class Encypt {
	public static String md5(String src){
		try {
			MessageDigest md=MessageDigest.getInstance("MD5");
			//MD5加密处理
			byte[] output=md.digest(src.getBytes());
			//base64处理     字节转换字符串输出。（a-z）(A-Z)(0-9)(+=)
			String ret=Base64.encodeBase64String(output);
			return new String(ret);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ChatException("密码加密失败",e);
		}
	}

}
