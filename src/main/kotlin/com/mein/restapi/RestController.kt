package com.mein.restapi

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class RestController {
    @GetMapping("/article")
    fun getArticles(): List<News>{
        val list: ArrayList<News> = ArrayList()
        list.add(News("abc","date", "source", "art", "pic"))
        list.add(News("lubianka","2020-11-12", "lubianka.pl", "jakiś obrazek", "nie wiem"))
        list.add(News("abc","date", "source", "art", "picture"))
        list.add(News("abcdeed","2020-12-14", "brak", "zdjecie z drona", "picknick"))

        return list
    }
}