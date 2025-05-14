/**Crie as seguintes tabelas utilizando a linguagem SQL:
Tabela aluno
idAluno: SERIAL, chave primária
nomeAluno: VARCHAR(100)
emailAluno: VARCHAR(100)
dataNascimentoAluno: DATE
situacaoAluno: VARCHAR(10)

Tabela curso
idCurso: SERIAL, chave primária
nomeCurso: VARCHAR(100)
cargaHorariaCurso: INTEGER

Tabela professor
idProfessor: SERIAL, chave primária
nomeProfessor: VARCHAR(100)
emailProfessor: VARCHAR(100)
formacaoProfessor: VARCHAR(100)

Tabela matricula
idMatricula: SERIAL, chave primária
alunoId: INTEGER
cursoId: INTEGER
dataMatricula: DATE
statusMatricula: VARCHAR(20)
Adicione as chaves estrangeiras necessárias nas tabelas matricula e disciplina*/

CREATE TABLE aluno (
  idAluno SERIAL PRIMARY KEY,
  nomeAluno VARCHAR(100),
  emailAluno VARCHAR(100),
  dataNascimentoAluno DATE,
  situacaoAluno VARCHAR(10)
);

CREATE TABLE curso (
  idCurso SERIAL PRIMARY KEY,
  nomeCurso VARCHAR(100),
  cargaHorariaCurso INTEGER
);

CREATE TABLE professor (
  idProfessor SERIAL PRIMARY KEY,
  nomeProfessor VARCHAR(100),
  emailProfessor VARCHAR(100),
  formacaoProfessor VARCHAR(100)
);

CREATE TABLE matricula (
  idMatricula SERIAL PRIMARY KEY,
  alunoId INTEGER REFERENCES aluno(idAluno),
  cursoId INTEGER REFERENCES curso(idCurso),
  dataMatricula DATE,
  statusMatricula VARCHAR(20)
);

/**Insira dados fictícios e coerentes:
3 registros na tabela aluno
2 registros na tabela curso
3 registros na tabela professor
5 registros na tabela matricula, com diferentes status de matrícula (ex: Ativa, Concluída, Trancada)*/

INSERT INTO aluno (nomeAluno, emailAluno, dataNascimentoAluno, situacaoAluno) VALUES
('Ana Silva', 'ana@email.com', '2000-03-15', 'Ativo'),
('Bruno Lima', 'bruno@email.com', '1999-07-22', 'Inativo'),
('Carla Souza', 'carla@email.com', '2001-11-05', 'Ativo');

INSERT INTO curso (nomeCurso, cargaHorariaCurso) VALUES
('Desenvolvimento Web', 200),
('Banco de Dados', 150);

INSERT INTO professor (nomeProfessor, emailProfessor, formacaoProfessor) VALUES
('João Pereira', 'joao@prof.com', 'Mestre em Computação'),
('Maria Oliveira', 'maria@prof.com', 'Doutora em Sistemas'),
('Lucas Costa', 'lucas@prof.com', 'Especialista em Banco de Dados');

INSERT INTO matricula (alunoId, cursoId, dataMatricula, statusMatricula) VALUES
(1, 1, '2024-01-10', 'Ativa'),
(2, 2, '2023-10-05', 'Trancada'),
(3, 1, '2024-02-15', 'Concluída'),
(1, 2, '2024-03-12', 'Ativa'),
(3, 2, '2023-12-01', 'Cancelada');

/**Faça as seguintes alterações na estrutura do banco de dados:

Adicione o campo cpfAluno (tipo VARCHAR(14)) na tabela aluno, com restrição de unicidade.
Renomeie o campo situacaoAluno para ativoAluno.*/

ALTER TABLE aluno ADD COLUMN cpfAluno VARCHAR(14) UNIQUE;

ALTER TABLE aluno RENAME COLUMN situacaoAluno TO ativoAluno;

/**Crie a tabela disciplina com os seguintes campos:
idDisciplina: SERIAL, chave primária
nomeDisciplina: VARCHAR(100)
cargaHorariaDisciplina: INTEGER
cursoId: INTEGER, chave estrangeira*/

CREATE TABLE disciplina (
  idDisciplina SERIAL PRIMARY KEY,
  nomeDisciplina VARCHAR(100),
  cargaHorariaDisciplina INTEGER,
  cursoId INTEGER REFERENCES curso(idCurso)
);

/**Em seguida, crie a tabela disciplina_professor para representar o relacionamento muitos-para-muitos entre professores e disciplinas, com:
disciplinaId: INTEGER, chave estrangeira
professorId: INTEGER, chave estrangeira
Garanta que a chave primária da tabela disciplina_professor seja composta pelos dois campos e que haja integridade referencial.*/

CREATE TABLE disciplina_professor (
  disciplinaId INTEGER REFERENCES disciplina(idDisciplina),
  professorId INTEGER REFERENCES professor(idProfessor),
  PRIMARY KEY (disciplinaId, professorId)
);

