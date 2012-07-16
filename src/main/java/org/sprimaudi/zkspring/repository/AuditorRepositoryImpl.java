package org.sprimaudi.zkspring.repository;

import org.sprimaudi.zkspring.entity.Auditor;
import org.sprimaudi.zkspring.filter.Fentry;
import org.springframework.data.jpa.repository.support.QueryDslRepositorySupport;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: User
 * Date: 7/16/12
 * Time: 11:09 AM
 * To change this template use File | Settings | File Templates.
 */
public class AuditorRepositoryImpl extends QueryDslRepositorySupport implements AuditorRepositoryCustom {
    @Override
    public Iterable<Auditor> filter(List<Fentry> filterItem) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
