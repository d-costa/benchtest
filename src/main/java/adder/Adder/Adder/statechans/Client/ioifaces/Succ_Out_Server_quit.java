package adder.Adder.Adder.statechans.Client.ioifaces;

import adder.Adder.Adder.statechans.Client.EndSocket;

public interface Succ_Out_Server_quit {

	default EndSocket to(EndSocket cast) {
		return (EndSocket) this;
	}
}