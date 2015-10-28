import org.scalacheck.Prop._
import org.scalacheck.Properties

/**
 * Created by kowczarek on 2015-10-27.
 */
class SampleTest extends Properties("Equality") {

  property("reversible") = forAll { (a:Int, b:Int) => {
      if(a == b) {
        b == a
      }
      else {
        b != a
      }
    }
  }

}
