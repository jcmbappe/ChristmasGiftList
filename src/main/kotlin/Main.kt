import utlis.year
import viewModel.MainViewModel
import java.util.*

fun main(args: Array<String>) {
    MainViewModel().generateList(Calendar.getInstance().year)
}
