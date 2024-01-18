package com.mycompany.myapp.service;

import com.mycompany.myapp.service.dto.PessoaDTO;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Service Interface for managing {@link com.mycompany.myapp.domain.Pessoa}.
 */
public interface PessoaService {
    /**
     * Save a pessoa.
     *
     * @param pessoaDTO the entity to save.
     * @return the persisted entity.
     */
    PessoaDTO save(PessoaDTO pessoaDTO);

    /**
     * Updates a pessoa.
     *
     * @param pessoaDTO the entity to update.
     * @return the persisted entity.
     */
    PessoaDTO update(PessoaDTO pessoaDTO);

    /**
     * Partially updates a pessoa.
     *
     * @param pessoaDTO the entity to update partially.
     * @return the persisted entity.
     */
    Optional<PessoaDTO> partialUpdate(PessoaDTO pessoaDTO);

    /**
     * Get all the pessoas.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    Page<PessoaDTO> findAll(Pageable pageable);

    /**
     * Get the "id" pessoa.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<PessoaDTO> findOne(Long id);

    /**
     * Delete the "id" pessoa.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
