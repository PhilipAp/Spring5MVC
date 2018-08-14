package com.philipap.spring5mvcexample.repository;

import org.springframework.data.repository.CrudRepository;

import com.philipap.spring5mvcexample.model.Widget;

public interface WidgetRepository extends CrudRepository<Widget, Long> {
}
