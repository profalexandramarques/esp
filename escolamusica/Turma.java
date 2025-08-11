package escolamusica;

/**
 * @author Alexandra
 */
public class Turma {
    private int id_turma;
    private int id_curso;
    private int id_prof;
    private String turno;

    public Turma() {
    }

    /**
     * @return the id_turma
     */
    public int getId_turma() {
        return id_turma;
    }

    /**
     * @param id_turma the id_turma to set
     */
    public void setId_turma(int id_turma) {
        this.id_turma = id_turma;
    }

    /**
     * @return the id_curso
     */
    public int getId_curso() {
        return this.id_curso;
    }

    /**
     * @param id_curso the id_curso to set
     */
    public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
    }

    /**
     * @return the id_prof
     */
    public int getId_prof() {
        return this.id_prof;
    }

    /**
     * @param id_prof the id_prof to set
     */
    public void setId_prof(int id_prof) {
        this.id_prof = id_prof;
    }

    /**
     * @return the turno
     */
    public String getTurno() {
        return this.turno;
    }

    /**
     * @param turno the turno to set
     */
    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Turma{" + "id_turma=" + this.id_turma + 
                ", id_curso=" + this.id_curso + 
                ", id_prof=" + this.id_prof + 
                ", turno=" + this.turno + '}';
    }
    
    
    
}
