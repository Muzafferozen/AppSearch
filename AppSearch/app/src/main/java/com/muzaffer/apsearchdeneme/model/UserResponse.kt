package com.muzaffer.apsearchdeneme.model
import com.muzaffer.apsearchdeneme.model.User
import com.google.gson.annotations.SerializedName

data class UserResponse(
    val items: ArrayList<User>
)
