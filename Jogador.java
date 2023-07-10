import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Jogador implements PropertyChangeListener {
    private String nome;

    public Jogador(String nome) {
        this.nome = nome;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        Jogador jogadorDaVez = (Jogador) evt.getNewValue();
        if (jogadorDaVez == this){
            System.out.println("Jogador " + this.nome + "é minha vez familia!");
        }    
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    

}
