public class main {
    public static void main(String[] args){
    Mama mama1 = new Mama("Julia",50,156142,"Sancor");
    Hijo hijo1 = new Hijo("Juan",12,151212,"Politecnico","GTA");
        Hijo hijo2 = new Hijo("Nicolas",32,151212,"Politecnico","GTA");
        Hijo hijo3 = new Hijo("Fernando",15,151212,"Politecnico","GTA");
        Hijo hijo4 = new Hijo("Gustavo",17,151212,"Politecnico","GTA");
        Hijo hijo5 = new Hijo("Gabriel",120,151212,"Politecnico","GTA");
        mama1.RegistrarHijo(hijo1);
        mama1.RegistrarHijo(hijo2);
        mama1.RegistrarHijo(hijo3);
        mama1.RegistrarHijo(hijo4);
        mama1.RegistrarHijo(hijo5);
        mama1.HijosMenoresDeEdad();
}
}
