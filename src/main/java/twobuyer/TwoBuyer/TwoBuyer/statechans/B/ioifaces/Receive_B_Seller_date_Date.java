package twobuyer.TwoBuyer.TwoBuyer.statechans.B.ioifaces;

import twobuyer.TwoBuyer.TwoBuyer.roles.*;
import twobuyer.TwoBuyer.TwoBuyer.ops.*;
import twobuyer.TwoBuyer.TwoBuyer.statechans.B.*;

public interface Receive_B_Seller_date_Date<__Succ1 extends Succ_In_Seller_date_Date> extends In_Seller_date_Date<__Succ1>, Succ_Out_Seller_address_String {
	public static final Receive_B_Seller_date_Date<?> cast = null;

	abstract public __Succ1 async(Seller role, date op) throws org.scribble.main.ScribRuntimeException;

	@Override
	default Receive_B_Seller_date_Date<?> to(Receive_B_Seller_date_Date<?> cast) {
		return (Receive_B_Seller_date_Date<?>) this;
	}

	default TwoBuyer_B_4 to(TwoBuyer_B_4 cast) {
		return (TwoBuyer_B_4) this;
	}
}