import requests
if __name__ == '__main__':
    archivo = open("resultadosCovid.csv", "w")
    nombres_columnas = "estado , resultado , edad  \n"
    archivo.write(nombres_columnas)
    archivo.close()
    respuesta = requests.get('https://api.covidtracking.com/v1/states/info.json')
    respuesta.status_code
    informacion = respuesta.json()

    for  i in range(30):
        resultado= informacion[i]["totalTestResultsField"]
        estado = informacion[i]["name"]
        edad =informacion[i]["fips"]
        linea = estado + "," + resultado + ","+ edad  + "\n"
        archivo = open("resultadosCovid.csv", "a")
        archivo.write(linea)
        archivo.close()
