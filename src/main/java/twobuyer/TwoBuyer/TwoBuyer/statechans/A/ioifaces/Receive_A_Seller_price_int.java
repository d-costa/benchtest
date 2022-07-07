package twobuyer.TwoBuyer.TwoBuyer.statechans.A.ioifaces;

import twobuyer.TwoBuyer.TwoBuyer.roles.*;
import twobuyer.TwoBuyer.TwoBuyer.ops.*;
import twobuyer.TwoBuyer.TwoBuyer.statechans.A.*;

public interface Receive_A_Seller_price_int<__Succ1 extends Succ_In_Seller_price_int> extends In_Seller_price_int<__Succ1>, Succ_Out_Seller_id_String {
	public static final Receive_A_Seller_price_int<?> cast = null;

	abstract public __Succ1 async(Seller role, price op) throws org.scribble.main.ScribRuntimeException;

	@Override
	default Receive_A_Seller_price_int<?> to(Receive_A_Seller_price_int<?> cast) {
		return (Receive_A_Seller_price_int<?>) this;
	}

	default TwoBuyer_A_2 to(TwoBuyer_A_2 cast) {
		return (TwoBuyer_A_2) this;
	}
}