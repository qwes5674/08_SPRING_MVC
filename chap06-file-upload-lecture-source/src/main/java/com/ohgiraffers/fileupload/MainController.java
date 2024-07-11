package com.ohgiraffers.fileupload;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/*")
@Slf4j //Lombok 에서 제공
public class MainController {

    @GetMapping(value = {"/","main"})
    public String defaultLocation(){

        String name = "홍길동";
        String job = "강사";

        // system.out. -> os의 자원을 쓰기 때문에 성능적인 측면에서 지향한다.
        // System.out.println("메인페이지로 이동합니다.");
        // 중괄호를 통해 입력한 순서에 따라서 변수를 대입한다.
        log.info("저는 {}이구요 {} 이라고합니다.",name,job);


        return "main";
    }
}
