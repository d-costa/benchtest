package twobuyer.TwoBuyer.TwoBuyer.statechans.Seller.ioifaces;

import twobuyer.TwoBuyer.TwoBuyer.roles.*;
import twobuyer.TwoBuyer.TwoBuyer.statechans.Seller.*;

public interface Select_Seller_B_price_int<__Succ1 extends Succ_Out_B_price_int> extends Out_B_price_int<__Succ1>, Succ_Out_A_price_int {
	public static final Select_Seller_B_price_int<?> cast = null;

	@Override
	default Select_Seller_B_price_int<?> to(Select_Seller_B_price_int<?> cast) {
		return (Select_Seller_B_price_int<?>) this;
	}

	default TwoBuyer_Seller_3 to(TwoBuyer_Seller_3 cast) {
		return (TwoBuyer_Seller_3) this;
	}
}