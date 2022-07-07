package adder.Adder.Adder.statechans.Client.ioifaces;

import java.io.IOException;
import adder.Adder.Adder.*;
import adder.Adder.Adder.roles.*;
import adder.Adder.Adder.ops.*;

public interface Out_Server_v1_int<__Succ extends Succ_Out_Server_v1_int> {

	abstract public __Succ send(Server role, v1 op, java.lang.Integer arg0) throws org.scribble.main.ScribRuntimeException, IOException;
}