package com.koushik.jokesforyou.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;


@Service
public class FetchJokesServicImpl implements FetchJokesServic{

    ChuckNorrisQuotes chuckNorrisQuotes ;
    
    public FetchJokesServicImpl( ) {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }
    @Override
    public String getJokes() {
        
       
        return chuckNorrisQuotes.getRandomQuote();
    }
    
}
