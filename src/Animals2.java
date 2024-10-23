public class Animals2 {
    public String piel;
    public String alimentacion;
    public String PE;

    public String getPiel(String pelaje) {
        return piel;
    }

    public void setPiel(String piel) {
        this.piel = piel;
    }

    public String getAlimentacion(String carnivoro) {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public String getPE(String moderado) {
        return PE;
    }

    public void setPE(String PE) {
        this.PE = PE;
    }

    public String detalleAnimal(){
        String dv= "El zorro es: " + this.alimentacion +"\n" +
                "y tiene: " + this.piel + "\n" +
                "ademas se encuentra en peligro de extincion: " + this.PE + "\n";

        return dv;


    }
}
