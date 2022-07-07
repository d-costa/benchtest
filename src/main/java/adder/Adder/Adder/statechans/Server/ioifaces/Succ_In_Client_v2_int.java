package adder.Adder.Adder.statechans.Server.ioifaces;

public interface Succ_In_Client_v2_int {

	default Select_Server_Client_sum_int<?> to(Select_Server_Client_sum_int<?> cast) {
		return (Select_Server_Client_sum_int<?>) this;
	}
}