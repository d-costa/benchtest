package twobuyer.TwoBuyer.TwoBuyer.statechans.Seller.ioifaces;

import twobuyer.TwoBuyer.TwoBuyer.roles.*;
import twobuyer.TwoBuyer.TwoBuyer.statechans.Seller.*;

public interface Branch_Seller_B_address_String__B_reject<__Succ1 extends Succ_In_B_address_String, __Succ2 extends Succ_In_B_reject> extends Succ_Out_B_price_int {
	public static final Branch_Seller_B_address_String__B_reject<?, ?> cast = null;

	abstract Case_Seller_B_address_String__B_reject<__Succ1, __Succ2> branch(B role) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract void branch(B role, Handle_Seller_B_address_String__B_reject<__Succ1, __Succ2> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract void handle(B role, Handle_Seller_B_address_String__B_reject<Succ_In_B_address_String, Succ_In_B_reject> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
	default Branch_Seller_B_address_String__B_reject<?, ?> to(Branch_Seller_B_address_String__B_reject<?, ?> cast) {
		return (Branch_Seller_B_address_String__B_reject<?, ?>) this;
	}

	default TwoBuyer_Seller_4 to(TwoBuyer_Seller_4 cast) {
		return (TwoBuyer_Seller_4) this;
	}

public enum Branch_Seller_B_address_String__B_reject_Enum implements org.scribble.runtime.session.OpEnum {
	address, reject
}
}