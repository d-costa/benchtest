package twobuyer.TwoBuyer.TwoBuyer.statechans.B.ioifaces;

import java.io.IOException;
import twobuyer.TwoBuyer.TwoBuyer.*;
import twobuyer.TwoBuyer.TwoBuyer.roles.*;
import twobuyer.TwoBuyer.TwoBuyer.ops.*;

public interface In_Seller_Quit<__Succ extends Succ_In_Seller_Quit> {

	abstract public __Succ receive(Seller role, Quit op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}