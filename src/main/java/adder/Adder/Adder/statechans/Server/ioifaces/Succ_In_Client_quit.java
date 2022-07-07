package adder.Adder.Adder.statechans.Server.ioifaces;

import adder.Adder.Adder.statechans.Server.EndSocket;

public interface Succ_In_Client_quit {

	default EndSocket to(EndSocket cast) {
		return (EndSocket) this;
	}
}