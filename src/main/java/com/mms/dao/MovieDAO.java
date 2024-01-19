package com.mms.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.mms.bean.Movie;

public interface MovieDAO extends CrudRepository<Movie, Integer> {

}
