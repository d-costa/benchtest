package twobuyer.TwoBuyer.TwoBuyer.statechans.B.ioifaces;

public interface Succ_In_Seller_price_int {

	default Receive_B_A_aShare_int<?> to(Receive_B_A_aShare_int<?> cast) {
		return (Receive_B_A_aShare_int<?>) this;
	}
}