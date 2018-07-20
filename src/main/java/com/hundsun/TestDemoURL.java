package com.hundsun;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

 

public class TestDemoURL {
	
 

	public static void SendFundToPayInfo() throws IOException {

		URL url = new URL("http://10.1.13.146:30014/service/fundquery.ws");
		URLConnection conn = url.openConnection();

		HttpURLConnection con = (HttpURLConnection) conn;
		con.setDoInput(true); // 是否有入参

		con.setDoOutput(true); // 是否有出参

		con.setRequestMethod("POST"); // 设置请求方式

		con.setRequestProperty("content-type", "text/xml;charset=UTF-8");

		String requestBody = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" "
				+ "xmlns:ser=\"http://service.hundsun.com\" xmlns:dto=\"http://dto.hundsun.com\">"
				+ "<soapenv:Header/><soapenv:Body><ser:QueryPay><ser:in0><dto:bzType>101</dto:bzType><dto:detailSeqID>"
				+ "<ser:string>EC11201000018050011</ser:string></dto:detailSeqID>"
                + "<dto:totalCount>1</dto:totalCount></ser:in0></ser:QueryPay></soapenv:Body></soapenv:Envelope>";

		OutputStream out = con.getOutputStream();

		out.write(requestBody.getBytes());

		out.close();

		int code = con.getResponseCode();

		if (code == 200) {// 服务端返回正常

			InputStream is = con.getInputStream();

			byte[] b = new byte[1024];

			StringBuffer sb = new StringBuffer();

			int len = 0;

			while ((len = is.read(b)) != -1) {

				String str = new String(b, 0, len, "UTF-8");

				sb.append(str);

			}
			System.out.println("+++++++++++++++++++++++++++++++++++");
			System.out.println(sb.toString());

			is.close();

		}

		con.disconnect();

	}

	public static void main(String[] agrs) {
		try {
			SendFundToPayInfo();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
