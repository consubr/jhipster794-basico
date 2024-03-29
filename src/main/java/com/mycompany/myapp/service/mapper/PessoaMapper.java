package com.mycompany.myapp.service.mapper;

import com.mycompany.myapp.domain.Pessoa;
import com.mycompany.myapp.service.dto.PessoaDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Pessoa} and its DTO {@link PessoaDTO}.
 */
@Mapper(componentModel = "spring")
public interface PessoaMapper extends EntityMapper<PessoaDTO, Pessoa> {}
