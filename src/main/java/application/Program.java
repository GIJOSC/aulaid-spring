package application;

import com.devsuperior.aulaid.services.DeliverService;
import com.devsuperior.aulaid.services.PayService;
import com.devsuperior.aulaid.services.TaxService;

public class Program {

	public static void main(String[] args) {
		
		TaxService taxService = new TaxService();
		DeliverService deliverService = new DeliverService();
		
		PayService payService = new PayService(taxService, deliverService);
		
		System.out.println("Resultado = " + payService.finalPrice(300.0, "SC"));

	}

}
