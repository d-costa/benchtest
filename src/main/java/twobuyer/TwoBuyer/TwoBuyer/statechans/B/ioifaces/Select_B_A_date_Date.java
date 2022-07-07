package twobuyer.TwoBuyer.TwoBuyer.statechans.B.ioifaces;

import twobuyer.TwoBuyer.TwoBuyer.roles.*;
import twobuyer.TwoBuyer.TwoBuyer.statechans.B.*;

public interface Select_B_A_date_Date<__Succ1 extends Succ_Out_A_date_Date> extends Out_A_date_Date<__Succ1>, Succ_In_Seller_date_Date {
	public static final Select_B_A_date_Date<?> cast = null;

	@Override
	default Select_B_A_date_Date<?> to(Select_B_A_date_Date<?> cast) {
		return (Select_B_A_date_Date<?>) this;
	}

	default TwoBuyer_B_5 to(TwoBuyer_B_5 cast) {
		return (TwoBuyer_B_5) this;
	}
}