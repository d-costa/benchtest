package adder.Adder.Adder.statechans.Server.ioifaces;

import java.io.IOException;
import adder.Adder.Adder.*;
import adder.Adder.Adder.roles.*;
import adder.Adder.Adder.ops.*;

public interface Callback_Client_v1_int<__Succ extends Succ_In_Client_v1_int> {

	abstract public void receive(__Succ schan, v1 op, org.scribble.runtime.util.Buf<java.lang.Integer> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}