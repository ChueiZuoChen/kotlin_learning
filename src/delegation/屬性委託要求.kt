package delegation

/*
*   關於屬性委託的要求:
*
*   1. 對於只讀屬性來說(val) 委託需要提供一個名為 getValue的方法，該方法接收如下參數：
*   - thisRef, 需要是屬性擁有者相同的類型或是其父類型(對於擴展屬性來說,這個類型指的是被擴展的那個類型)
*   - property, 需要是KProperty<*>類型或是其父類型
*   getValue方法需要返回與屬性相同的類型或是其“子類型”
*
*   2. 對於可變屬性來說(var) 委託需要再提供一個名為setValue的方法，該方法接收如下參數：
*   - thisRef, 與getValue方法要求一致
*   - property, 與getValue方法要求一致
*   - new value, 需要與屬性的類型相同或是其父類型
*
*   getValue與setValue方法既可以作為委託類的成員方法實現，也可以作為其擴展方法(extension)來實現
*
*   這兩個方法都必須要標記為operator關鍵字，對於委託類來說，他可以實現ReadOnlyProperty或是ReadWriteProperty接口，
*   這些接口包含了相應的getValue與setValue方法; 同時，對於委託類來說，也可以不去實現這兩個接口，而是自己單獨實現相應的
*   getValue與setValue方法
*
*   委託轉換規則：
*   對於每個委託屬性來說，Kotlin編譯器在底層會生成一個輔助的屬性然後將對原有屬性的訪問委託給這個輔助屬性
*   比如說，對於屬性prop來說，Kotlin編譯器所生成的隱含的屬性名為prop$delegate的屬性,
*   然後對原有的prop屬性的訪問器的訪問都只是委託給了這個額外的Kotlin編譯器所產生的輔助屬性
* */