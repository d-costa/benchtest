package twobuyer.TwoBuyer.TwoBuyer.statechans.Seller.ioifaces;

import twobuyer.TwoBuyer.TwoBuyer.roles.*;
import twobuyer.TwoBuyer.TwoBuyer.statechans.Seller.*;

public interface Select_Seller_B_Quit<__Succ1 extends Succ_Out_B_Quit> extends Out_B_Quit<__Succ1>, Succ_In_A_Quit {
	public static final Select_Seller_B_Quit<?> cast = null;

	@Override
	default Select_Seller_B_Quit<?> to(Select_Seller_B_Quit<?> cast) {
		return (Select_Seller_B_Quit<?>) this;
	}

	default TwoBuyer_Seller_6 to(TwoBuyer_Seller_6 cast) {
		return (TwoBuyer_Seller_6) this;
	}
}