<html>
 <head>
  <title></title>
 </head>
 <body>
<?php
if (isset($_REQUEST['ok'])) {
 $xml = new DOMDocument("1.0","UTF-8");
 $xml->load("a.xml");
 $xml->formatOutput = true;
$xml->preserveWhiteSpace = true;
 $rootTag = $xml->getElementsByTagName("userinfo")->item(0);
 
 $dataTag = $xml->createElement("user");


 $aTag = $xml->createElement("name",$_REQUEST['name']);
 $bTag = $xml->createElement("address",$_REQUEST['add']);
 $gTag = $xml->createElement("gender",$_REQUEST['sex']);

 $dataTag->appendChild($aTag);
 $dataTag->appendChild($bTag);
 $dataTag->appendChild($gTag);

 $langTag = $xml->createElement("languages");
 $dataTag->appendChild($langTag);

 $lang = $_REQUEST['lang'];
 foreach ($lang as $l){
  $lTag = $xml->createElement("language",$l);
  $langTag->appendChild($lTag);
 }
 
 $rootTag->appendChild($dataTag);
 
 $xml->save("a.xml");
}
?>


<form action="test.php" method="post">
 Name:<input type="text" name="name" /><br>
Address: <input type="text" name="add" /><br>
Gender:<input type="radio" name="sex" value="Male">Male<input type="radio" name="sex" value="Female">Female<br>
Languages known:<br><input type="checkbox" name="lang[]" id="color" value="C">C
<input type="checkbox" name="lang[]" id="lang" value="Cpp">Cpp
<input type="checkbox" name="lang[]" id="lang" value="Python">Python
 <input type="submit" name="ok">
<input type="reset">
</form>


 </body>
</html>﻿
