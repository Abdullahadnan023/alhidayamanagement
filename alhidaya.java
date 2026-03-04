<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>AL HIDAYA MANAGEMENT | Gulf Visa & Recruitment</title>

<style>
:root{
  --bg:#0b1220;
  --card:#111a2e;
  --text:#ffffff;
  --muted:#aab5d6;
  --accent:#4f8cff;
  --green:#22c55e;
}

*{margin:0;padding:0;box-sizing:border-box;}
body{
  font-family: Arial, sans-serif;
  background:var(--bg);
  color:var(--text);
  line-height:1.6;
}
.container{width:90%;max-width:1100px;margin:auto;}

header{
  background:#0e1628;
  padding:20px 0;
  text-align:center;
}
.logo h1{
  font-size:48px;
  background:linear-gradient(45deg,var(--accent),var(--green));
  -webkit-background-clip:text;
  -webkit-text-fill-color:transparent;
}
.logo p{
  font-size:18px;
  letter-spacing:2px;
}

section{padding:50px 0;}

h2{
  margin-bottom:20px;
  font-size:28px;
  border-bottom:2px solid var(--accent);
  display:inline-block;
  padding-bottom:5px;
}

/* Services */
.services-grid{
  display:grid;
  grid-template-columns:repeat(auto-fit,minmax(250px,1fr));
  gap:20px;
}
.card{
  background:var(--card);
  padding:20px;
  border-radius:10px;
}
.card ul{
  padding-left:18px;
  color:var(--muted);
}

/* Contact */
form{
  background:var(--card);
  padding:25px;
  border-radius:10px;
  max-width:500px;
}
input, textarea{
  width:100%;
  padding:10px;
  margin:10px 0;
  border:none;
  border-radius:5px;
}
button{
  padding:10px 20px;
  background:var(--accent);
  color:white;
  border:none;
  border-radius:5px;
  cursor:pointer;
}
button:hover{
  background:var(--green);
}

footer{
  text-align:center;
  padding:20px;
  background:#0e1628;
  margin-top:30px;
}
</style>
</head>
<body>

<header>
  <div class="logo">
    <h1>AH</h1>
    <p>AL HIDAYA MANAGEMENT</p>
  </div>
</header>

<section class="container">
  <h2>About Us</h2>
  <p>AL HIDAYA MANAGEMENT provides professional Gulf visa services and manpower recruitment for white and blue category jobs. We ensure selection as per company requirements with reliable support.</p>
</section>

<section class="container">
  <h2>Our Services</h2>
  <div class="services-grid">

    <div class="card">
      <h3>Construction & Technical Trades</h3>
      <ul>
        <li>Electrician</li>
        <li>AC / HVAC Technician</li>
        <li>Plumber</li>
        <li>Welder / Fabricator</li>
        <li>Mason / Steel Fixer</li>
      </ul>
    </div>

    <div class="card">
      <h3>Furniture & Interior Trades</h3>
      <ul>
        <li>Furniture Carpenter</li>
        <li>Aluminium Fabricator</li>
        <li>Glass Cutter</li>
        <li>Sofa Maker</li>
      </ul>
    </div>

    <div class="card">
      <h3>Mechanical & Operators</h3>
      <ul>
        <li>Diesel Mechanic</li>
        <li>Heavy Equipment Technician</li>
        <li>Excavator Operator</li>
        <li>Forklift Operator</li>
      </ul>
    </div>

  </div>
</section>

<section class="container">
  <h2>Contact Us</h2>
  <form>
    <input type="text" placeholder="Your Name">
    <input type="email" placeholder="Your Email">
    <input type="text" placeholder="Phone Number">
    <textarea rows="4" placeholder="Your Message"></textarea>
    <button type="submit">Send Message</button>
  </form>
</section>

<footer>
  <p>Trusted Gulf Visa & Recruitment Services</p>
  <p>Contact: 8853979030 / 8917825949</p>
</footer>

</body>
</html>