package twobuyer.TwoBuyer.TwoBuyer.statechans.B;

import twobuyer.TwoBuyer.TwoBuyer.ops.*;
import twobuyer.TwoBuyer.TwoBuyer.*;
import twobuyer.TwoBuyer.TwoBuyer.roles.*;
import twobuyer.TwoBuyer.TwoBuyer.statechans.B.ioifaces.*;

public interface TwoBuyer_B_1_Handler extends Handle_B_Seller_Quit__Seller_price_int<EndSocket, TwoBuyer_B_2> {

	@Override
	abstract public void receive(TwoBuyer_B_2 schan, price op, org.scribble.runtime.util.Buf<java.lang.Integer> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
	abstract public void receive(EndSocket schan, Quit op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}