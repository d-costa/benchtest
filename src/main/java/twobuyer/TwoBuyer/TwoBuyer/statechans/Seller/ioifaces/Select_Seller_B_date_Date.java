package twobuyer.TwoBuyer.TwoBuyer.statechans.Seller.ioifaces;

import twobuyer.TwoBuyer.TwoBuyer.roles.*;
import twobuyer.TwoBuyer.TwoBuyer.statechans.Seller.*;

public interface Select_Seller_B_date_Date<__Succ1 extends Succ_Out_B_date_Date> extends Out_B_date_Date<__Succ1>, Succ_In_B_address_String {
	public static final Select_Seller_B_date_Date<?> cast = null;

	@Override
	default Select_Seller_B_date_Date<?> to(Select_Seller_B_date_Date<?> cast) {
		return (Select_Seller_B_date_Date<?>) this;
	}

	default TwoBuyer_Seller_5 to(TwoBuyer_Seller_5 cast) {
		return (TwoBuyer_Seller_5) this;
	}
}