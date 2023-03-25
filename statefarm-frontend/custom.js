$(function () {
  function initMap() {
    // var location1 = new google.maps.LatLng(50.0875726, 14.4189987);
    // var location2 = new google.maps.LatLng(50.0875726, 14.4189987);

    // var locations= [location1,location2];
    // const url = "http://localhost:8080/getAgents";
    // var zip = document.getElementById("zip").value;
    // // Storing response
    // const response = fetch(url + "/" + zip);

    // // Storing data in form of JSON
    // var data = response.json();
    // console.log(data);
    // if (response) {
    //   // hideloader();
    //   // alert("success");
    //   show(data);
    // }

    let locations = [
      [34.7357, -96.1081],
      [32.7357, -97.1081],
      [32.4267861, -97.0806032],
    ];
    var mapCanvas = document.getElementById("map");
    var mapOptions = {
      center: new google.maps.LatLng(locations[1][0], locations[1][1]),
      zoom: 8,
      panControl: false,
      mapTypeId: google.maps.MapTypeId.ROADMAP,
    };
    var map = new google.maps.Map(mapCanvas, mapOptions);
    // var bounds = new google.maps.LatLngBounds();
    var markerImage = "marker.png";

    for (i = 0; i < locations.length; i++) {
      var marker = new google.maps.Marker({
        position: new google.maps.LatLng(locations[i][0], locations[i][1]),
        map: map,
        icon: markerImage,
      });

      var contentString =
        '<div class="info-window">' +
        "<h3>Info Window Content</h3>" +
        '<div class="info-content">' +
        "<p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. Aenean ultricies mi vitae est. Mauris placerat eleifend leo.</p>" +
        "</div>" +
        "</div>";

      var infowindow = new google.maps.InfoWindow({
        content: contentString,
        maxWidth: 400,
      });

      var infowindow2 = new google.maps.InfoWindow({
        content: contentString,
        maxWidth: 400,
      });

      marker.addListener("click", function () {
        // infowindow.open(map, marker);
        infowindow2.open(map, marker);
      });
      //    google.maps.event.addListener(marker,'click',(function(marker,i){
      //     return function(){
      //         infowindow.open(map, marker);

      //     }
      //    }))
    }
  }

  // google.maps.event.addDomListener(window, 'load', initMap);
  window.addEventListener("load", initMap);
});
