package twobuyer.TwoBuyer.TwoBuyer.statechans.B.ioifaces;

import twobuyer.TwoBuyer.TwoBuyer.statechans.B.EndSocket;

public interface Succ_In_Seller_Quit {

	default EndSocket to(EndSocket cast) {
		return (EndSocket) this;
	}
}