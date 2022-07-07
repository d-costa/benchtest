package twobuyer.TwoBuyer.TwoBuyer.statechans.B.ioifaces;

import java.io.IOException;
import twobuyer.TwoBuyer.TwoBuyer.*;
import twobuyer.TwoBuyer.TwoBuyer.roles.*;
import twobuyer.TwoBuyer.TwoBuyer.ops.*;

public interface Out_A_reject<__Succ extends Succ_Out_A_reject> {

	abstract public __Succ send(A role, reject op) throws org.scribble.main.ScribRuntimeException, IOException;
}