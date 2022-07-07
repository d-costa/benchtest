package twobuyer.TwoBuyer.TwoBuyer.statechans.A.ioifaces;

public interface Succ_Out_Seller_id_String {

	default Receive_A_Seller_price_int<?> to(Receive_A_Seller_price_int<?> cast) {
		return (Receive_A_Seller_price_int<?>) this;
	}
}