package service;

import java.util.Set;

import dao.ImobileDao;
import entities.Mobile;
import exceptions.IncorrectNoException;

public class MobileServiceImpl implements ImobileService {
	private ImobileDao dao;
	@Override
	public ImobileDao getMobileDao()
	{
		return dao;
	}
    public MobileServiceImpl(ImobileDao dao) {
		this.dao = dao;
	}

@Override

	public void addMobile(Mobile e) {
    dao.addMobile(e);
	}

	@Override
    public Mobile findBymobno(String mobileno){
        if (mobileno==null||mobileno.length()!=10 ) {
            throw new IncorrectNoException("Number is incorrect");
        }
        Mobile e = dao.findBymobno(mobileno);
        return e;
    }

	@Override
	public Set<Mobile> allMobiles() {
		Set<Mobile> mobiles = dao.allMobiles();
		return mobiles;
	}

	@Override
	public Mobile rechargeAmount(String str1, String name, double amount) {
		Mobile r=dao.rechargeAmount(str1,name, amount);
		return r;
	}
	}


	




