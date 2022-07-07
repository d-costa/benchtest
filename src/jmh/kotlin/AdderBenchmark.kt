package bench

import adderScribble
import createAndBindServerSocketChannel
import org.openjdk.jmh.annotations.*
import java.nio.channels.ServerSocketChannel

@State(Scope.Thread)
open class AdderBenchmark {
    private lateinit var serverSocket: ServerSocketChannel

    @Setup
    open fun prepare() {
        serverSocket = createAndBindServerSocketChannel()
    }

    @TearDown
    open fun tearDown() {
        serverSocket.close()
    }

    @Benchmark
    open fun benchAdderScribble() {
        adderScribble(createAndBindServerSocketChannel())
    }
}