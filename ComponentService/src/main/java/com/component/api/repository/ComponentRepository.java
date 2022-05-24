package com.component.api.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.component.api.entity.Components;

public interface ComponentRepository extends JpaRepository<Components, String> {


}
