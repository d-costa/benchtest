package adder.Adder.Adder.statechans.Server.ioifaces;

public interface Succ_In_Client_v1_int {

	default Receive_Server_Client_v2_int<?> to(Receive_Server_Client_v2_int<?> cast) {
		return (Receive_Server_Client_v2_int<?>) this;
	}
}