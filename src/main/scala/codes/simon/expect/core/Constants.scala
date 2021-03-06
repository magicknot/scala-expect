package codes.simon.expect.core

import java.nio.charset.Charset

import scala.concurrent.duration.DurationInt

object Constants {
  /** How long to wait when reading from the process output. */
  val TIMEOUT = 10.seconds
  /** Which charset to use when decoding text read from the process output. */
  val CHARSET = Charset.forName("UTF-8") //Should we use Charset.defaultCharset() ?
  /** The size of the buffer used to read from the process output */
  val BUFFER_SIZE = 1024
  /** Whether the stdErr should be redirected to stdOut. */
  val REDIRECT_STDERR_TO_STDOUT = true
}
