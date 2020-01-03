package dao;
import java.util.*;

import entities.Mobile;
import exceptions.NumberNotFound;


public class MobileDaoImpl implements ImobileDao {
	private Map<String, Mobile> store=new HashMap<String, Mobile>();
@Override
public Map<String, Mobile> getStore(){
	return store;
}
	 @Override
	    public void addMobile(Mobile m) {
	     store.put(m.getMobileNo(), m);
	    }

	    @Override
	    public Mobile findBymobno(String mobileno) {
	        Mobile m = store.get(mobileno);
	        if (m == null) {
	            throw new NumberNotFound("Account not found for mobile no=" +mobileno);
	        }
	        return m;
	    }

	    @Override
	    public Set<Mobile> allMobiles() {
	        Collection<Mobile> mobiles = store.values();
	        Set<Mobile> MobileSet = new HashSet<>(mobiles);
	        return MobileSet;
	    }

		@Override
		public Mobile rechargeAmount(String str1, String name, double amount) {
			System.out.println("Enter the recharge amount:");
			Scanner t=new Scanner(System.in);
			double rechamt=t.nextDouble();
			double newbal=rechamt+amount;
			Mobile w9 = new Mobile(str1,name,newbal);
		//	double left=w9.getBalance();
			System.out.println(w9.getName());
			System.out.println(w9.getMobileNo());
			System.out.println("New Balance="+newbal);
			Mobile y=store.put(str1, w9 );
			return y;
		}
}



