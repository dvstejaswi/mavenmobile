package dao;
import java.util.*;
import entities.Mobile;

public interface ImobileDao {
    Mobile findBymobno(String mobileno);

    Set<Mobile> allMobiles();

	void addMobile(Mobile w);

	Mobile rechargeAmount(String str1, String name, double amount);

	Map<String, Mobile> getStore();


}
