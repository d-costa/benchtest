package twobuyer.TwoBuyer.TwoBuyer.statechans.Seller;

import java.io.IOException;
import twobuyer.TwoBuyer.TwoBuyer.*;
import twobuyer.TwoBuyer.TwoBuyer.roles.*;
import twobuyer.TwoBuyer.TwoBuyer.ops.*;
import twobuyer.TwoBuyer.TwoBuyer.statechans.Seller.ioifaces.*;

public final class TwoBuyer_Seller_6 extends org.scribble.runtime.statechans.OutputSocket<TwoBuyer, Seller> implements Select_Seller_B_Quit<EndSocket> {
	public static final TwoBuyer_Seller_6 cast = null;

	protected TwoBuyer_Seller_6(org.scribble.runtime.session.SessionEndpoint<TwoBuyer, Seller> se, boolean dummy) {
		super(se);
	}

	public twobuyer.TwoBuyer.TwoBuyer.statechans.Seller.EndSocket send(B role, Quit op) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, TwoBuyer.Quit);

		this.se.setCompleted();
		return new EndSocket(this.se, true);
	}
}