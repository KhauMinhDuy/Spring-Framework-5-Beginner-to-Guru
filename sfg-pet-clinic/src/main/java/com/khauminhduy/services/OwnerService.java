package com.khauminhduy.services;

import com.khauminhduy.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
