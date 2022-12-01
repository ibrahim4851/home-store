package com.ibrahim.homestore.service;

import com.ibrahim.homestore.entity.AppUser;
import com.ibrahim.homestore.repo.AppUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MyUserDetailsService implements UserDetailsService {

    private AppUserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        Optional<AppUser> user = userRepository.findByEmail(email);

        user.orElseThrow(() -> new UsernameNotFoundException("Not found: " + email));

        return user.map(AppUser::new).get();
    }
}
