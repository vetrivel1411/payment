
package com.example.payment;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/pay")
public class PaymentController {

    @PostMapping
    public String processPayment(@RequestBody Map<String, String> paymentInfo) {
        System.out.println("💳 Payment processed for booking: " + paymentInfo.get("bookingId"));
        return "Payment success";
    }
}
