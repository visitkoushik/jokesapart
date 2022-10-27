package com.koushik.jokesforyou.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.koushik.jokesforyou.services.FetchJokesServic;

@Controller
public class FetchJokesControler {

    private final FetchJokesServic fetchJokesServic;

    public FetchJokesControler(FetchJokesServic fetchJokesServic) {
        this.fetchJokesServic = fetchJokesServic;
    }



    @RequestMapping({"/",""})
    public String showJokes(Model model){
        model.addAttribute("jokes", this.fetchJokesServic.getJokes());
        return "index";
    }

    public String getJokeQute(){
       return  this.fetchJokesServic.getJokes();
        
    }
}
