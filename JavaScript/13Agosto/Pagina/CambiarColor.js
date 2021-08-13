let margen ="1 cm"
function mimsocolor(){
    let  posicionXdeCuadrado2 = cuadrado2.getBoundingClientRect().x;
    let posicionYdeCuadrado2 = cuadrado2.getBoundingClientRect().y;
    let  posicionXdeCuadrado = cuadrado.getBoundingClientRect().x;
    let posicionYdeCuadrado = cuadrado.getBoundingClientRect().y;
    if(posicionXdeCuadrado==posicionXdeCuadrado2 && posicionYdeCuadrado+5000==posicionYdeCuadrado2){
        cuadrado2.style.backgroundColor="#ffffffff"
        cuadrado.style.backgroundColor="#800080"
    }
}
function mover(){
let cuadrado =document.getElementById("cuadrado");
let nuevovalormi = parseInt(margen.charAt(0))+1;
margen = nuevovalormi +"cm"
cuadrado.style.marginTop= margen;
mimsocolor()
}
function mover2(){
    let cuadrado =document.getElementById("cuadrado");
    let nuevovalormi = parseInt(margen.charAt(0))-1;
    margen = nuevovalormi +"cm"
    cuadrado.style.marginTop= margen;
    mismocolor()
}
function derecha(){
    let cuadrado =document.getElementById("cuadrado");
    let nuevovalormi = parseInt(margen.charAt(0))+1;
    margen = nuevovalormi +"cm"
    cuadrado.style.marginLeft= margen;
    mimsocolor()
}
function izquierda(){
    let cuadrado =document.getElementById("cuadrado");
    let nuevovalormi = parseInt(margen.charAt(0))-1;
    margen = nuevovalormi +"cm"
    cuadrado.style.marginLeft= margen;
    mimsocolor()
}