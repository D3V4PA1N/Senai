<?php

$servername = "localhost";
$username = "root";
$password = "";
$dbname = "gestao";

$conn = new mysqli($servername, $username, $password, $dbname);

if ($conn->connect_error) {
    die("Conexão falhou: " . $conn->error);
}

// Criação da tabela usuarios
$sql = "CREATE TABLE IF NOT EXISTS usuarios (
    id_usuario INT AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    PRIMARY KEY (id_usuario)
)";

if ($conn->query($sql) === TRUE) {
    echo "Tabela 'usuarios' criada com sucesso.<br>";
} else {
    echo "Erro ao criar tabela 'usuarios': " . $conn->error;
    exit();
}

// Criação da tabela pedidos
$sql = "CREATE TABLE IF NOT EXISTS pedidos (
    id_pedido INT AUTO_INCREMENT,
    id_usuario INT,
    produto VARCHAR(100) NOT NULL,
    quantidade INT NOT NULL,
    PRIMARY KEY (id_pedido),
    FOREIGN KEY (id_usuario) REFERENCES usuarios(id_usuario)
)";

if ($conn->query($sql) === TRUE) {
    echo "Tabela 'pedidos' criada com sucesso.<br>";
} else {
    echo "Erro ao criar tabela 'pedidos': " . $conn->error;
    exit();
}

// Inserção de um novo usuário
$sql = "INSERT INTO usuarios (nome, email) VALUES ('John Doe', 'john.doe@example.com')";

if ($conn->query($sql) === TRUE) {
    $last_user_id = $conn->insert_id;
    echo "Usuário cadastrado com sucesso. ID: " . $last_user_id . "<br>";
} else {
    echo "Erro ao cadastrar usuário: " . $conn->error;
    exit();
}

// Inserção de um novo pedido associado ao usuário inserido anteriormente
$sql = "INSERT INTO pedidos (id_usuario, produto, quantidade) VALUES ('$last_user_id', 'Produto Exemplo', 1)";

if ($conn->query($sql) === TRUE) {
    echo "Pedido registrado com sucesso.<br>";
} else {
    echo "Erro ao registrar pedido: " . $conn->error;
    exit();
}

$conn->close();
?>
