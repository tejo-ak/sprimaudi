package org.sprimaudi.zkspring.repository;

import org.sprimaudi.zkspring.entity.Auditor;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 * User: User
 * Date: 7/16/12
 * Time: 6:26 AM
 * To change this template use File | Settings | File Templates.
 */
public interface AuditorRepository extends CrudRepository<Auditor, Long>, AuditorRepositoryCustom, QueryDslPredicateExecutor<Auditor> {
}
