public class Vaga {
    private int numero;
    private boolean ocupada;
    private Veiculo veiculoEstacionado;

    public Vaga(int numero){
        this.numero = numero;
        this.ocupada = false;
        this.veiculoEstacionado = null;
    }

    public void estacionar(){

    }
    public void liberar(){
        ocupada = false;
        this.veiculoEstacionado = null;
    }
}
