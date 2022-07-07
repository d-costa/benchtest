package twobuyer.TwoBuyer.TwoBuyer.statechans.Seller;

import java.io.IOException;
import twobuyer.TwoBuyer.TwoBuyer.*;
import twobuyer.TwoBuyer.TwoBuyer.roles.*;
import twobuyer.TwoBuyer.TwoBuyer.ops.*;
import twobuyer.TwoBuyer.TwoBuyer.statechans.Seller.ioifaces.*;

public final class TwoBuyer_Seller_5 extends org.scribble.runtime.statechans.OutputSocket<TwoBuyer, Seller> implements Select_Seller_B_date_Date<TwoBuyer_Seller_1> {
	public static final TwoBuyer_Seller_5 cast = null;

	protected TwoBuyer_Seller_5(org.scribble.runtime.session.SessionEndpoint<TwoBuyer, Seller> se, boolean dummy) {
		super(se);
	}

	public TwoBuyer_Seller_1 send(B role, date op, java.util.Date arg0) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, TwoBuyer.date, arg0);

		return new TwoBuyer_Seller_1(this.se, true);
	}
}