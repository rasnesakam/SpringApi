package com.springApi.foo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/foos")
public class FooController {

    @GetMapping
    public List<Foo> getAll(){
        return List.of(new Foo("asşld"),new Foo("asd"));
    }
}
