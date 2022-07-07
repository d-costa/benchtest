package twobuyer.TwoBuyer.TwoBuyer.statechans.Seller.ioifaces;

import java.io.IOException;
import twobuyer.TwoBuyer.TwoBuyer.*;
import twobuyer.TwoBuyer.TwoBuyer.roles.*;
import twobuyer.TwoBuyer.TwoBuyer.ops.*;

public interface In_A_Quit<__Succ extends Succ_In_A_Quit> {

	abstract public __Succ receive(A role, Quit op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}