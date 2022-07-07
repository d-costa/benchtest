package twobuyer.TwoBuyer.TwoBuyer.statechans.Seller.ioifaces;

import java.io.IOException;
import twobuyer.TwoBuyer.TwoBuyer.*;
import twobuyer.TwoBuyer.TwoBuyer.roles.*;
import twobuyer.TwoBuyer.TwoBuyer.ops.*;

public interface Callback_B_address_String<__Succ extends Succ_In_B_address_String> {

	abstract public void receive(__Succ schan, address op, org.scribble.runtime.util.Buf<java.lang.String> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}