package twobuyer.TwoBuyer.TwoBuyer.statechans.Seller.ioifaces;

public interface Succ_In_A_id_String {

	default Select_Seller_A_price_int<?> to(Select_Seller_A_price_int<?> cast) {
		return (Select_Seller_A_price_int<?>) this;
	}
}