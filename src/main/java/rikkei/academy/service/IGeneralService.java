package rikkei.academy.service;

public interface IGeneralService<T> {
    Iterable<T> findAll();

    T findById(Long id);

    void save(T t);

    void remove(Long id);
}
