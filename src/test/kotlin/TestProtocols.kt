import org.junit.jupiter.api.Test
import kotlin.system.measureNanoTime

class TestProtocols {

    @Test
    fun testAdderScribble() {
        val elapsed = measureNanoTime {
            adderScribble(
                createAndBindServerSocketChannel()
            )
        }
        println("Adder: ${elapsed / 1_000_000_000}s")
    }

    @Test
    fun testTwoBuyerScribble() {
        val elapsed = measureNanoTime {
            twoBuyerScribble(
                createAndBindServerSocketChannel(),
                createAndBindServerSocketChannel(),
                createAndBindServerSocketChannel(),
            )
        }
        println("TwoBuyer: ${elapsed / 1_000_000_000}s")
    }
}