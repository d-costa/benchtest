package twobuyer.TwoBuyer.TwoBuyer.statechans.A.ioifaces;

import java.io.IOException;
import twobuyer.TwoBuyer.TwoBuyer.*;
import twobuyer.TwoBuyer.TwoBuyer.roles.*;
import twobuyer.TwoBuyer.TwoBuyer.ops.*;

public interface Out_Seller_Quit<__Succ extends Succ_Out_Seller_Quit> {

	abstract public __Succ send(Seller role, Quit op) throws org.scribble.main.ScribRuntimeException, IOException;
}