package utils;

import java.io.IOException;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.methods.GetMethod;

public class HttpUtil {

	/**
	 * HTTP GET请求
	 * 
	 * @param url
	 * @return
	 */
	public static String Get(String url) {
		String response = null;
		HttpClient http = new HttpClient();
		try {
			GetMethod get = new GetMethod(url);
			http.executeMethod(get);
			byte[] data = get.getResponseBody();
			response = new String(data, "gb2312");
		} catch (HttpException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return response;

	}
}
