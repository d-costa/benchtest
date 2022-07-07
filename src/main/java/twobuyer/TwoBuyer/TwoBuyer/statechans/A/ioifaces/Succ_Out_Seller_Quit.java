package twobuyer.TwoBuyer.TwoBuyer.statechans.A.ioifaces;

import twobuyer.TwoBuyer.TwoBuyer.statechans.A.EndSocket;

public interface Succ_Out_Seller_Quit {

	default EndSocket to(EndSocket cast) {
		return (EndSocket) this;
	}
}