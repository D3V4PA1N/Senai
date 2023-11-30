<form action="formulario.php" method="post">
    Nome : <input type="text" name="nome"><br>
    E-mail : <input type="text" name="email"><br>
    <input type="submit" value="Enviar">
</form>

<?php

$nome = $_POST['nome'];
$email = $_POST['email'];

echo "Obrigado por enviar, $nome! Seu e-mail é $email.";
?>



