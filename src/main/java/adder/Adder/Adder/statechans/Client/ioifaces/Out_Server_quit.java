package adder.Adder.Adder.statechans.Client.ioifaces;

import java.io.IOException;
import adder.Adder.Adder.*;
import adder.Adder.Adder.roles.*;
import adder.Adder.Adder.ops.*;

public interface Out_Server_quit<__Succ extends Succ_Out_Server_quit> {

	abstract public __Succ send(Server role, quit op) throws org.scribble.main.ScribRuntimeException, IOException;
}