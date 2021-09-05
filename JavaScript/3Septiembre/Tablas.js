
function AgregarFila(){
    let BotonAgregar = document.getElementById("IngresarDatos");
    BotonAgregar.style.display = "inline-block";

    let tabla = document.getElementById("tabla");
    let tr = document.createElement("tr");
    let td1 = document.createElement("td");
    let td2 = document.createElement("td");
    let td3 = document.createElement("td");

    let inputNombre = document.createElement("input");
    let inputEdad = document.createElement("input");
    let inputMail = document.createElement("input");

    inputNombre.setAttribute("type","text");
    inputEdad.setAttribute("type","int");
    inputMail.setAttribute("type","text");

    td1.appendChild(inputNombre);
    td2.appendChild(inputEdad);
    td3.appendChild(inputMail);

    tr.appendChild(td1);
    tr.appendChild(td2);
    tr.appendChild(td3);

    tabla.appendChild(tr);

    document.getElementById("IngresarDatos").onclick=function (){
        td1.innerHTML= inputNombre.value;
        td2.innerHTML=inputEdad.value;
        td3.innerHTML=inputMail.value;
    }

}

