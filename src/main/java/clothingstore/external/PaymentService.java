package clothingstore.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@FeignClient(name="payment", url="${prop.pay.url}")
// @FeignClient(name="payment", url="${api.url.payment}", fallback = PaymentServiceImpl.class)
public interface PaymentService {
    @RequestMapping(method= RequestMethod.POST, path="/payments")
    public void payment(@RequestBody Payment payment);

}

