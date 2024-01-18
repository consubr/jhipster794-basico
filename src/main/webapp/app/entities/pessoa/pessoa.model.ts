export interface IPessoa {
  id: number;
  nome?: string | null;
  idade?: number | null;
  salario?: number | null;
}

export type NewPessoa = Omit<IPessoa, 'id'> & { id: null };
