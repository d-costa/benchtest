package adder.Adder.Adder.statechans.Server.ioifaces;

import adder.Adder.Adder.roles.*;
import adder.Adder.Adder.statechans.Server.*;

public interface Select_Server_Client_sum_int<__Succ1 extends Succ_Out_Client_sum_int> extends Out_Client_sum_int<__Succ1>, Succ_In_Client_v2_int {
	public static final Select_Server_Client_sum_int<?> cast = null;

	@Override
	default Select_Server_Client_sum_int<?> to(Select_Server_Client_sum_int<?> cast) {
		return (Select_Server_Client_sum_int<?>) this;
	}

	default Adder_Server_3 to(Adder_Server_3 cast) {
		return (Adder_Server_3) this;
	}
}