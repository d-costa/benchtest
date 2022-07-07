package twobuyer.TwoBuyer.TwoBuyer.statechans.B.ioifaces;

import twobuyer.TwoBuyer.TwoBuyer.ops.*;

public interface Case_B_Seller_Quit__Seller_price_int<__Succ1 extends Succ_In_Seller_Quit, __Succ2 extends Succ_In_Seller_price_int> extends In_Seller_Quit<__Succ1>, In_Seller_price_int<__Succ2> {
	public static final Branch_B_Seller_Quit__Seller_price_int<?, ?> cast = null;

	abstract Branch_B_Seller_Quit__Seller_price_int.Branch_B_Seller_Quit__Seller_price_int_Enum getOp();

	abstract public twobuyer.TwoBuyer.TwoBuyer.statechans.B.EndSocket receive(Quit op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract public __Succ2 receive(price op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}