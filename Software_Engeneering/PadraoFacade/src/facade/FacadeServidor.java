package facade;

public class FacadeServidor {
	Apache apache;
	InternetInformationService iis;
	IpTables ipTables;
	IsaServer isaServer;
	MySqlServer mysqlServer;
	Postgres postgres;
	SqlServer sqlServer;
	
	
	public FacadeServidor(Apache apache, InternetInformationService iis, IpTables ipTables, IsaServer isaServer,
			MySqlServer mysqlServer, Postgres postgres, SqlServer sqlServer) {
		
		this.apache = apache;
		this.iis = iis;
		this.ipTables = ipTables;
		this.isaServer = isaServer;
		this.mysqlServer = mysqlServer;
		this.postgres = postgres;
		this.sqlServer = sqlServer;
	}
	
	public void servicosMicrosoftStart() {
		System.out.println("Iniciando serviços da Microsoft");
		iis.serviceOn();
		sqlServer.serviceOn();
		isaServer.serviceOn();
	}
	
	public void servicosMicrosoftStop() {
		System.out.println("Desligando serviços da Microsoft");
		iis.serviceOff();
		sqlServer.serviceOff();
		isaServer.serviceOff();
	}
	
	public void servicosLinuxStart() {
		System.out.println("Iniciando serviços do Linux");
		apache.serviceOn();
		mysqlServer.serviceOn();
		postgres.serviceOn();
		ipTables.serviceOn();
	}
	
	public void servicosLinuxStop() {
		System.out.println("Desligando serviços do Linux");
		apache.serviceOff();
		mysqlServer.serviceOff();
		postgres.serviceOff();
		ipTables.serviceOff();
	}
	
}

