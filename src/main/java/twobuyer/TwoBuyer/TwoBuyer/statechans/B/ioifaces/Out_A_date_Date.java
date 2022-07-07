package twobuyer.TwoBuyer.TwoBuyer.statechans.B.ioifaces;

import java.io.IOException;
import twobuyer.TwoBuyer.TwoBuyer.*;
import twobuyer.TwoBuyer.TwoBuyer.roles.*;
import twobuyer.TwoBuyer.TwoBuyer.ops.*;

public interface Out_A_date_Date<__Succ extends Succ_Out_A_date_Date> {

	abstract public __Succ send(A role, date op, java.util.Date arg0) throws org.scribble.main.ScribRuntimeException, IOException;
}