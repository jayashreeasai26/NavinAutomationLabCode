package javasession;

public class switchassign {

	public static void main(String[] args) {

		String environment= "live";
		switch (environment) {
		case "dev":
			System.out.println("print dev");
			break;
		case "test":
			System.out.println("print test");
		case "prod":
			System.out.println("print prod");
		break;
			default:
			System.out.println("print UaT");
			break;
			case "live":
				System.out.println("print live");
			
				break;
			
		}
	}

}
