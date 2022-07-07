package adder.Adder.Adder.statechans.Server.ioifaces;

import adder.Adder.Adder.roles.*;
import adder.Adder.Adder.ops.*;
import adder.Adder.Adder.statechans.Server.*;

public interface Receive_Server_Client_v2_int<__Succ1 extends Succ_In_Client_v2_int> extends In_Client_v2_int<__Succ1>, Succ_In_Client_v1_int {
	public static final Receive_Server_Client_v2_int<?> cast = null;

	abstract public __Succ1 async(Client role, v2 op) throws org.scribble.main.ScribRuntimeException;

	@Override
	default Receive_Server_Client_v2_int<?> to(Receive_Server_Client_v2_int<?> cast) {
		return (Receive_Server_Client_v2_int<?>) this;
	}

	default Adder_Server_2 to(Adder_Server_2 cast) {
		return (Adder_Server_2) this;
	}
}