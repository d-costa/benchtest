package bench

import createAndBindServerSocketChannel
import org.openjdk.jmh.annotations.*
import twoBuyerScribble
import java.nio.channels.ServerSocketChannel

@State(Scope.Thread)
open class TwoBuyerBenchmark {

    private lateinit var sellerSocketChannelA: ServerSocketChannel
    private lateinit var sellerSocketChannelB: ServerSocketChannel
    private lateinit var bSocketChannel: ServerSocketChannel

    @Setup
    open fun prepare() {
        sellerSocketChannelA = createAndBindServerSocketChannel()
        sellerSocketChannelB = createAndBindServerSocketChannel()
        bSocketChannel = createAndBindServerSocketChannel()
    }

    @TearDown
    open fun tearDown() {
        sellerSocketChannelA.close()
        sellerSocketChannelB.close()
        bSocketChannel.close()
    }
    @Benchmark
    open fun benchTwoBuyerScribble() {
        twoBuyerScribble(
            sellerSocketChannelA,
            sellerSocketChannelB,
            bSocketChannel
        )
    }
}