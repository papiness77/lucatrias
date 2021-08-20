let margen ="1 cm"

function mover(){
let cuadrado =document.getElementById("cuadrado");
let nuevovalormi = parseInt(margen.charAt(0))+1;
margen = nuevovalormi +"cm"
cuadrado.style.marginTop= margen;
}
function mover2(){
    let cuadrado =document.getElementById("cuadrado");
    let nuevovalormi = parseInt(margen.charAt(0))-1;
    margen = nuevovalormi +"cm"
    cuadrado.style.marginTop= margen;

}
function derecha(){
    let cuadrado =document.getElementById("cuadrado");
    let nuevovalormi = parseInt(margen.charAt(0))+1;
    margen = nuevovalormi +"cm"
    cuadrado.style.marginLeft= margen;
}
function izquierda(){
    let cuadrado =document.getElementById("cuadrado");
    let nuevovalormi = parseInt(margen.charAt(0))-1;
    margen = nuevovalormi +"cm"
    cuadrado.style.marginLeft= margen;
}