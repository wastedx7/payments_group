package com.paymentgroup.paymentgroup.reposiratory;

import org.springframework.stereotype.Repository;
import com.paymentgroup.paymentgroup.entity.users;

@Repository
public class usersrepo extends Jparepository<users, Long> {
    users findByID(long id);
    users findByemail(String email);
}
