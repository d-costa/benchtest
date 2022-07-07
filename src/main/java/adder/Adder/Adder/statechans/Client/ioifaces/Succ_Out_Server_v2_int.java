package adder.Adder.Adder.statechans.Client.ioifaces;

public interface Succ_Out_Server_v2_int {

	default Receive_Client_Server_sum_int<?> to(Receive_Client_Server_sum_int<?> cast) {
		return (Receive_Client_Server_sum_int<?>) this;
	}
}