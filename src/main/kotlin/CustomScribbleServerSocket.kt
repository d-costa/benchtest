import org.scribble.runtime.net.BinaryChannelEndpoint
import org.scribble.runtime.net.ScribServerSocket
import org.scribble.runtime.net.SocketChannelEndpoint
import org.scribble.runtime.session.SessionEndpoint
import java.io.IOException
import java.net.InetSocketAddress
import java.nio.channels.ServerSocketChannel


fun createAndBindServerSocketChannel(): ServerSocketChannel =
    ServerSocketChannel
        .open()
        .bind(InetSocketAddress(0))

/**
 * Pre: [socketChannel] open() and bind()
 *
 */
class CustomScribbleServerSocket(private val socketChannel: ServerSocketChannel) :
    ScribServerSocket(socketChannel.socket().localPort) {

    override fun close() = socketChannel.close()

    override fun accept(se: SessionEndpoint<*, *>?): BinaryChannelEndpoint {
        return SocketChannelEndpoint(se, socketChannel.accept())
    }

}

