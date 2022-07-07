package twobuyer.TwoBuyer.TwoBuyer.statechans.B;

import java.io.IOException;
import twobuyer.TwoBuyer.TwoBuyer.*;
import twobuyer.TwoBuyer.TwoBuyer.roles.*;
import twobuyer.TwoBuyer.TwoBuyer.ops.*;
import twobuyer.TwoBuyer.TwoBuyer.statechans.B.ioifaces.*;

public final class TwoBuyer_B_3 extends org.scribble.runtime.statechans.OutputSocket<TwoBuyer, B> implements Select_B_Seller_address_String__Seller_reject<TwoBuyer_B_4, TwoBuyer_B_6> {
	public static final TwoBuyer_B_3 cast = null;

	protected TwoBuyer_B_3(org.scribble.runtime.session.SessionEndpoint<TwoBuyer, B> se, boolean dummy) {
		super(se);
	}

	public TwoBuyer_B_4 send(Seller role, address op, java.lang.String arg0) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, TwoBuyer.address, arg0);

		return new TwoBuyer_B_4(this.se, true);
	}

	public TwoBuyer_B_6 send(Seller role, reject op) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, TwoBuyer.reject);

		return new TwoBuyer_B_6(this.se, true);
	}
}