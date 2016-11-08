<?php
$driver = 'mysql';
$database = "dbname=CODINGGROUND";
$dsn = "$driver:host=localhost;unix_socket=/home/cg/mysql/mysql.sock;$database";

$username = 'root';
$password = 'root';

try {
   $conn = new PDO($dsn, $username, $password);
   echo "<h2>Database CODINGGROUND Connected<h2>";
}catch(PDOException $e){
   echo "<h1>" . $e->getMessage() . "</h1>";
}
$sql = 'SELECT  * FROM users';
$stmt = $conn->prepare($sql);
$stmt->execute();

echo "<table style='width:100%'>";
while($row = $stmt->fetch(PDO::FETCH_ASSOC)){
  echo "<tr>";
  foreach($row as $value)
  {
    echo sprintf("<td>%s</td>", $value);
  }
  echo "</tr>";
}
echo "</table>";
?>
