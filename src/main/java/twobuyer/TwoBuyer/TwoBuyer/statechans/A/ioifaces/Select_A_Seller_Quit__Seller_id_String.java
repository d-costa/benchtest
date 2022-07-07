package twobuyer.TwoBuyer.TwoBuyer.statechans.A.ioifaces;

import twobuyer.TwoBuyer.TwoBuyer.roles.*;
import twobuyer.TwoBuyer.TwoBuyer.statechans.A.*;

public interface Select_A_Seller_Quit__Seller_id_String<__Succ1 extends Succ_Out_Seller_Quit, __Succ2 extends Succ_Out_Seller_id_String> extends Out_Seller_Quit<__Succ1>, Out_Seller_id_String<__Succ2>, Succ_In_B_date_Date, Succ_In_B_reject {
	public static final Select_A_Seller_Quit__Seller_id_String<?, ?> cast = null;

	@Override
	default Select_A_Seller_Quit__Seller_id_String<?, ?> to(Select_A_Seller_Quit__Seller_id_String<?, ?> cast) {
		return (Select_A_Seller_Quit__Seller_id_String<?, ?>) this;
	}

	default TwoBuyer_A_1 to(TwoBuyer_A_1 cast) {
		return (TwoBuyer_A_1) this;
	}
}