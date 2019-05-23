package sistema;

public class Main {
	
	public static void main(String[] args) {
		Sistema sistema = new Sistema();
		try {
			sistema.cadastrarAluno("gilmar", "123");
			sistema.cadastrarDisciplina("p2", 60, "1");
			sistema.matricularAluno("123","1");
		    System.out.println(sistema.exibeDisciplina("1"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
