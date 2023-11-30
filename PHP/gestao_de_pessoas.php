<?php

$servername = "localhost";
$username = "root";
$password = "";
$dbname = "gestao";

$conn = new mysqli($servername, $username, $password, $dbname);

if ($conn->connect_error) {
    die("Conexão falhou: " . $conn->error);
}

$sql = "CREATE TABLE IF NOT EXISTS pessoas (
        id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
        nome VARCHAR(100) NOT NULL,
        idade INT(3) NOT NULL
    );";

    "CREATE TABLE IF NOT EXISTS endereco (
        id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
        rua VARCHAR(255) NOT NULL,
        cidade VARCHAR(100) NOT NULL,
        id_pessoa INT(6) NOT NULL,
        FOREIGN KEY (id_pessoa) REFERENCES pessoas(id)
    );";

     "CREATE TABLE IF NOT EXISTS telefone (
        id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
        numero VARCHAR(20) NOT NULL,
        descricao VARCHAR(255) NOT NULL,
        tipo VARCHAR(50) NOT NULL,
        id_pessoa INT(6) NOT NULL,
        FOREIGN KEY (id_pessoa) REFERENCES pessoas(id)
    );";

  "CREATE TABLE IF NOT EXISTS pedidos (
        id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
        descricao VARCHAR(255) NOT NULL,
        valor DECIMAL(10,2) NOT NULL,
        id_pessoa INT(6) NOT NULL,
        FOREIGN KEY (id_pessoa) REFERENCES pessoas(id)
    );";

if ($conn->multi_query($sql) === TRUE) {
    echo "Tabelas criadas com sucesso";
} else {
    echo "Erro ao criar tabelas: " . $conn->error;
}

$conn->close();
?>
