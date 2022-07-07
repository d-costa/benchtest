package twobuyer.TwoBuyer.TwoBuyer.statechans.B.ioifaces;

import twobuyer.TwoBuyer.TwoBuyer.ops.*;

public interface Handle_B_Seller_Quit__Seller_price_int<__Succ1 extends Succ_In_Seller_Quit, __Succ2 extends Succ_In_Seller_price_int> extends Callback_Seller_Quit<__Succ1>, Callback_Seller_price_int<__Succ2> {

	abstract public void receive(__Succ1 schan, Quit op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract public void receive(__Succ2 schan, price op, org.scribble.runtime.util.Buf<java.lang.Integer> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}