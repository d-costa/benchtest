package twobuyer.TwoBuyer.TwoBuyer.statechans.B.ioifaces;

public interface Succ_Out_Seller_reject {

	default Select_B_A_reject<?> to(Select_B_A_reject<?> cast) {
		return (Select_B_A_reject<?>) this;
	}
}