package com.hari.jpa1.entity.hexagonal_arch_entity.domain_interface;

public interface ModelInterface {//created from DTO class
    //fields / getter
    Integer getId();

    String getName();

    //business logic / setter
    void setId(Integer id);

    void setName(String name);
}
