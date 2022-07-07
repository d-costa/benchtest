package adder.Adder.Adder.statechans.Server.ioifaces;

import java.io.IOException;
import adder.Adder.Adder.*;
import adder.Adder.Adder.roles.*;
import adder.Adder.Adder.ops.*;

public interface Out_Client_sum_int<__Succ extends Succ_Out_Client_sum_int> {

	abstract public __Succ send(Client role, sum op, java.lang.Integer arg0) throws org.scribble.main.ScribRuntimeException, IOException;
}