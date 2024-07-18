package com.sneakers.urbnkicks

class UserData(val uid : String?, val user_name : String?, val email : String?, val password : String?) {
    constructor() : this("","", "", "")
}