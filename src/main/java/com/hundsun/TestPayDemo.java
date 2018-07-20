package com.hundsun;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

import com.utils.DES;
import com.utils.MD5;

public class TestPayDemo {

	public static String getXML() {
		String batchSeqID = "NO1FKTEST";// 批号，每批收付数据唯一
		String accOrg = "31030000";
		String applyDeptCode = "31000009";
		String attribute1 = "";// 业务渠道
		String attribute2 = "1";
		String attribute3 = "";// 对于理赔业务传输报案号，其它为空
		String attribute4 = "";//
		String attribute5 = "";//
		String attribute6 = "";//
		String attribute7 = "";//
		String attribute8 = "";//
		String bizRefCode = "BX18061411483";
		String categoryCode = "";// 一般用于对应现金流，预留字段，值为空
		String budgetItemCode = "";// 一般用于计划控制，预留字段，值为空
		String subCategoryCode = "";// 一般用于对应现金流，预留字段，值为空
		String bzType = "101";
		String cardFlag = "2";// 1:卡, 0:折 2其它

		String credentials = "";// 存放核心传递过来的证件名称
		
		String cvvCode = "";// 信用卡CVV码
		String validDate = "";//信用卡有效期
		String des = "测试";
		String detailSeqID = "FD2018061900011303";
		String phoneNum = "";
		String email = "";//
		String idCard = "";// 证件号码
		String insCode = "";// 保单号
		String memo = "测试";
		String moneyWay = "1";		 
//		byte[] noteMoneyEn = DES.encryptMode(("5").getBytes());
//		 noteMoney=noteMoneyEn.toString();
		String noteMoney="5";
		/////////////////////
		String payAccount = "100125374100000918";
		String payAccountName = "中国大地财产保险股份有限公司";
		String payBank = "";
		String payBankArea = "";
		String payBankLocation = "";
		String payCurrency = "";
		String payDate = "2012-11-05T16:38:30";
		String payEntityCode = "31030000";
		String payName = "中国大地财产保险股份有限公司";
		String payObjectType = "0";//付方都写0
		//////////////////////
		String recAccount = "12345465767677";
		String recAccountName = "魔方专用";
		String recBank = "中国农业发展银行";
		String recBankArea = "3606";
		String recBankLocation = "中国农业发展银行贵溪市支行";
		String recName = "魔方专用";
		String recObjectType = "individual";//company企业账户（小写）individual个人账户（小写）付款时必填
		String currency = "CNY";
		byte[] amounten = DES.encryptMode(("5").getBytes());//String key = "111111111111111111111111";
		String amount=amounten.toString();
		///////////////// ///////////////
		String verifyFieldLine=MD5.getMD5ofStr(String.valueOf(recAccount) + String.valueOf(5));
		String dsCode = "1.2";
		String urgent = "0";
		String useDes = "业务支付";		
		String vendorCode = "8000087985";
		String requestTime = "2012-11-05T16:38:30";
		String source = "12";
		String dealType = "9";
		int totalAmount = 5;
		int totalCount = 1;		
		
		String verifyField = MD5.getMD5ofStr(String.valueOf(totalAmount) + String.valueOf(totalCount));
		
		
		String XML = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ser=\"http://service.hundsun.com\" xmlns:dto=\"http://dto.hundsun.com\">"
				+ "<soapenv:Header/><soapenv:Body><ser:Pay><ser:in0>" //
				+ "<dto:batchSeqID>" + batchSeqID + "</dto:batchSeqID>"//
				+ "<dto:pd><dto:PayRequestDetail>" //
				+ "<dto:accOrg>" + accOrg + "</dto:accOrg>"//
				+ "<dto:amount>" + amount + "</dto:amount>" //
				+ "<dto:applyDeptCode>" + applyDeptCode + "</dto:applyDeptCode>" //
				+ "<dto:attribute1>" + attribute1 + "</dto:attribute1>" //
				+ "<dto:attribute2>" + attribute2 + "</dto:attribute2>" //
				+ "<dto:attribute3>" + attribute3 + "</dto:attribute3>" //
				+ "<dto:attribute4>" + attribute4 + "</dto:attribute4>" //
				+ "<dto:attribute5>" + attribute5 + "</dto:attribute5>" //
				+ "<dto:attribute6>" + attribute6 + "</dto:attribute6>" //
				+ "<dto:attribute7>" + attribute7 + "</dto:attribute7>" //
				+ "<dto:attribute8>" + attribute8 + "</dto:attribute8>" //
				+ "<dto:bizRefCode>" + bizRefCode + "</dto:bizRefCode>"//
				+ "<dto:budgetItemCode>" + budgetItemCode + "</dto:budgetItemCode>"//
				+ "<dto:bzType>" + bzType + "</dto:bzType>"//
				+ "<dto:cardFlag>" + cardFlag + "</dto:cardFlag>"//
				+ "<dto:categoryCode>" + categoryCode + "</dto:categoryCode>"//
				+ "<dto:credentials>" + credentials + "</dto:credentials>"//
				+ "<dto:currency>" + currency + "</dto:currency>"//
				+ "<dto:cvvCode>" + cvvCode + "</dto:cvvCode>"//
				+ "<dto:dealType>" + dealType + "</dto:dealType>"//
				+ "<dto:des>" + des + "</dto:des>" //
				+ "<dto:detailSeqID>" + detailSeqID + "</dto:detailSeqID>" //
				+ "<dto:dsCode>" + dsCode + "</dto:dsCode>"//
				+ "<dto:email>" + email + "</dto:email>"//
				+ "<dto:idCard>" + idCard + "</dto:idCard>" //
				+ "<dto:insCode>" + insCode + "</dto:insCode>"//
				+ "<dto:memo>" + memo + "</dto:memo>" //
				+ "<dto:moneyWay>" + moneyWay + "</dto:moneyWay>"//
				+ "<dto:noteMoney>" + noteMoney + "</dto:noteMoney>"//
				+ "<dto:payAccount>" + payAccount + "</dto:payAccount>"//
				+ "<dto:payAccountName>" + payAccountName + "</dto:payAccountName>"//
				+ "<dto:payBank>" + payBank + "</dto:payBank>"//
				+ "<dto:payBankArea>" + payBankArea + "</dto:payBankArea>"//
				+ "<dto:payBankLocation>" + payBankLocation + "</dto:payBankLocation>"//
				+ "<dto:payCurrency>" + payCurrency + "</dto:payCurrency>"//
				+ "<dto:payDate>" + payDate + "</dto:payDate>"//
				+ "<dto:payEntityCode>" + payEntityCode + "</dto:payEntityCode>"//
				+ "<dto:payName>" + payName + "</dto:payName>"//
				+ "<dto:payObjectType>" + payObjectType + "</dto:payObjectType>"//
				+ "<dto:phoneNum>" + phoneNum + "</dto:phoneNum>"//
				+ "<dto:recAccount>" + recAccount + "</dto:recAccount>"//
				+ "<dto:recAccountName>" + recAccountName + "</dto:recAccountName>" //
				+ "<dto:recBank>" + recBank + "</dto:recBank>" //
				+ "<dto:recBankArea>" + recBankArea + "</dto:recBankArea>"//
				+ "<dto:recBankLocation>" + recBankLocation + "</dto:recBankLocation>"//
				+ "<dto:recName>" + recName + "</dto:recName>"//
				+ "<dto:recObjectType>" + recObjectType + "</dto:recObjectType>"//
				+ "<dto:subCategoryCode>" + subCategoryCode + "</dto:subCategoryCode>"//
				+ "<dto:urgent>" + urgent + "</dto:urgent>"//
				+ "<dto:useDes>" + useDes + "</dto:useDes>"//
				+ "<dto:validDate>" + validDate + "</dto:validDate>"//
				+ "<dto:vendorCode>" + vendorCode + "</dto:vendorCode>"//
				+ "<dto:verifyField>" + verifyFieldLine + "</dto:verifyField>"//
				+ "</dto:PayRequestDetail></dto:pd>" //
				+ "<dto:requestTime>" + requestTime + "</dto:requestTime>"//
				+ "<dto:source>" + source + "</dto:source>" //
				+ "<dto:totalAmount>" + totalAmount + "</dto:totalAmount>" //
				+ "<dto:totalCount>" + totalCount + "</dto:totalCount>"//
				+ "<dto:verifyField>" + verifyField + "</dto:verifyField> "//
				+ "</ser:in0></ser:Pay></soapenv:Body></soapenv:Envelope>";
		System.out.println(XML);
		return XML;
	}

	public static void SendFundToPayInfo() throws IOException {

		URL url = new URL("http://10.1.13.146:30014/service/fundpay.ws");
		URLConnection conn = url.openConnection();

		HttpURLConnection con = (HttpURLConnection) conn;
		con.setDoInput(true); // 是否有入参

		con.setDoOutput(true); // 是否有出参

		con.setRequestMethod("POST"); // 设置请求方式

		con.setRequestProperty("content-type", "text/xml;charset=UTF-8");

		String requestBody = getXML();

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
