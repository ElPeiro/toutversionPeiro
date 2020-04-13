package com.tout.service;

import com.tout.model.usersEntity;
import com.tout.repository.usersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class usersService implements InterfazService {
    @Autowired
    private usersRepository data;

    @Override
    public List<usersEntity> listar() {
        return (List<usersEntity>) data.findAll();
    }

    @Override
    public Optional<usersEntity> listarId(int id) {
        return Optional.empty();
    }

    @Override
    public int save(usersEntity u) {
        return 0;
    }

    @Override
    public void delete(int id) {

    }
}