package twobuyer.TwoBuyer.TwoBuyer;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.scribble.core.type.name.Role;
import twobuyer.TwoBuyer.TwoBuyer.roles.*;
import twobuyer.TwoBuyer.TwoBuyer.ops.*;

public final class TwoBuyer extends org.scribble.runtime.session.Session {
	public static final List<String> IMPATH = new LinkedList<>();
	public static final String SOURCE = "getSource";
	public static final org.scribble.core.type.name.GProtoName PROTO = org.scribble.core.type.session.STypeFactory.parseGlobalProtocolName("twobuyer.TwoBuyer.TwoBuyer");
	public static final Seller Seller = twobuyer.TwoBuyer.TwoBuyer.roles.Seller.Seller;
	public static final A A = twobuyer.TwoBuyer.TwoBuyer.roles.A.A;
	public static final B B = twobuyer.TwoBuyer.TwoBuyer.roles.B.B;
	public static final Quit Quit = twobuyer.TwoBuyer.TwoBuyer.ops.Quit.Quit;
	public static final date date = twobuyer.TwoBuyer.TwoBuyer.ops.date.date;
	public static final price price = twobuyer.TwoBuyer.TwoBuyer.ops.price.price;
	public static final reject reject = twobuyer.TwoBuyer.TwoBuyer.ops.reject.reject;
	public static final id id = twobuyer.TwoBuyer.TwoBuyer.ops.id.id;
	public static final aShare aShare = twobuyer.TwoBuyer.TwoBuyer.ops.aShare.aShare;
	public static final address address = twobuyer.TwoBuyer.TwoBuyer.ops.address.address;
	public static final List<Role> ROLES = Collections.unmodifiableList(Arrays.asList(new Role[] {Seller, A, B}));

	public TwoBuyer() {
		super(TwoBuyer.IMPATH, TwoBuyer.SOURCE, TwoBuyer.PROTO);
	}

	@Override
	public List<Role> getRoles() {
		return TwoBuyer.ROLES;
	}
}