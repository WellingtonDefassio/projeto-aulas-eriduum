package com.example.projeto.aulas.outher.mapper;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;

import java.util.ArrayList;
import java.util.List;

public class DozerMapper {

    private static Mapper mapper = DozerBeanMapperBuilder.buildDefault();

    public static <O, D> D parseObject(O origen, Class<D> destination) {
        return mapper.map(origen, destination);
    }
    public static <O, D> List<D> parseListObjects(List<O> origen, Class<D> destination) {
        List<D> destinationObjects = new ArrayList<D>();
        origen.forEach(p -> {
            destinationObjects.add(mapper.map(p, destination));
        });

        return destinationObjects;
    }

}
