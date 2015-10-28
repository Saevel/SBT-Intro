
import org.scalacheck.Prop._
import org.scalacheck.Properties
import org.scalacheck._

class SampleTestTwo extends Properties("Modulo"){

  val smallIntegers = Gen.choose(0, 100)

  property("always nonnegative") = forAll(smallIntegers)({(a:Int) => {
      Math.abs(a) >= 0
    }
  })
}
