package twobuyer.TwoBuyer.TwoBuyer.statechans.A.ioifaces;

import twobuyer.TwoBuyer.TwoBuyer.ops.*;

public interface Handle_A_B_date_Date__B_reject<__Succ1 extends Succ_In_B_date_Date, __Succ2 extends Succ_In_B_reject> extends Callback_B_date_Date<__Succ1>, Callback_B_reject<__Succ2> {

	abstract public void receive(__Succ1 schan, date op, org.scribble.runtime.util.Buf<java.util.Date> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract public void receive(__Succ2 schan, reject op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}