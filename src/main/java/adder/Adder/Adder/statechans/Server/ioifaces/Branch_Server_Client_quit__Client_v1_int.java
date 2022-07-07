package adder.Adder.Adder.statechans.Server.ioifaces;

import adder.Adder.Adder.roles.*;
import adder.Adder.Adder.statechans.Server.*;

public interface Branch_Server_Client_quit__Client_v1_int<__Succ1 extends Succ_In_Client_quit, __Succ2 extends Succ_In_Client_v1_int> extends Succ_Out_Client_sum_int {
	public static final Branch_Server_Client_quit__Client_v1_int<?, ?> cast = null;

	abstract Case_Server_Client_quit__Client_v1_int<__Succ1, __Succ2> branch(Client role) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract void branch(Client role, Handle_Server_Client_quit__Client_v1_int<__Succ1, __Succ2> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract void handle(Client role, Handle_Server_Client_quit__Client_v1_int<Succ_In_Client_quit, Succ_In_Client_v1_int> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
	default Branch_Server_Client_quit__Client_v1_int<?, ?> to(Branch_Server_Client_quit__Client_v1_int<?, ?> cast) {
		return (Branch_Server_Client_quit__Client_v1_int<?, ?>) this;
	}

	default Adder_Server_1 to(Adder_Server_1 cast) {
		return (Adder_Server_1) this;
	}

public enum Branch_Server_Client_quit__Client_v1_int_Enum implements org.scribble.runtime.session.OpEnum {
	quit, v1
}
}