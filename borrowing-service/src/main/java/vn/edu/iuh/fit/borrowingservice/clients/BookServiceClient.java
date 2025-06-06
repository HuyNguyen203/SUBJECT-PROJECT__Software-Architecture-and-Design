package vn.edu.iuh.fit.borrowingservice.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.ResponseEntity;
import vn.edu.iuh.fit.borrowingservice.config.FeignConfig;

@FeignClient(name = "book-service", configuration = FeignConfig.class)
public interface BookServiceClient {

    @GetMapping("/api/v1/book-service/books/{bookId}/exists")
    ResponseEntity<Boolean> checkBookExists(@PathVariable("bookId") String bookId);
}
