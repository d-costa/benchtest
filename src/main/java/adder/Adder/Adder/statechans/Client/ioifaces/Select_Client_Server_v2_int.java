package adder.Adder.Adder.statechans.Client.ioifaces;

import adder.Adder.Adder.roles.*;
import adder.Adder.Adder.statechans.Client.*;

public interface Select_Client_Server_v2_int<__Succ1 extends Succ_Out_Server_v2_int> extends Out_Server_v2_int<__Succ1>, Succ_Out_Server_v1_int {
	public static final Select_Client_Server_v2_int<?> cast = null;

	@Override
	default Select_Client_Server_v2_int<?> to(Select_Client_Server_v2_int<?> cast) {
		return (Select_Client_Server_v2_int<?>) this;
	}

	default Adder_Client_2 to(Adder_Client_2 cast) {
		return (Adder_Client_2) this;
	}
}