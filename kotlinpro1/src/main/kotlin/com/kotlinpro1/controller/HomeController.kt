package com.kotlinpro1.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam

class HomeController {

    // root url로 접속했을 때 "Hello World!" 문구를 볼 수 있다. (기본 port 번호는 8080)
    @GetMapping("")
    fun printHelloWorld() = "Hello, World!"

    /*
    GetMapping에 /introduce를 넣어줌으로써 해당 라우터를 만들 수 있다.
    "localhost:8080/introduce"로 접속하면 해당 문구를 확인할 수 있다.
     */
    @GetMapping("/introduce")
    fun printMySelf() = "저는 오태훈이고 백엔드 개발자 입니다."

    // url에 값을 param에 추가할 수도 있다. {name} 자리에 들어가는 값으로 받아온다
    @GetMapping("/introduce/{name}")
    fun printName(
            @PathVariable("name") name: String
    ) = "이름 : $name"

    // 쿼리를 통해 url의 param으로 값을 넘겨줄 수 있다. 쿼리는 ?로 시작하여 사용한다. (/introduce-param?name=<값>&age=<값>)
    @GetMapping("introduce-param")
    fun printByQuery(
        @RequestParam("age") age: Int,
        @RequestParam("name") name: String
    ) = "이름: $name, 나이: $age"


    /**
     * 1. Path
     * 2. Query
     * 3. RequestBody -> POST, PUT, DELETE
     */

}