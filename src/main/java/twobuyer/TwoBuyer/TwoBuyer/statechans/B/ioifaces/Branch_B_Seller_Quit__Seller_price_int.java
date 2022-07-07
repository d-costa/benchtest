package twobuyer.TwoBuyer.TwoBuyer.statechans.B.ioifaces;

import twobuyer.TwoBuyer.TwoBuyer.roles.*;
import twobuyer.TwoBuyer.TwoBuyer.statechans.B.*;

public interface Branch_B_Seller_Quit__Seller_price_int<__Succ1 extends Succ_In_Seller_Quit, __Succ2 extends Succ_In_Seller_price_int> extends Succ_Out_A_date_Date, Succ_Out_A_reject {
	public static final Branch_B_Seller_Quit__Seller_price_int<?, ?> cast = null;

	abstract Case_B_Seller_Quit__Seller_price_int<__Succ1, __Succ2> branch(Seller role) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract void branch(Seller role, Handle_B_Seller_Quit__Seller_price_int<__Succ1, __Succ2> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract void handle(Seller role, Handle_B_Seller_Quit__Seller_price_int<Succ_In_Seller_Quit, Succ_In_Seller_price_int> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
	default Branch_B_Seller_Quit__Seller_price_int<?, ?> to(Branch_B_Seller_Quit__Seller_price_int<?, ?> cast) {
		return (Branch_B_Seller_Quit__Seller_price_int<?, ?>) this;
	}

	default TwoBuyer_B_1 to(TwoBuyer_B_1 cast) {
		return (TwoBuyer_B_1) this;
	}

public enum Branch_B_Seller_Quit__Seller_price_int_Enum implements org.scribble.runtime.session.OpEnum {
	price, Quit
}
}