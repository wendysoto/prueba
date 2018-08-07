/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author Wendy Soto
 */
public class Agua implements Interfaz{
    
    int vida = 1200;
    int estamina = 600;
    int ataque = 100;
    int ataquefinal = 210;

    public Agua(int vida,int estamina,int ataque, int ataquefinal) {
        this.vida = vida;
        this.estamina = estamina;
        this.ataque = ataque;
        this.ataquefinal = ataquefinal;
    }

    
    
    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getEstamina() {
        return estamina;
    }

    public void setEstamina(int estamina) {
        this.estamina = estamina;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getAtaquefinal() {
        return ataquefinal;
    }

    public void setAtaquefinal(int ataquefinal) {
        this.ataquefinal = ataquefinal;
    }

    @Override
    public int ataque() {
        return ataque;
    }

    @Override
    public int defensa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int ataquefinal() {
        return ataquefinal;
    }

    @Override
    public int curar() {
        return vida+20;
    }
    
    
}
