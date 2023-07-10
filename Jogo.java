import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Jogo {
    private Jogador jogadorDaVez;
    private PropertyChangeSupport controleDeJogadores;

    public Jogo() {
        controleDeJogadores = new PropertyChangeSupport(this);
    }

    public void adicionarJogador(PropertyChangeListener jogador) {
        controleDeJogadores.addPropertyChangeListener(jogador);
    }

    public void definirJogador(Jogador jogadorDaVez){
        controleDeJogadores.firePropertyChange("jogadorDaVez", this.jogadorDaVez, jogadorDaVez);
        this.jogadorDaVez = jogadorDaVez;
    }
}
