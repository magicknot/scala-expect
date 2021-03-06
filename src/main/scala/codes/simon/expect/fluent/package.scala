package codes.simon.expect

package object fluent {
  implicit def fluentExpectToCoreExpect[R](expect: Expect[R]): core.Expect[R] = {
    new core.Expect[R](expect.command, expect.defaultValue, expect.expects.map(_.toCoreExpectBlock))
  }
}
