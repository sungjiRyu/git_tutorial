package com.greenart.spring_test;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.greenart.spring_test.data.UserVO;
import org.springframework.ui.Model;
import jakarta.servlet.http.HttpSession;

@Controller
public class MainController {
    // http://localhost:8989/
    @GetMapping("/")
    public String getMain(Model model, HttpSession session){
        model.addAttribute("data," , "안녕");
        session.setAttribute("greet", "Welcome");
        return "/index"; // WEB-INF/views/index.jsp
    }

    @GetMapping("/index")
    public String getMain2(){
        return "/index";
    }

    @GetMapping("/greet")
    public String getGreet(){
        return "/greet";
    }

    @GetMapping("/login")
    public String getLogin() {
        return "/login";
    }

    @PostMapping("/login")
    public String postLogin(UserVO data, /*Model model*/ HttpSession session){
        if(data.getId().equals("user") && data.getPwd().equals("1234")){
            // 로그인 성공
            // model.addAttribute("loginMessage", "로그인 되었습니다.");
            session.setAttribute("loginMessage", "로그인 되었습니다.");
            data.setName("사용자");
            session.setAttribute("loginUser", data);
            return "redirect:/"; // 세션 작동키기 위해
            // 주소창의 요청 경로를 / 로 설정
        }
        else{
            // 로그인 실패
            session.setAttribute("loginMessage", "아이디 또는 비밀번호 오류입니다.");
            // model.addAttribute("loginMessage", "아이디 또는 비밀번호 오류입니다.");
            return "/login";
            // WEB-INF/views/login.jsp 를 불러옴(파일을 가져옴)
        }
    }

    @GetMapping("/index")
    public String getIndex(){
        return "/index";
    }
}
