function hola(){
    $.ajax({
        url: "https://dog.ceo/api/breeds/image/random",
        type: 'GET'
    })
        .done(function (data) {
    
            $("#imagen").attr("src",data.message)
    
        })
        .fail(function (qXHR, textStatus, errorThrown) {
            console.log("error, no se pudo obtener datos");
        });
    }