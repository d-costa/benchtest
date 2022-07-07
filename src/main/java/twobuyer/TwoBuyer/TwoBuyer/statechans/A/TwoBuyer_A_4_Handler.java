package twobuyer.TwoBuyer.TwoBuyer.statechans.A;

import twobuyer.TwoBuyer.TwoBuyer.ops.*;
import twobuyer.TwoBuyer.TwoBuyer.statechans.A.ioifaces.*;

public interface TwoBuyer_A_4_Handler extends Handle_A_B_date_Date__B_reject<TwoBuyer_A_1, TwoBuyer_A_1> {

	@Override
	abstract public void receive(TwoBuyer_A_1 schan, date op, org.scribble.runtime.util.Buf<java.util.Date> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
	abstract public void receive(TwoBuyer_A_1 schan, reject op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}