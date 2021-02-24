import java.text.NumberFormat
import java.util.*

fun main() {
    val harga = 749999
    val poin = 500
    val diskon: Int
    val member: String

    when (poin) {
        in 500..1000 -> {
            member="Platinum"; diskon = 30
        }
        in 300..500 -> {
            member="Gold"; diskon = 15
        }
        in 100..300 -> {
            member="Silver"; diskon = 5
        }
        in 0..100 -> {
            member="Bronze"; diskon = 0
        }
        else -> {
            member="NaN"; diskon= 0
        }
    }
    val totalHarga: String = if (member!="NaN"){
        NumberFormat.getCurrencyInstance(Locale("in", "ID"))
            .format(harga-((harga * diskon)/100))
    } else {
        NumberFormat.getCurrencyInstance(Locale("in", "ID")).format(0)
    }
    println("Member : $member (${poin} point) \n" +
            "Harga : Rp ${NumberFormat.getCurrencyInstance(Locale("in", "ID")).format(harga)} \n"+
            "Diskon : ${diskon}% \nTotal Harga : $totalHarga")
}
