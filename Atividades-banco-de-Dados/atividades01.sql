/**Crie a tabela paciente utilizando a sintaxe do SQL, seguindo os padrões estabelecidos:
idPaciente: identificador único do paciente (chave primária, tipo SERIAL);
nomePaciente: nome completo do paciente (tipo VARCHAR(100);
dataNascimentoPaciente: data de nascimento do paciente (tipo DATE);
fonePaciente: telefone para contato (tipo VARCHAR(20)).**/

CREATE TABLE paciente (
    idPaciente SERIAL PRIMARY KEY,
    nomePaciente VARCHAR(100),
    dataNascimentoPaciente DATE,
    fonePaciente VARCHAR(20)
);

/**Insira 5 registros na tabela paciente criada na questão anterior. 
Os dados devem ser fictícios, mas realistas, contendo informações 
completas para todos os campos da tabela:*//

INSERT INTO paciente (nomePaciente, dataNascimentoPaciente, fonePaciente) VALUES
('Lucas Almeida', '1990-05-15', '11987654321'),
('Mariana Silva', '1985-03-22', '21987654321'),
('Carlos Souza', '1978-12-01', '31987654321'),
('Fernanda Costa', '2000-09-10', '41987654321'),
('Bruno Martins', '1995-07-30', '51987654321');

/**Crie a tabela especialidade com os seguintes campos:
idEspecialidade: identificador único da especialidade (chave primária, tipo SERIAL);
nome: nome da especialidade (tipo VARCHAR(100)).**/

CREATE TABLE especialidade (
    idEspecialidade SERIAL PRIMARY KEY,
    nome VARCHAR(100)
);

/**Altere o nome do campo nome da tabela especialidade para nomeEspecialidade:**/

ALTER TABLE especialidade
RENAME COLUMN nome TO nomeEspecialidade;

/**Insira 5 registros na tabela especialidade, preenchendo o campo nomeEspecialidade 
com nomes de especialidades médicas fictícias, porém realistas.**/

INSERT INTO especialidade (nomeEspecialidade) VALUES
('Cardiologia'),
('Pediatria'),
('Ortopedia'),
('Dermatologia'),
('Neurologia');

/**Crie a tabela medico com os seguintes campos:
idMedico: identificador único do médico (chave primária, tipo SERIAL);
nomeMedico: nome completo (tipo VARCHAR(100));
crm: registro do médico (tipo VARCHAR(20);
idEspecialidade: código da especialidade (tipo inteiro, chave estrangeira).**/

CREATE TABLE medico (
    idMedico SERIAL PRIMARY KEY,
    nomeMedico VARCHAR(100),
    crm VARCHAR(20),
    idEspecialidade INTEGER
);

/**Altere o nome do campo idEspecialidade da tabela  para especialidadeId.
Em seguida, adicione uma chave estrangeira no campo especialidadeId, 
referenciando o campo idEspecialidade da tabela especialidade.**/

ALTER TABLE medico
RENAME COLUMN idEspecialidade TO especialidadeId;

ALTER TABLE medico
ADD CONSTRAINT fk_especialidade
FOREIGN KEY (especialidadeId) REFERENCES especialidade(idEspecialidade);

/**Insira 5 médicos na tabela medico com dados fictícios e coerentes, 
associando cada um a uma especialidade existente.**/

INSERT INTO medico (nomeMedico, crm, especialidadeId) VALUES
('Dr. Ana Paula', 'CRM1010', 1),
('Dr. Roberto Lima', 'CRM2020', 2),
('Dra. Julia Mendes', 'CRM3030', 3),
('Dr. Marcelo Rocha', 'CRM4040', 4),
('Dra. Camila Torres', 'CRM5050', 5);

/**Crie a tabela consulta com os seguintes campos:
idConsulta: identificador único (chave primária, SERIAL);
pacienteId: inteiro (chave estrangeira);
medicoId: inteiro (chave estrangeira);
dataConsulta: data e hora (TIMESTAMP);
observacoes: observações do atendimento (tipo TEXT).**/

CREATE TABLE consulta (
    idConsulta SERIAL PRIMARY KEY,
    pacienteId INTEGER,
    medicoId INTEGER,
    dataConsulta TIMESTAMP,
    observacoes TEXT
);

/**Adicione as chaves estrangeiras necessárias na tabela consulta para garantir a integridade 
referencial com as tabelas paciente e medico.**/

ALTER TABLE consulta
ADD CONSTRAINT fk_paciente
FOREIGN KEY (pacienteId) REFERENCES paciente(idPaciente);

ALTER TABLE consulta
ADD CONSTRAINT fk_medico
FOREIGN KEY (medicoId) REFERENCES medico(idMedico);

/**Insira 5 registros na tabela consulta relacionando 
médicos, pacientes e datas fictícias.**/

INSERT INTO consulta (pacienteId, medicoId, dataConsulta, observacoes) VALUES
(1, 1, '2025-04-10 14:00:00', 'Check-up anual'),
(2, 2, '2025-04-11 09:30:00', 'Consulta pediátrica'),
(3, 3, '2025-04-12 11:00:00', 'Dor no joelho'),
(4, 4, '2025-04-13 16:15:00', 'Alergia na pele'),
(5, 5, '2025-04-14 10:45:00', 'Dor de cabeça frequente');

/**Crie a tabela prontuario com os seguintes campos:
idProntuario: identificador único (chave primária, SERIAL);
pacienteId: inteiro (chave estrangeira);
descricao: descrição do prontuário (tipo TEXT);
dataRegistro: data do registro (tipo DATE, valor padrão: data atual).**/

CREATE TABLE prontuario (
    idProntuario SERIAL PRIMARY KEY,
    pacienteId INTEGER REFERENCES paciente(idPaciente),
    descricao TEXT,
    dataRegistro DATE DEFAULT CURRENT_DATE
);

/**Insira 5 registros na tabela prontuario com dados fictícios.**/

INSERT INTO prontuario (pacienteId, descricao) VALUES
(1, 'Paciente apresenta pressão arterial normal.'),
(2, 'Paciente com histórico de bronquite.'),
(3, 'Paciente com lesão no joelho direito.'),
(4, 'Paciente alérgico a frutos do mar.'),
(5, 'Paciente relatou dores de cabeça constantes.');

/**Adicione um novo campo chamado emailPaciente (tipo VARCHAR(100)) na tabela paciente.**/

ALTER TABLE paciente
ADD COLUMN emailPaciente VARCHAR(100);

/**Renomeie o campo fonePaciente da tabela paciente para telefonePaciente.**/

ALTER TABLE paciente
RENAME COLUMN fonePaciente TO telefonePaciente;

/**Exclua o campo dataNascimentoPaciente da tabela paciente.**/

ALTER TABLE paciente
DROP COLUMN dataNascimentoPaciente;

/**Renomeie a tabela medico para medicos.**/

ALTER TABLE medico
RENAME TO medicos;

/**Altere a tabela consulta, adicionando um campo chamado statusConsulta (tipo VARCHAR(20)).**/

ALTER TABLE consulta
ADD COLUMN statusConsulta VARCHAR(20);

/**Analise o seguinte código SQL abaixo e responda se ele está correto. Se estiver incorreto, explique o(s) erro(s) encontrados:

INSERT INTO medico (idMedico, nomeMedico, crm, especialidadeId)
VALUES (1, 'Dr. João Pedro', 'CRM12345');

Pergunta: O código acima está correto? Justifique sua resposta com base na estrutura da tabela medico.**/

O código está incorreto.
Está tentando inserir em 4 colunas (idMedico, nomeMedico, crm, especialidadeId) mas forneceu apenas 3 valores. 
Está faltando o valor para especialidadeId, que não pode ser nulo se for obrigatório.

/**Analise a estrutura do banco de dados criada ao longo dos exercícios desta atividade, considerando as 
tabelas: paciente, especialidade, medico, consulta e prontuario.
Você faria alguma modificação nessa estrutura? Justifique sua 
resposta apontando pontos positivos da modelagem apresentada e 
sugerindo possíveis melhorias, se necessário (como adição ou alteração de tabelas, 
campos, tipos de dados ou relacionamentos).**/

Tornar os e-mails únicos na tabela paciente.