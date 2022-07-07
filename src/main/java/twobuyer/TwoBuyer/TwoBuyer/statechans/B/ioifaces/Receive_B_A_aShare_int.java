package twobuyer.TwoBuyer.TwoBuyer.statechans.B.ioifaces;

import twobuyer.TwoBuyer.TwoBuyer.roles.*;
import twobuyer.TwoBuyer.TwoBuyer.ops.*;
import twobuyer.TwoBuyer.TwoBuyer.statechans.B.*;

public interface Receive_B_A_aShare_int<__Succ1 extends Succ_In_A_aShare_int> extends In_A_aShare_int<__Succ1>, Succ_In_Seller_price_int {
	public static final Receive_B_A_aShare_int<?> cast = null;

	abstract public __Succ1 async(A role, aShare op) throws org.scribble.main.ScribRuntimeException;

	@Override
	default Receive_B_A_aShare_int<?> to(Receive_B_A_aShare_int<?> cast) {
		return (Receive_B_A_aShare_int<?>) this;
	}

	default TwoBuyer_B_2 to(TwoBuyer_B_2 cast) {
		return (TwoBuyer_B_2) this;
	}
}