package com.example.myapplicationbtn

class Pet {
    var health: Int = 0
    var hunger: Int = 0
    var Dirty: Int = 0




    fun feed() {
        hunger -= 10
        health += 10
        Dirty +=10
        if (hunger < 0) hunger = 0
    }

    fun clean() {
        Dirty -= 10
        hunger += 10
        health += 10
        if (Dirty < 0) Dirty = 0
    }

    fun play() {
        hunger += 10
        health -= 10
        Dirty +=10
        if (hunger > 100) hunger = 100
    }





    fun decreaseHealth() {
        health -= 20
        if (health < 0) health = 0
    }

    fun increaseBoredom() {
        hunger += 20
        if (hunger > 100) hunger = 100
    }

    fun inceaseDirtyness() {
        Dirty -= 20
        if (Dirty > 100) Dirty = 100
    }


}