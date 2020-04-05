package nestedclass

import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import java.awt.event.WindowEvent
import java.awt.event.WindowListener
import javax.swing.JButton
import javax.swing.JFrame

/*Kotlin方式去實現JFrame*/
fun main() {
    val jFrame = JFrame("My JFrame")
    val jButton = JButton("My JButton")

    jFrame.addWindowListener(object : WindowListener {
        override fun windowDeiconified(p0: WindowEvent?) {

        }

        override fun windowClosing(p0: WindowEvent?) {
            println("windowClosing")
        }

        override fun windowClosed(p0: WindowEvent?) {

        }

        override fun windowActivated(p0: WindowEvent?) {
            println("windowActivated")
        }

        override fun windowDeactivated(p0: WindowEvent?) {

        }

        override fun windowOpened(p0: WindowEvent?) {
            println("windowOpened")
        }

        override fun windowIconified(p0: WindowEvent?) {

        }
    })
    /*
    * 如果對象是Java函數是接口的一個實例(即只擁有一個抽象方法的接口)，
    * 那麼可以通過Lambda表達式來調用,其中Lambda表達式前面加上接口的類型
    * */
//    jButton.addActionListener(object :ActionListener{
//        override fun actionPerformed(p0: ActionEvent?) {
//            println("Button Pressed!")
//        }
//    })
    jButton.addActionListener { println("Button Pressed!") }

    val listener = ActionListener { println("hello world") }
    println(listener.javaClass)
    println(listener.javaClass.superclass)

    println(listener::class.java)
    println(listener::class.java.superclass)

    jFrame.apply {
        add(jButton)
        pack()
        isVisible = true
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    }
}