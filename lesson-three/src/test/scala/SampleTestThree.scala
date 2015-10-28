
import org.scalacheck.Prop._
import org.scalacheck.Properties

class SampleTestThree extends Properties("String collation"){

  property("collation") = forAll {(s1:String, s2:String) => {
      (s1 + s2).endsWith(s2);
    }
  }
}
