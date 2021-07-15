package facade;

public class ServicosFacadeTestDrive {
	public static void main(String[] args) {
		Apache apache = new Apache("Apache");
		InternetInformationService iis = new InternetInformationService("Internet Information Service");
		IpTables ipTables = new IpTables("IP Tables");
		IsaServer isaServer = new IsaServer("Isa Server");
		MySqlServer mysqlServer = new MySqlServer("MySQL");
		Postgres postgres = new Postgres("Postgres");
		SqlServer sqlServer = new SqlServer("SQL Server");
		
		FacadeServidor servidor = new FacadeServidor(apache, iis, ipTables, isaServer, mysqlServer, postgres, sqlServer);
	
		servidor.servicosLinuxStart();
		System.out.println();
		servidor.servicosLinuxStop();
		System.out.println();
		servidor.servicosMicrosoftStart();
		System.out.println();
		servidor.servicosMicrosoftStop();
	}
	
}

