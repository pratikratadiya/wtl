<?php
$servername = "localhost:3306";
$username = "root";
$password = "pratik123";
$dbname = "student";

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);
// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
} 

$sql = "SELECT rollno, name, dept FROM student";
$result = $conn->query($sql);

if ($result->num_rows > 0) {
    // output data of each row
    while($row = $result->fetch_assoc()) {
        echo "id: " . $row["rollno"]. " - Name: " . $row["name"]. " " . $row["dept"]. "<br>";
    }
} else {
    echo "0 results";
}
$conn->close();
?>
