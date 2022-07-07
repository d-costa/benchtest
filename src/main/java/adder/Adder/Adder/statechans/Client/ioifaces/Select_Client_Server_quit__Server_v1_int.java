package adder.Adder.Adder.statechans.Client.ioifaces;

import adder.Adder.Adder.roles.*;
import adder.Adder.Adder.statechans.Client.*;

public interface Select_Client_Server_quit__Server_v1_int<__Succ1 extends Succ_Out_Server_quit, __Succ2 extends Succ_Out_Server_v1_int> extends Out_Server_quit<__Succ1>, Out_Server_v1_int<__Succ2>, Succ_In_Server_sum_int {
	public static final Select_Client_Server_quit__Server_v1_int<?, ?> cast = null;

	@Override
	default Select_Client_Server_quit__Server_v1_int<?, ?> to(Select_Client_Server_quit__Server_v1_int<?, ?> cast) {
		return (Select_Client_Server_quit__Server_v1_int<?, ?>) this;
	}

	default Adder_Client_1 to(Adder_Client_1 cast) {
		return (Adder_Client_1) this;
	}
}