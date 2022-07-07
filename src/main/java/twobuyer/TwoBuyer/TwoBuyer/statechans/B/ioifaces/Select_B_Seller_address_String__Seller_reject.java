package twobuyer.TwoBuyer.TwoBuyer.statechans.B.ioifaces;

import twobuyer.TwoBuyer.TwoBuyer.roles.*;
import twobuyer.TwoBuyer.TwoBuyer.statechans.B.*;

public interface Select_B_Seller_address_String__Seller_reject<__Succ1 extends Succ_Out_Seller_address_String, __Succ2 extends Succ_Out_Seller_reject> extends Out_Seller_address_String<__Succ1>, Out_Seller_reject<__Succ2>, Succ_In_A_aShare_int {
	public static final Select_B_Seller_address_String__Seller_reject<?, ?> cast = null;

	@Override
	default Select_B_Seller_address_String__Seller_reject<?, ?> to(Select_B_Seller_address_String__Seller_reject<?, ?> cast) {
		return (Select_B_Seller_address_String__Seller_reject<?, ?>) this;
	}

	default TwoBuyer_B_3 to(TwoBuyer_B_3 cast) {
		return (TwoBuyer_B_3) this;
	}
}