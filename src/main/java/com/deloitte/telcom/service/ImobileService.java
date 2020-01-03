package service;

import java.util.*;

import dao.ImobileDao;
import entities.Mobile;

public interface ImobileService {
	void addMobile(Mobile m);

	Mobile findBymobno(String name);

	Set<Mobile> allMobiles();

	Mobile rechargeAmount(String str1, String name, double amount);

	ImobileDao getMobileDao();



}
