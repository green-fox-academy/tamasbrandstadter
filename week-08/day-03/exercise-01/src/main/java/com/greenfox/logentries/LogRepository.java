package com.greenfox.logentries;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface LogRepository extends CrudRepository<Log, Long> {
}
