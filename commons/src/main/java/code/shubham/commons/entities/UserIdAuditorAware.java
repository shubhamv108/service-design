package code.shubham.commons.entities;

import code.shubham.commons.contexts.UserContextHolder;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Optional;

public class UserIdAuditorAware implements AuditorAware<Integer> {

    @Override
    public Optional<Integer> getCurrentAuditor() {
        return Optional.ofNullable(UserContextHolder.getUserId());
    }
}