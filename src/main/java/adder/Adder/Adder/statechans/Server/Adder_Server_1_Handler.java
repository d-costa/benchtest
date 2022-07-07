package adder.Adder.Adder.statechans.Server;

import adder.Adder.Adder.ops.*;
import adder.Adder.Adder.*;
import adder.Adder.Adder.roles.*;
import adder.Adder.Adder.statechans.Server.ioifaces.*;

public interface Adder_Server_1_Handler extends Handle_Server_Client_quit__Client_v1_int<EndSocket, Adder_Server_2> {

	@Override
	abstract public void receive(EndSocket schan, quit op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
	abstract public void receive(Adder_Server_2 schan, v1 op, org.scribble.runtime.util.Buf<java.lang.Integer> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}