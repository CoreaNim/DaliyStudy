package chapter3

/**
 * Created by kws on 2017. 11. 20..
 */
class User(val id: Int, val name:String, val address: String)

fun User.validateBeforeSave(){
    fun validate(value: String, fieldName: String){
        if(value.isEmpty()){
            throw IllegalArgumentException("Cant`t save user $id: empty $fieldName")
        }
    }
    validate(name, "Name")
    validate(address, "Address")
}


fun saveUser(user: User){
    user.validateBeforeSave()
}
