package adder.Adder.Adder.statechans.Server.ioifaces;

import adder.Adder.Adder.ops.*;

public interface Case_Server_Client_quit__Client_v1_int<__Succ1 extends Succ_In_Client_quit, __Succ2 extends Succ_In_Client_v1_int> extends In_Client_quit<__Succ1>, In_Client_v1_int<__Succ2> {
	public static final Branch_Server_Client_quit__Client_v1_int<?, ?> cast = null;

	abstract Branch_Server_Client_quit__Client_v1_int.Branch_Server_Client_quit__Client_v1_int_Enum getOp();

	abstract public adder.Adder.Adder.statechans.Server.EndSocket receive(quit op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract public __Succ2 receive(v1 op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}