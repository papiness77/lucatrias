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
