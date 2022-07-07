package twobuyer.TwoBuyer.TwoBuyer.statechans.Seller.ioifaces;

import java.io.IOException;
import twobuyer.TwoBuyer.TwoBuyer.*;
import twobuyer.TwoBuyer.TwoBuyer.roles.*;
import twobuyer.TwoBuyer.TwoBuyer.ops.*;

public interface Out_B_price_int<__Succ extends Succ_Out_B_price_int> {

	abstract public __Succ send(B role, price op, java.lang.Integer arg0) throws org.scribble.main.ScribRuntimeException, IOException;
}