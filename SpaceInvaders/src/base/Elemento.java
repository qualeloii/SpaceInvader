package base;

import java.awt.Color;
import java.awt.Graphics2D;

public class Elemento {
    private int px,py,largura,altura,velocidade;
    private boolean ativo;
    private Color cor;

    public Elemento(){}
    public Elemento(int px,int py,int largura, int altura){
        this.px = px;
        this.py = py;
        this.largura = largura;
        this.altura = altura;
    }

    public void atualiza(){}

    public void desenha(Graphics2D g) {
        g.drawRect(px, py, largura, altura);
    }
    
	public void incPx(int x) { 
		px = px + x; 
	}
    
	public void incPy(int y) { 
		py = py + y; 
	}
    
	public int getLargura() {
		return largura;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getPx() {
		return (int) px;
	}

	public void setPx(int px) {
		this.px = px;
	}

	public int getPy() {
		return (int) py;
	}

	public void setPy(int py) {
		this.py = py;
	}

	public float getMovPx() {
		return px;
	}

	public float getMovPy() {
		return py;
	}

	public int getVel() {
		return velocidade;
	}

	public void setVel(int vel) {
		this.velocidade = vel;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public Color getCor() {
		return cor;
	}

	public void setCor(Color cor) {
		this.cor = cor;
	}
}
