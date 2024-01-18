import { IPessoa, NewPessoa } from './pessoa.model';

export const sampleWithRequiredData: IPessoa = {
  id: 82183,
  nome: 'Rodovia',
  idade: 25,
  salario: 92,
};

export const sampleWithPartialData: IPessoa = {
  id: 86327,
  nome: 'haptic',
  idade: 46,
  salario: 6,
};

export const sampleWithFullData: IPessoa = {
  id: 23059,
  nome: 'indexing',
  idade: 48,
  salario: 89,
};

export const sampleWithNewData: NewPessoa = {
  nome: 'Automotivo',
  idade: 14,
  salario: 70,
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
