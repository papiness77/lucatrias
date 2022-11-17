import requests
import cv2


def getImages ( path, images, extension):
 for i in range(images): 
    url = "https://source.unsplash.com/collection/1039064"
    response = requests.get(url)
    if response.status_code == 200:
      with open(path+ str(i) + extension ,"wb") as f:
          f.write(response.content)
path="/content/caras/imagen"
getImages( path, 100,".jpg" ) 

# pip3 install opencv-python



clasificador_de_rostros = cv2.CascadeClassifier(cv2.data.haarcascades+

'haarcascade_frontalface_default.xml')



image = cv2.imread('/content/caras/imagen0.jpg')

copia_imagen = image.copy()

rostros = clasificador_de_rostros.detectMultiScale(image)

for(x,y,ancho,alto) in rostros:
    cv2.rectangle(image(x,y),(x+ancho,y+alto),(0,255,255),2)
    rostro = copia_imagen[y:y+alto,y+ancho]
    cv2.imwrite('foto_rostro_{id}.jpg',rostro)
