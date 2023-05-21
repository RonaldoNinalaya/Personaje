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
public  class Mago extends Personaje {
    private int magia;
    private int sabiduria;

    public Mago(String nombre, int vida, int nivel, int magia, int sabiduria) {
        super(nombre, vida, nivel);
        this.magia = magia;
        this.sabiduria = sabiduria;
    }
    /**
     * @return the magia
     */
    
    
    public void lanzarHechizo(Personaje atacado){
         int nivelActualDeVida = atacado.getVida();
        if(this.magia>25)
            atacado.setVida(nivelActualDeVida - 60);
        else
            atacado.setVida(nivelActualDeVida - 10);
        atacado.defender(this);
    }
    public int getMagia() {
        return magia;
    }
    @Override
    public void atacar(Personaje atacado) {
       int nivelActualDeVida = atacado.getVida();
       atacado.setVida(nivelActualDeVida -8);
       atacado.defender(this);
    }
    /**
     * @param magia the magia to set
     */
    public void setMagia(int magia) {
        this.magia = magia;
    }

    /**
     * @return the sabiduria
     */
    public int getSabiduria() {
        return sabiduria;
    }

    /**
     * @param sabiduria the sabiduria to set
     */
    public void setSabiduria(int sabiduria) {
        this.sabiduria = sabiduria;
    }
    public void mostrarDatos(){
        System.out.println("Nombre de Mago: "+getNombre()+
                            "\nVida: "+getVida()+
                            "\nNivel: "+getNivel()+
                            "\nFuerza: "+magia+
                            "\nResistencia: "+sabiduria);
    }
}
