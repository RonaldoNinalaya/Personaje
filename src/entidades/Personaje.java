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
public abstract class  Personaje {
    private String nombre;
    private int vida;
    private int nivel;

    /**
     * @return the nombre
     */
    
    public Personaje(String nombre, int vida, int nivel){
        this.nombre = nombre;
        this.vida = vida;
        this.nivel = nivel;
    }

    public void ataqueEspecialComboX2(Personaje atacado) {
        this.atacar(atacado);
    }
    public abstract void atacar(Personaje atacado);

    
    public void defender(Personaje atacante){
        this.vida = this.vida+3;
    }
    
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the vida
     */
    public int getVida() {
        return vida;
    }

    /**
     * @param vida the vida to set
     */
    public void setVida(int vida) {
        this.vida = vida;
    }

    /**
     * @return the nivel
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
