package uk.co.vsf.openapi.api;

import javax.validation.Valid;

import org.openapitools.api.CatsApi;
import org.openapitools.model.Cat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class CatsApiController implements CatsApi {

    @Override
    public ResponseEntity<Cat> addCat(@Valid Cat cat) {
        return new ResponseEntity<>(HttpStatus.ALREADY_REPORTED);
    }
}
