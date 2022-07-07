package twobuyer.TwoBuyer.TwoBuyer.statechans.Seller.ioifaces;

import twobuyer.TwoBuyer.TwoBuyer.roles.*;
import twobuyer.TwoBuyer.TwoBuyer.statechans.Seller.*;

public interface Branch_Seller_A_Quit__A_id_String<__Succ1 extends Succ_In_A_Quit, __Succ2 extends Succ_In_A_id_String> extends Succ_In_B_reject, Succ_Out_B_date_Date {
	public static final Branch_Seller_A_Quit__A_id_String<?, ?> cast = null;

	abstract Case_Seller_A_Quit__A_id_String<__Succ1, __Succ2> branch(A role) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract void branch(A role, Handle_Seller_A_Quit__A_id_String<__Succ1, __Succ2> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract void handle(A role, Handle_Seller_A_Quit__A_id_String<Succ_In_A_Quit, Succ_In_A_id_String> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
	default Branch_Seller_A_Quit__A_id_String<?, ?> to(Branch_Seller_A_Quit__A_id_String<?, ?> cast) {
		return (Branch_Seller_A_Quit__A_id_String<?, ?>) this;
	}

	default TwoBuyer_Seller_1 to(TwoBuyer_Seller_1 cast) {
		return (TwoBuyer_Seller_1) this;
	}

public enum Branch_Seller_A_Quit__A_id_String_Enum implements org.scribble.runtime.session.OpEnum {
	id, Quit
}
}