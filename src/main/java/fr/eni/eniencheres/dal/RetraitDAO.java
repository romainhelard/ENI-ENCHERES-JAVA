package fr.eni.eniencheres.dal;

import fr.eni.eniencheres.bo.Retrait;

import java.util.List;

public interface RetraitDAO {

    void insert(Retrait retrait)throws DALException;

    Retrait selectRetrait(int id) throws  DALException;

    List selectAll() throws DALException;

    void delete(Integer id) throws DALException;

    void update(Retrait retrait) throws DALException;




}