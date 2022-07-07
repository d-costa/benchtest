package twobuyer.TwoBuyer.TwoBuyer.statechans.Seller.ioifaces;

public interface Succ_Out_A_price_int {

	default Select_Seller_B_price_int<?> to(Select_Seller_B_price_int<?> cast) {
		return (Select_Seller_B_price_int<?>) this;
	}
}