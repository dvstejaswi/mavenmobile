package service;
import dao.MobileDaoImpl;
import entities.Mobile;
import service.MobileServiceImpl;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
public class AccountServiceImplTest {

	@Test
	public void testCreateAccount_1() {
		MobileServiceImpl service= new MobileServiceImpl(new MobileDaoImpl() );
		String mobileNo= "9876543210";
		double balance=1000;
		String name="ravi";
		//String accounttype="prepaid";
		//Mobile mobile= service.addMobile(mobileNo,balance,name,accounttype);
		Mobile m1=new Mobile(mobileNo,name,balance);
		service.addMobile(m1);
		//Assert.assertNotNull(mobile);
		//double resultBalance=mobile.getBalance();
		//Assert.assertEquals(balance, resultBalance,0);
		//Assert.assertEquals(name, mobile.getName());
		Map<String,Mobile>store=service.getMobileDao().getStore();
		Mobile expected =store.get(mobileNo);
		Assert.assertNotNull(expected);
		Assert.assertEquals(expected,m1);
	//Mobile f3=service.rechargeAmount(mobno, name, balance);
	//double balance=f3.getBalance();
	//Assert.assert
	}
	

}
