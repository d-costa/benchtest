package twobuyer.TwoBuyer.TwoBuyer.statechans.Seller.ioifaces;

public interface Succ_In_A_Quit {

	default Select_Seller_B_Quit<?> to(Select_Seller_B_Quit<?> cast) {
		return (Select_Seller_B_Quit<?>) this;
	}
}