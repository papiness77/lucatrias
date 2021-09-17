function funcion1(){
 let objeto = {
 "Hotel": {
 "nombre": "Shereaton",
 "arrayDeObjetos": {
 "Direccion": "Campna4572",
 "Servicios":["spa","oficina"]
 }
 }
}
//let JsonComoString = JSON.stringify(Json);
let JsonComoString = objeto.Hotel.nombre;
let hola =document.getElementById("textojson").innerHTML=JsonComoString;
}