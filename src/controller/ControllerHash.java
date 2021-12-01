package controller;

public class ControllerHash {

	public ControllerHash() { }

	public int minhaFuncaoHash(long chave) {
		return (int)(chave % 3 *2);
	}
	
}