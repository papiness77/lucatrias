function funcion(){
    document.getElementById("calculadoraboton").onclick=function (){
        var url = "calculadora.html";
        var  el = document.getElementById("iframeboton");
        el.src=url;
    }
    document.getElementById("nombreboton").onclick=function (){
        var url = "nombreyapellido.html";
        var  el = document.getElementById("iframeboton");
        el.src=url;
    }
    document.getElementById("moverboton").onclick=function (){
        var url = "MoverCuadrado.html";
        var  el = document.getElementById("iframeboton");
        el.src=url;
    }
    document.getElementById("cambiarboton").onclick=function (){
        var url = "CambiarColor.html";
        var  el = document.getElementById("iframeboton");
        el.src=url;
    }
    document.getElementById("tablasboton").onclick=function (){
        var url = "Tablas.html";
        var  el = document.getElementById("iframeboton");
        el.src=url;
    }
    document.getElementById("radio").onclick=function (){
        var url = "calcularradio.html";
        var  el = document.getElementById("iframeboton");
        el.src=url;
    }
}
$(document).ready(function(){
    $("#botond").click(function(){
        $("*").hide();
    });
    $("#botona").click(function() {
        $("*").show();
    });
    $("#botont").click(function() {
        var hola = $("#inputazo").val();
        $(hola).toggle();
    });
});