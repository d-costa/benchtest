package adder.Adder.Adder.statechans.Client.ioifaces;

import adder.Adder.Adder.roles.*;
import adder.Adder.Adder.ops.*;
import adder.Adder.Adder.statechans.Client.*;

public interface Receive_Client_Server_sum_int<__Succ1 extends Succ_In_Server_sum_int> extends In_Server_sum_int<__Succ1>, Succ_Out_Server_v2_int {
	public static final Receive_Client_Server_sum_int<?> cast = null;

	abstract public __Succ1 async(Server role, sum op) throws org.scribble.main.ScribRuntimeException;

	@Override
	default Receive_Client_Server_sum_int<?> to(Receive_Client_Server_sum_int<?> cast) {
		return (Receive_Client_Server_sum_int<?>) this;
	}

	default Adder_Client_3 to(Adder_Client_3 cast) {
		return (Adder_Client_3) this;
	}
}