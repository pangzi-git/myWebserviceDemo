package com.hundsun;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.apache.axis.message.SOAPBodyElement;
import org.apache.axis.utils.XMLUtils;

import com.hundsun.dto.ObjectFactory;
import com.hundsun.dto.QueryPayRequest;
import com.hundsun.dto.QueryPayResponse;
import com.hundsun.service.ArrayOfString;
import com.hundsun.service.FundQueryServicePortType;
import com.hundsun.service.QueryPay;

 

public class TestDemo {
	
 

	public static void Test1() {
//		try {
//			/**
//			 * 调用接口获得返回字符串
//			 */
//			// 创建调用对象
//			Service service = new Service();
//			Call call = (Call) service.createCall();
//
//			// 命名空间
//			QName qName = new QName("http://service.hundsun.com", "QueryPay");
//
//			// 调用callService
//			call.setTargetEndpointAddress(new java.net.URL("http://10.1.13.146:30014/service/fundquery.ws")); // 注意后面必须不能加上"?wsdl"
//			call.setOperationName(qName); // 调用的方法名
//			// call.setProperty(Call.OPERATION_STYLE_PROPERTY,Style.DOCUMENT.getName());
//			// call.setProperty(Call.SOAPACTION_USE_PROPERTY,new Boolean(true));
//			call.setProperty(Call.USERNAME_PROPERTY, "username");
//			call.setProperty(Call.PASSWORD_PROPERTY, "password");
//			
//            // Vector result = (Vector) call.invoke(o);
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}

	// 发送xml,根据接口描述组织内容
	private static SOAPBodyElement[] getXml() {
		SOAPBodyElement[] input = new SOAPBodyElement[2];
		input[0] = new SOAPBodyElement(XMLUtils.StringToElement("http://service.hundsun.com", "QueryPay", "1|1|1|1"));

		return input;
	}

	public static void main(String[] agrs) {

		//Test1();
		testMain();
		
 

	}
	
/*wsimport -s D:\ -keep -verbose  http://10.1.13.146:30014/service/fundquery.ws?wsdl -extension
* wsimport -s D:\ -keep -verbose  D:\webService\fundquery.xml -extension
* C:\Program Files\Java\jdk1.8.0_171\bin> 
*  
*  
*  
*/
	
	public static void   testMain(){
		try {
			/**
			 * 调用接口获得返回字符串
			 */
			// 创建调用对象
		 
			URL url = new URL("http://10.1.13.146:30014/service/fundquery.ws?wsdl");  
			QName qName = new QName("http://service.hundsun.com", "FundQueryService");
			Service service = Service.create(url, qName);  
			
			FundQueryServicePortType fundQueryServicePortType = service.getPort(FundQueryServicePortType.class); 
			QueryPayResponse r= fundQueryServicePortType.queryPay(getQueryPay());
            System.out.println(r.getTotalAmount());
 

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	public static  QueryPayRequest getQueryPay(){
		
		ObjectFactory objFac=new ObjectFactory();  
		JAXBElement<String> bzType = objFac.createQueryPayRequestBzType("101"); 
		List<String> s1=new ArrayList<String>(); 
		s1.add("111111");
		ArrayOfString arrayOfString=new ArrayOfString() ;
		arrayOfString.setString(s1);
		JAXBElement<ArrayOfString> detailSeqID=objFac.createQueryPayRequestDetailSeqID(arrayOfString);
	 
		QueryPayRequest queryPayRequest=new QueryPayRequest();
		queryPayRequest.setBzType(bzType);
		queryPayRequest.setDetailSeqID(detailSeqID);
		queryPayRequest.setTotalCount(1);		
		return queryPayRequest;
		
	}

}
