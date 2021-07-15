package Pessoa;

class TestaFuncionario{
    public static void main(String args[])
	 {
	    Funcionario varFunc=new Funcionario();
		varFunc.setCPF("27.889.165-3");
		varFunc.SetNome("João da Silva");
		varFunc.setChapa("5526H");
		System.out.println("CPF...:"+varFunc.getCPF());
		System.out.println("Nome...:"+varFunc.getNome());
		System.out.println("Chapa...:"+varFunc.getChapa());
	 }
}
	 
