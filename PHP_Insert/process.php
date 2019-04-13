<?php
         if(isset($_POST["submit"])){
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
            $sql = "INSERT INTO student(rollno,name,dept)VALUES ('".$_POST["rollNo"]."','".$_POST["name"]."','".$_POST["dept"]."')";

            if (mysqli_query($conn, $sql)) {
               header("Location: welc.php");
                exit();
            } else {
               echo "Error: " . $sql . "" . mysqli_error($conn);
            }
            $conn->close();
         }
?>
