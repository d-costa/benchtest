package twobuyer.TwoBuyer.TwoBuyer.statechans.A.ioifaces;

import java.io.IOException;
import twobuyer.TwoBuyer.TwoBuyer.*;
import twobuyer.TwoBuyer.TwoBuyer.roles.*;
import twobuyer.TwoBuyer.TwoBuyer.ops.*;

public interface In_B_date_Date<__Succ extends Succ_In_B_date_Date> {

	abstract public __Succ receive(B role, date op, org.scribble.runtime.util.Buf<? super java.util.Date> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}