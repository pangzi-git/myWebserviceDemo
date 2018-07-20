package com.databus.testpackage;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.ccic.databus.client.publish.DataBusPublishClient;
import com.ccic.databus.common.exception.DataBusException;

public class testDemoDataBus {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Date date = new Date();
		SimpleDateFormat f = new SimpleDateFormat("yyyyMMddHHmmss");
		String dataBusBatchId = f.format((date));

		System.out.println(dataBusBatchId + "begin");

		DataBusPublishClient client = null;

		System.out.println(dataBusBatchId + "------get data begin-------");
		// 按来源号处理 控制100单
		String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" 
		        + "<ExpenseClaimsStatusUpdate>"
				+ "<Provider>marketing</Provider>"
				+ "<ExpenseClaimsStatusList><SourceDocNo>A32010005000</SourceDocNo><SourceDocLineNo>1</SourceDocLineNo>"
				+ "<ExpenseNo>EJE3201000020180700001</ExpenseNo><PublicPrivate>PRIVATE</PublicPrivate>"
				+ "<TaxFee>0</TaxFee><AsSalesFlag>0</AsSalesFlag><ExpenseStatus>3</ExpenseStatus><ErrMessage>null</ErrMessage>"
				+ "<ExpenseUpdateTime>2018-07-06 18:45:02.0</ExpenseUpdateTime></ExpenseClaimsStatusList></ExpenseClaimsStatusUpdate>";

		String queueUrl = "mongodb://10.1.13.50:27017/databus_v5real";
		String dataName = "DataBus_CostControl_ExpenseClaimsStatusUpdate";
		String source = "hec";
		String databus_batch_number = "T1111";
		String messageBody = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><ExpenseClaimsStatusUpdate></ExpenseClaimsStatusUpdate>";
		Integer totalCount = 0;

		System.out.println(dataBusBatchId + "------send messageBody-------" + messageBody);
		// 调用databus
		client = new DataBusPublishClient(queueUrl, null, null);
		try {
			client.send(dataName, source, databus_batch_number, xml);
		} catch (DataBusException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 推送
			// 调用databus完成
		System.out.println(dataBusBatchId + "------send end-------totalCount " + totalCount);
		System.out.println(dataBusBatchId + "------send end-------totalCount " + totalCount);
	}
}
