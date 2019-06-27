package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class DiceController {
    public String roll(){
        return "dice/dice-roll";
    }

    @GetMapping("/roll-dice/{guess}")
    public String guess(@PathVariable int guess, Model model){
        int rand = getRandInt();
        model.addAttribute("roll", rand)
                .addAttribute("guess",guess)
                .addAttribute("result", rand == guess);
        return "dice/dice-results";
    }

    public int getRandInt(){
        double randDoub = Math.random();
        randDoub = randDoub * 6 +1;
        int randInt = (int) randDoub;
        return randInt;
    }
}
