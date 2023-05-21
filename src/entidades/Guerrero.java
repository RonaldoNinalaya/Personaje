/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Ronaldo
 */
public class Guerrero extends Personaje{
    private int fuerza;
    private int resistencia;
    /**
     * @return the fuerza
     */
    
    public Guerrero(String nombre, int vida, int nivel,int fuerza, int resistencia){
        super(nombre,vida,nivel);
        this.fuerza = fuerza;
        this.resistencia = resistencia;
        
    }

    public void ataqueEspecial(Personaje atacado) {
    }

    @Override
    public void atacar(Personaje atacado) {
       int nivelActualDeVida = atacado.getVida();
       atacado.setVida(nivelActualDeVida -10);
       atacado.defender(this);
    }
    
    
    public int getFuerza() {
        return fuerza;
    }

    /**
     * @param fuerza the fuerza to set
     */
    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    /**
     * @return the resistencia
     */
    public int getResistencia() {
        return resistencia;
    }

    /**
     * @param resistencia the resistencia to set
     */
    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }
    public void mostrarDatos(){
        System.out.println("Nombre de guerrero: "+getNombre()+
                            "\nVida: "+getVida()+
                            "\nNivel: "+getNivel()+
                            "\nFuerza: "+fuerza+
                            "\nResistencia: "+resistencia);
    }
}
