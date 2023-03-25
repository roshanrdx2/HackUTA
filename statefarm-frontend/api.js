function httpGet(theUrl) {
    let xmlHttpReq = new XMLHttpRequest();
    xmlHttpReq.open("GET", theUrl, false); 
    xmlHttpReq.send(null);
    return xmlHttpReq.responseText;
  }

  console.log(httpGet('https://jsonplaceholder.typicode.com/posts'));


function httpPost(){
    var http = new XMLHttpRequest();
var url = 'get_data.php';
var params = 'orem=ipsum&name=binny';
http.open('POST', url, true);

//Send the proper header information along with the request
http.setRequestHeader('Content-type', 'application/x-www-form-urlencoded');

http.onreadystatechange = function() {//Call a function when the state changes.
    if(http.readyState == 4 && http.status == 200) {
        alert(http.responseText);
    }
}
http.send(params);
}