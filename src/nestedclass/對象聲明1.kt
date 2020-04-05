package nestedclass

import java.awt.event.WindowEvent
import java.awt.event.WindowListener

/* 對象聲明 */
object MyObject{
    fun method() = "hello world"
}

object MyObject2:WindowListener {
    override fun windowDeiconified(p0: WindowEvent?) {

    }

    override fun windowClosing(p0: WindowEvent?) {

    }

    override fun windowClosed(p0: WindowEvent?) {

    }

    override fun windowActivated(p0: WindowEvent?) {

    }

    override fun windowDeactivated(p0: WindowEvent?) {

    }

    override fun windowOpened(p0: WindowEvent?) {

    }

    override fun windowIconified(p0: WindowEvent?) {

    }
}

/*
* 關於對象表達式與對象聲明之間的區別
* 1. 對象表達式是立刻初始化或是執行的
* 2. 對象聲明是延遲初始化的，在首次訪問的時候進行
* 3. 伴生對象是在其所對應的類被加載時初始化的，對應Java的靜態初始化
* */

fun main() {
    println(MyObject.method())
}