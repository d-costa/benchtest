package twobuyer.TwoBuyer.TwoBuyer.statechans.Seller.ioifaces;

import twobuyer.TwoBuyer.TwoBuyer.ops.*;

public interface Case_Seller_A_Quit__A_id_String<__Succ1 extends Succ_In_A_Quit, __Succ2 extends Succ_In_A_id_String> extends In_A_Quit<__Succ1>, In_A_id_String<__Succ2> {
	public static final Branch_Seller_A_Quit__A_id_String<?, ?> cast = null;

	abstract Branch_Seller_A_Quit__A_id_String.Branch_Seller_A_Quit__A_id_String_Enum getOp();

	abstract public __Succ1 receive(Quit op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract public __Succ2 receive(id op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}