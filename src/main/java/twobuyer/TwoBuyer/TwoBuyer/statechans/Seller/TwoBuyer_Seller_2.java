package twobuyer.TwoBuyer.TwoBuyer.statechans.Seller;

import java.io.IOException;
import twobuyer.TwoBuyer.TwoBuyer.*;
import twobuyer.TwoBuyer.TwoBuyer.roles.*;
import twobuyer.TwoBuyer.TwoBuyer.ops.*;
import twobuyer.TwoBuyer.TwoBuyer.statechans.Seller.ioifaces.*;

public final class TwoBuyer_Seller_2 extends org.scribble.runtime.statechans.OutputSocket<TwoBuyer, Seller> implements Select_Seller_A_price_int<TwoBuyer_Seller_3> {
	public static final TwoBuyer_Seller_2 cast = null;

	protected TwoBuyer_Seller_2(org.scribble.runtime.session.SessionEndpoint<TwoBuyer, Seller> se, boolean dummy) {
		super(se);
	}

	public TwoBuyer_Seller_3 send(A role, price op, java.lang.Integer arg0) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, TwoBuyer.price, arg0);

		return new TwoBuyer_Seller_3(this.se, true);
	}
}