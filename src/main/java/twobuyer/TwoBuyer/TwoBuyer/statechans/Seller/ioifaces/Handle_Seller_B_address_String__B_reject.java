package twobuyer.TwoBuyer.TwoBuyer.statechans.Seller.ioifaces;

import twobuyer.TwoBuyer.TwoBuyer.ops.*;

public interface Handle_Seller_B_address_String__B_reject<__Succ1 extends Succ_In_B_address_String, __Succ2 extends Succ_In_B_reject> extends Callback_B_address_String<__Succ1>, Callback_B_reject<__Succ2> {

	abstract public void receive(__Succ1 schan, address op, org.scribble.runtime.util.Buf<java.lang.String> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract public void receive(__Succ2 schan, reject op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}