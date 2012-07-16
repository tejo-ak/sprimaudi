package org.sprimaudi.zkspring;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by IntelliJ IDEA.
 * User: User
 * Date: 7/16/12
 * Time: 2:01 AM
 * To change this template use File | Settings | File Templates.
 */
@Component(value = "tesWire")
public class TesWire {
    public String getSpringUid() {
        return "form spring bean " + UUID.randomUUID().toString();
    }
}
