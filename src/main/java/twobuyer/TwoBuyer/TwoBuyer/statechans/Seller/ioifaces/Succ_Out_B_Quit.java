package twobuyer.TwoBuyer.TwoBuyer.statechans.Seller.ioifaces;

import twobuyer.TwoBuyer.TwoBuyer.statechans.Seller.EndSocket;

public interface Succ_Out_B_Quit {

	default EndSocket to(EndSocket cast) {
		return (EndSocket) this;
	}
}