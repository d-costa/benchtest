package twobuyer.TwoBuyer.TwoBuyer.statechans.Seller.ioifaces;

import java.io.IOException;
import twobuyer.TwoBuyer.TwoBuyer.*;
import twobuyer.TwoBuyer.TwoBuyer.roles.*;
import twobuyer.TwoBuyer.TwoBuyer.ops.*;

public interface Callback_B_reject<__Succ extends Succ_In_B_reject> {

	abstract public void receive(__Succ schan, reject op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}