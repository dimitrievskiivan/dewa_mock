package org.openapitools.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-26T18:06:25.282Z[Etc/UTC]")
@Controller
@RequestMapping("${openapi.httpLocalhost8080.base-path:}")
public class DewaWSApiController implements DewaWSApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public DewaWSApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
