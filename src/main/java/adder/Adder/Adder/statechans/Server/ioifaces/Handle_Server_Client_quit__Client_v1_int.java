package adder.Adder.Adder.statechans.Server.ioifaces;

import adder.Adder.Adder.ops.*;

public interface Handle_Server_Client_quit__Client_v1_int<__Succ1 extends Succ_In_Client_quit, __Succ2 extends Succ_In_Client_v1_int> extends Callback_Client_quit<__Succ1>, Callback_Client_v1_int<__Succ2> {

	abstract public void receive(__Succ1 schan, quit op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract public void receive(__Succ2 schan, v1 op, org.scribble.runtime.util.Buf<java.lang.Integer> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}