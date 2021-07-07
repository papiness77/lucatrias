public class Alumno extends persona {
    private int division;
    public Alumno(String nuevonombre, String nuevoapellido22,int division) {
        super(nuevonombre, nuevoapellido22);
        this.division=division;
    }
    public int getDivision() {
        return division;
    }
    public void setDivision(int division) {
        this.division = division;
    }

    @Override
    public void ProfesorOAlumno() {
        System.out.println("Alumno"+this.getApellido());
    }
}