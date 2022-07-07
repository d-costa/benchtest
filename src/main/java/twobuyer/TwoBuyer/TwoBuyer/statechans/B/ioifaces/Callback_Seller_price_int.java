package twobuyer.TwoBuyer.TwoBuyer.statechans.B.ioifaces;

import java.io.IOException;
import twobuyer.TwoBuyer.TwoBuyer.*;
import twobuyer.TwoBuyer.TwoBuyer.roles.*;
import twobuyer.TwoBuyer.TwoBuyer.ops.*;

public interface Callback_Seller_price_int<__Succ extends Succ_In_Seller_price_int> {

	abstract public void receive(__Succ schan, price op, org.scribble.runtime.util.Buf<java.lang.Integer> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}