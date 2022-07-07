package adder.Adder.Adder.statechans.Client.ioifaces;

public interface Succ_Out_Server_v1_int {

	default Select_Client_Server_v2_int<?> to(Select_Client_Server_v2_int<?> cast) {
		return (Select_Client_Server_v2_int<?>) this;
	}
}