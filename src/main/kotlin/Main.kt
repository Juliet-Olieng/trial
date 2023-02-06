fun main() {
    var name =arrayOf("Mine", "Yours", "Ours")
    var ages = arrayOf( 34, 37, 54)
    var phoneNumber =arrayOf(720465867, 723564578, 765453213)
    val citizenship = true
    var list1 = arrayOf("student1",name[0],ages[0],phoneNumber[0],!citizenship)
    println(list1.contentToString())
    var list2= arrayOf("student2", name[1],ages[1],phoneNumber[1],citizenship)
    println(list2.contentToString())
    var list3= arrayOf("student3",name[2],ages[2],phoneNumber[2],!citizenship)
    println(list3.contentToString())
}