package twobuyer.TwoBuyer.TwoBuyer.statechans.B.ioifaces;

import twobuyer.TwoBuyer.TwoBuyer.roles.*;
import twobuyer.TwoBuyer.TwoBuyer.statechans.B.*;

public interface Select_B_A_reject<__Succ1 extends Succ_Out_A_reject> extends Out_A_reject<__Succ1>, Succ_Out_Seller_reject {
	public static final Select_B_A_reject<?> cast = null;

	@Override
	default Select_B_A_reject<?> to(Select_B_A_reject<?> cast) {
		return (Select_B_A_reject<?>) this;
	}

	default TwoBuyer_B_6 to(TwoBuyer_B_6 cast) {
		return (TwoBuyer_B_6) this;
	}
}