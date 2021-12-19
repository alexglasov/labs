package laba7.dao;

import java.util.List;

public interface CrudDao<TKey, TEntry> {
    TEntry findById(TKey id);

    void save(TEntry entity);

    void update(TEntry entity);

    void delete(TEntry entity);

    List<TEntry> findAll();
}
