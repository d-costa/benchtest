package twobuyer.TwoBuyer.TwoBuyer.statechans.Seller;

import twobuyer.TwoBuyer.TwoBuyer.ops.*;
import twobuyer.TwoBuyer.TwoBuyer.statechans.Seller.ioifaces.*;

public interface TwoBuyer_Seller_4_Handler extends Handle_Seller_B_address_String__B_reject<TwoBuyer_Seller_5, TwoBuyer_Seller_1> {

	@Override
	abstract public void receive(TwoBuyer_Seller_5 schan, address op, org.scribble.runtime.util.Buf<java.lang.String> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
	abstract public void receive(TwoBuyer_Seller_1 schan, reject op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}