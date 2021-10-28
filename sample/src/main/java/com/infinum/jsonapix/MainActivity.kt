package com.infinum.jsonapix

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.infinum.jsonapix.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val person =
            Person(
                name = "Stef",
                surname = "Banek",
                age = 1,
                allMyDogs = listOf(Dog("Bella", 1), Dog("Bongo", 1)),
                myFavoriteDog = Dog("Bella", 1)
            )
        binding.text.text = personTestJsonString.decodeJsonApiXString<Person>().toString()

        binding.textDecoded.text = person.toJsonApiXString().decodeJsonApiXString<Person>()?.name
    }
}