package twobuyer.TwoBuyer.TwoBuyer.statechans.Seller.ioifaces;

import java.io.IOException;
import twobuyer.TwoBuyer.TwoBuyer.*;
import twobuyer.TwoBuyer.TwoBuyer.roles.*;
import twobuyer.TwoBuyer.TwoBuyer.ops.*;

public interface Out_B_date_Date<__Succ extends Succ_Out_B_date_Date> {

	abstract public __Succ send(B role, date op, java.util.Date arg0) throws org.scribble.main.ScribRuntimeException, IOException;
}