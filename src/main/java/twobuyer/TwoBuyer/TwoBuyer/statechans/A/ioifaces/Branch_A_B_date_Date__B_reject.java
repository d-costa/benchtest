package twobuyer.TwoBuyer.TwoBuyer.statechans.A.ioifaces;

import twobuyer.TwoBuyer.TwoBuyer.roles.*;
import twobuyer.TwoBuyer.TwoBuyer.statechans.A.*;

public interface Branch_A_B_date_Date__B_reject<__Succ1 extends Succ_In_B_date_Date, __Succ2 extends Succ_In_B_reject> extends Succ_Out_B_aShare_int {
	public static final Branch_A_B_date_Date__B_reject<?, ?> cast = null;

	abstract Case_A_B_date_Date__B_reject<__Succ1, __Succ2> branch(B role) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract void branch(B role, Handle_A_B_date_Date__B_reject<__Succ1, __Succ2> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract void handle(B role, Handle_A_B_date_Date__B_reject<Succ_In_B_date_Date, Succ_In_B_reject> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
	default Branch_A_B_date_Date__B_reject<?, ?> to(Branch_A_B_date_Date__B_reject<?, ?> cast) {
		return (Branch_A_B_date_Date__B_reject<?, ?>) this;
	}

	default TwoBuyer_A_4 to(TwoBuyer_A_4 cast) {
		return (TwoBuyer_A_4) this;
	}

public enum Branch_A_B_date_Date__B_reject_Enum implements org.scribble.runtime.session.OpEnum {
	date, reject
}
}