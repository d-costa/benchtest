package twobuyer.TwoBuyer.TwoBuyer.statechans.Seller.ioifaces;

import twobuyer.TwoBuyer.TwoBuyer.roles.*;
import twobuyer.TwoBuyer.TwoBuyer.statechans.Seller.*;

public interface Select_Seller_A_price_int<__Succ1 extends Succ_Out_A_price_int> extends Out_A_price_int<__Succ1>, Succ_In_A_id_String {
	public static final Select_Seller_A_price_int<?> cast = null;

	@Override
	default Select_Seller_A_price_int<?> to(Select_Seller_A_price_int<?> cast) {
		return (Select_Seller_A_price_int<?>) this;
	}

	default TwoBuyer_Seller_2 to(TwoBuyer_Seller_2 cast) {
		return (TwoBuyer_Seller_2) this;
	}
}