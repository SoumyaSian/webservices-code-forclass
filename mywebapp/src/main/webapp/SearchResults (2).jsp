<%@page import="com.dyasha.mywebapp.entity.ip.data.InternetAddress"%>
<%@page import="com.dyasha.mywebapp.entity.weather.data.WeatherDetails"%>
<%@page import="com.dyasha.mywebapp.entity.google.data.GeocodeResponse"%>
<html>
<head>

<link href="css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body {
	padding-top: 50px;
}

/*
 * Global add-ons
 */
.sub-header {
	padding-bottom: 10px;
	border-bottom: 1px solid #eee;
}

/*
 * Top navigation
 * Hide default border to remove 1px line.
 */
.navbar-fixed-top {
	border: 0;
}

/*
 * Sidebar
 */

/* Hide for mobile, show later */
.sidebar {
	display: none;
}

@media ( min-width : 768px) {
	.sidebar {
		position: fixed;
		top: 51px;
		bottom: 0;
		left: 0;
		z-index: 1000;
		display: block;
		padding: 20px;
		overflow-x: hidden;
		overflow-y: auto;
		/* Scrollable contents if viewport is shorter than content. */
		background-color: #f5f5f5;
		border-right: 1px solid #eee;
	}
}

/* Sidebar navigation */
.nav-sidebar {
	margin-right: -21px; /* 20px padding + 1px border */
	margin-bottom: 20px;
	margin-left: -20px;
}

.nav-sidebar>li>a {
	padding-right: 20px;
	padding-left: 20px;
}
/*.nav-sidebar > .active > a,
.nav-sidebar > .active > a:hover,
.nav-sidebar > .active > a:focus {
  color: #fff;
  background-color: #428bca;
}*/

/*
 * Main content
 */
.main {
	padding: 20px;
}

@media ( min-width : 768px) {
	.main {
		padding-right: 40px;
		padding-left: 40px;
	}
}

.main .page-header {
	margin-top: 0;
}

/*
 * Placeholder dashboard ideas
 */
.placeholders {
	margin-bottom: 30px;
	text-align: center;
}

.placeholders h4 {
	margin-bottom: 0;
}

.placeholder {
	margin-bottom: 20px;
}

.placeholder img {
	display: inline-block;
	border-radius: 50%;
}

.mbr-map {
	width: 100%;
	height: 500px;
	position: relative;
}

.mbr-map iframe {
	width: 100%;
	height: 200px;
	display: block;
	pointer-events: none;
	position: relative;
}
</style>


</head>
<body>
	<nav class="navbar navbar-inverse navbar-fixed-top" id="my-navbar">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#navbar-collapse">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>

				<a href="" class="navbar-brand">DyaSha</a>

			</div>
			<!-- Navbar header -->

			<div class="collapse navbar-collapse" id="navbar-collapse">
				<ul class="nav navbar-nav pull-right">
					<li><a href="#home">Home</a></li>
					<li><a href="#About">Services</a></li>
					<li><a href="#Services">API Documentation</a></li>
					<li><a href="#About">About Us</a></li>
					<li><a href="#About">Contact Us</a></li>
				</ul>

			</div>
		</div>
		<!-- End of Container -->

	</nav>
	<!-- End navbar -->
	<%-- Search Results : <%= request.getAttribute("result") %> --%>
	<% 
	GeocodeResponse googleResp = (GeocodeResponse)request.getAttribute("geocodeData");
	WeatherDetails weatherResp = (WeatherDetails)request.getAttribute("weatherData");
	InternetAddress geoipResp = (InternetAddress)request.getAttribute("geoipData");
	%>
	<BR>
	<BR>
	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-5 col-md-4 sidebar">
				<form>
					<label for="usr">SMS these details:</label> <br> <input
						class="form-control" type="number" name="phoneno" placeholder="Enter Phone Number"> <br>
					<button type="button" class="btn btn-primary">
						Send to Your Phone &nbsp<i class="fa fa-external-link"></i>
					</button>
				</form>
				<br>
			</div>
		</div>

		<div class="col-sm-7 col-sm-offset-5 col-md-8 col-md-offset-4 main">


			<div class="row">
				<div class="col-lg-4">
					<div class="panel panel-default">
						<div class="panel-body">
							<h4>Destination Details</h4>
							<p>Location Name : <%=googleResp.getAddress_components0_long_name() %></p>
							<p>Full Address : <BR><%=googleResp.getFormatted_address()%></p>
							<p>Latitude : <%=googleResp.getGeometry_bounds_location_lat() %></p>
							<p>Longitude : <%=googleResp.getGeometry_bounds_location_lng()%></p>
						</div> 
					</div>
				</div>

				<div class="col-lg-4">
					<div class="panel panel-default">
						<div class="panel-body">
							<h4>Destination Weather Details</h4>
							<p>Sun Rise : <%= weatherResp.getSys_sunrise() %></p>
						</div>
					</div>
				</div>
				<div class="col-lg-4">
					<div class="panel panel-default">
						<div class="panel-body">
							<h4>Present Location Details</h4>
							<p><%=geoipResp.getLatitude() %></p>
							<p><%=geoipResp.getLongitude() %></p>
						</div>
					</div>
				</div>
			</div>
			<h1 class="page-header">Destination Location Map</h1>
			<div class="row ">
				<div class="mbr-map">

					<jsp:include page="LocationMap.jsp" />

				</div>
			</div>
			<br>
			<!--    <div class="row">
    <div class="col-lg-4">
      <div class="panel panel-default">
        <div class="panel-body">
          <h4>GeoResp</h4>
          <p><%=googleResp.getAddress_components0_long_name() %></p>
        </div>
      </div>
    </div>
    
    <div class="col-lg-4">
      <div class="panel panel-default">
        <div class="panel-body">
          <h4>WeatherResp</h4>
          <p><%= weatherResp.getMain_humidity() %></p>
        </div>
      </div>
    </div>
     <div class="col-lg-4">
      <div class="panel panel-default">
        <div class="panel-body">
          <h4>Geo IP Resp</h4>
          <p><%=geoipResp.getLatitude() %></p>
           <p><%=geoipResp.getLongitude() %></p>
        </div>
      </div>
    </div>
</div>-->
		</div>
	</div>

	<!--  	</div>
	</div>-->
	<!-- 	<p> 
	<%=googleResp.getAddress_components0_long_name() %> 
	<%=googleResp%>
	</p>-->

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="js/bootstrap.min.js"></script>
</body>
</html>