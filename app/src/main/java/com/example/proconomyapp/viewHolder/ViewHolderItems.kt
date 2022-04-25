package com.example.proconomyapp.viewHolder

sealed class ViewHolderItems {

    data class Service(
        val title:String,
        val services: List<oneService>
    ) : ViewHolderItems()

    class oneService(
        val subti1:String,
        val subti2:String
    ) : ViewHolderItems()

    class otherService(
        val ser:String
    ) : ViewHolderItems()


    class mentor(
        val nameTitle:String,
        val availability:String,
        val cost:String,
        val rating:Int,
        val description:String,
        val numRates:String,
        val online:Boolean

    ) : ViewHolderItems()
    object Search:ViewHolderItems()
    object otherfield:ViewHolderItems()
}