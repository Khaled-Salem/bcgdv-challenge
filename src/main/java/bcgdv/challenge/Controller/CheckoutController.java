package bcgdv.challenge.Controller;

import bcgdv.challenge.Service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class CheckoutController {
    @Autowired
    private CheckoutService checkoutService;

    @PostMapping("/checkout")
    public HashMap<String, Integer> checkout(@RequestBody Integer[] ids) {
        HashMap<String, Integer> response = new HashMap<>();
        response.put("price", checkoutService.calculatePrice(ids));

        return response;
    }
}
