import scala.swing._
import scala.swing.event._

object BmiCalculator extends SimpleSwingApplication {
  override def main(args: Array[String]) = super.main(args)

    def calcBMI(weight: Double, height: Double): Double = {
      require(weight > 0 && height > 0)
      val bmi = (weight)/ (height*height)
      return bmi
    }

	def top = new MainFrame {
	  preferredSize = new Dimension(700, 200)
	  title = "BMI Calculator"
	  val button = new Button {
        text = "Click me to calc"
    }

	val label = new Label { text = " no bmi value yet"}

	object weight extends TextField {columns = 7}
	object height extends TextField {columns = 7}

	contents = new FlowPanel {
	  contents += weight
	  contents += new Label("weight(kg)")
	  contents += height
	  contents += new Label("height(metres)")
	  contents += label
	  contents += button
	  border = Swing.EmptyBorder(40,20,20,20)
	}

	listenTo(weight, height,button)
 
	reactions += {
	  case ButtonClicked(b) =>
	    val w = weight.text.toDouble
	    val h = height.text.toDouble
	    val nubmi = calcBMI(w,h)
	    label.text = "*** BMI = " + nubmi + "***"
   
    }
  }
}
