package com.example.cinema.services;

import com.example.cinema.models.Movie;
import com.example.cinema.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }

    public Optional<Movie> getMovieById(Integer id){
        return movieRepository.findById(id);
    }

    //savemovie?会用到嘛--应该改成postmovies之类的
    public Movie saveMovie(Movie movie){
        movieRepository.save(movie);
        return movie;
    }

}
