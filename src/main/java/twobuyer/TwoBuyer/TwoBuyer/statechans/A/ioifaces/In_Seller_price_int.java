package twobuyer.TwoBuyer.TwoBuyer.statechans.A.ioifaces;

import java.io.IOException;
import twobuyer.TwoBuyer.TwoBuyer.*;
import twobuyer.TwoBuyer.TwoBuyer.roles.*;
import twobuyer.TwoBuyer.TwoBuyer.ops.*;

public interface In_Seller_price_int<__Succ extends Succ_In_Seller_price_int> {

	abstract public __Succ receive(Seller role, price op, org.scribble.runtime.util.Buf<? super java.lang.Integer> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}