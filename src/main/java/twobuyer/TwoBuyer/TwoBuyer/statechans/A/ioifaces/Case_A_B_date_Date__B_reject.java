package twobuyer.TwoBuyer.TwoBuyer.statechans.A.ioifaces;

import twobuyer.TwoBuyer.TwoBuyer.ops.*;

public interface Case_A_B_date_Date__B_reject<__Succ1 extends Succ_In_B_date_Date, __Succ2 extends Succ_In_B_reject> extends In_B_date_Date<__Succ1>, In_B_reject<__Succ2> {
	public static final Branch_A_B_date_Date__B_reject<?, ?> cast = null;

	abstract Branch_A_B_date_Date__B_reject.Branch_A_B_date_Date__B_reject_Enum getOp();

	abstract public __Succ1 receive(date op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract public __Succ2 receive(reject op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}