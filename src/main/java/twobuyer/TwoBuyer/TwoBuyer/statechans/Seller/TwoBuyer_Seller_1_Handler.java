package twobuyer.TwoBuyer.TwoBuyer.statechans.Seller;

import twobuyer.TwoBuyer.TwoBuyer.ops.*;
import twobuyer.TwoBuyer.TwoBuyer.statechans.Seller.ioifaces.*;

public interface TwoBuyer_Seller_1_Handler extends Handle_Seller_A_Quit__A_id_String<TwoBuyer_Seller_6, TwoBuyer_Seller_2> {

	@Override
	abstract public void receive(TwoBuyer_Seller_2 schan, id op, org.scribble.runtime.util.Buf<java.lang.String> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
	abstract public void receive(TwoBuyer_Seller_6 schan, Quit op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}