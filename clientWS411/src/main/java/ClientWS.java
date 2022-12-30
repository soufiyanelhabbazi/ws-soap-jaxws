import proxy.BanqueServiceService;
import proxy.BanqueWS;
import proxy.Compte;

public class ClientWS {
    public static void main(String[] args) {
        BanqueWS stub = new BanqueServiceService().getBanqueWSPort();
        System.out.println(stub.convert(7600));
        Compte cp = stub.getCompte(6);
        System.out.println(cp.getCode());
        System.out.println(cp.getSolde());
    }
}
