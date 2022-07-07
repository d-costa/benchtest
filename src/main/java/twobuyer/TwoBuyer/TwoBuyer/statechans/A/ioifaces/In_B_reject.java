package twobuyer.TwoBuyer.TwoBuyer.statechans.A.ioifaces;

import java.io.IOException;
import twobuyer.TwoBuyer.TwoBuyer.*;
import twobuyer.TwoBuyer.TwoBuyer.roles.*;
import twobuyer.TwoBuyer.TwoBuyer.ops.*;

public interface In_B_reject<__Succ extends Succ_In_B_reject> {

	abstract public __Succ receive(B role, reject op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}