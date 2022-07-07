package twobuyer.TwoBuyer.TwoBuyer.statechans.Seller.ioifaces;

import java.io.IOException;
import twobuyer.TwoBuyer.TwoBuyer.*;
import twobuyer.TwoBuyer.TwoBuyer.roles.*;
import twobuyer.TwoBuyer.TwoBuyer.ops.*;

public interface Out_B_Quit<__Succ extends Succ_Out_B_Quit> {

	abstract public __Succ send(B role, Quit op) throws org.scribble.main.ScribRuntimeException, IOException;
}