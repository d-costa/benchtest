package twobuyer.TwoBuyer.TwoBuyer.statechans.A.ioifaces;

import twobuyer.TwoBuyer.TwoBuyer.roles.*;
import twobuyer.TwoBuyer.TwoBuyer.statechans.A.*;

public interface Select_A_B_aShare_int<__Succ1 extends Succ_Out_B_aShare_int> extends Out_B_aShare_int<__Succ1>, Succ_In_Seller_price_int {
	public static final Select_A_B_aShare_int<?> cast = null;

	@Override
	default Select_A_B_aShare_int<?> to(Select_A_B_aShare_int<?> cast) {
		return (Select_A_B_aShare_int<?>) this;
	}

	default TwoBuyer_A_3 to(TwoBuyer_A_3 cast) {
		return (TwoBuyer_A_3) this;
	}
}