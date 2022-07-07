package twobuyer.TwoBuyer.TwoBuyer.statechans.Seller.ioifaces;

import twobuyer.TwoBuyer.TwoBuyer.ops.*;

public interface Handle_Seller_A_Quit__A_id_String<__Succ1 extends Succ_In_A_Quit, __Succ2 extends Succ_In_A_id_String> extends Callback_A_Quit<__Succ1>, Callback_A_id_String<__Succ2> {

	abstract public void receive(__Succ1 schan, Quit op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract public void receive(__Succ2 schan, id op, org.scribble.runtime.util.Buf<java.lang.String> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}