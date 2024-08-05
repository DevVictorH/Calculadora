package modelo;

@FunctionalInterface
public interface MemoriaObserver {

    public void valorAlterado(String novoValor);
}
