<html>
<head>
<style type="text/css">
#bodycontent label { padding-right:20px }
h1 {text-align: center;color: green}
input {
  font-size: 16px;
  font-size: max(16px, 1em);
  font-family: inherit;
  padding: 0.25em 0.5em;
  background-color: #fff;
  border: 2px solid var(--input-border);
  border-radius: 4px;
}
</style>
</head>
<body style="background-color:powderblue;">
<h1>Online form submission</h1>
<form action="/" modelAttribute="onlineform" method="post">
  <label for="lname">Name:</label>
  <input type="text" id="lname" name="name"><br><br>
  <label for="email">Email:</label>
  <input type="email" id="email" name="email"><br><br>
  
  <label for="phone"> phone number:</label>
  <input type="tel" id="phone" name="phone"><br><br>
  <label for="start"> date:</label>

   <input type="date" id="dob" name="dob" placeholder="YYYY-MM-DD"><br><br>
       
   <label for="Gender"> Gender:</label><br>
   <input type="radio" id="html" name="Gender" value="male">
	<label for="html">Male</label><br>
	<input type="radio" id="css" name="Gender" value="Female">
	<label for="css">Female</label><br>
	<input type="radio" id="javascript" name="Gender" value="others">
	<label for="javascript">Better not say</label><br>
   
   <label for="subject">Subject:</label>

<select name="subject" id="subject">
  <option value="java">JAVA</option>
  <option value="dbms">DBMS</option>
  <option value="ds">DS</option>
  <option value="algo">ALGO</option>
</select>
<br><br>
   
  
  <label for="material"> Materials:</label><br>
  <label for="video"> video</label><br>
  <input type="checkbox" id="material" name="material" value="video"><br>
   <label for="doc"> Documents</label><br>
  <input type="checkbox" id="material" name="material" value="documents"><br>
   <label for="vehicle3"> Liveclass</label><br>
  <input type="checkbox" id="material" name="material" value="Liveclass"><br>
  
  <label for="address"> Address:</label><br>
    <label for="pin"> PIN:</label>
    <input type="number" id="pin" name="pin"><br><br>
    <label for="street"> street:</label>
    <input type="text" id="street" name="street"><br><br>
    <label for="location"> Location:</label>
    <input type="text" id="location" name="location"><br><br>
  
  
  <input type="submit" value="Submit">
</form>
</body>
</html>