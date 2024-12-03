package com.example.trip.service;

import com.example.trip.dto.TripuserDTO;
import com.example.trip.entity.Tripuser;
import com.example.trip.repository.TripuserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Log4j2
@Transactional
public class TripuserService implements UserDetailsService {

    private final TripuserRepository tripuserRepository;
    private final ModelMapper modelMapper;
    private final PasswordEncoder passwordEncoder;

    //로그인
    @Override
    public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {

        Tripuser tripuser = tripuserRepository.findByTripuserId(id);

        if (tripuser == null) {
            throw new UsernameNotFoundException(id);
        }

        return User.builder()
                .username(tripuser.getId())
                .password(tripuser.getPassword())
                .roles(tripuser.getRole().toString())
                .build();
    }

    //회원가입
    public Tripuser saveTripuser(TripuserDTO tripuserDTO) {

        Tripuser tripuser = modelMapper.map(tripuserDTO, Tripuser.class);

        //아이디 확인
        validateDuplicateId(tripuserDTO.getId());

        //이메일 확인
        validateDuplicateEmail(tripuserDTO.getEmail());

        tripuser.setPassword(passwordEncoder.encode( tripuserDTO.getPassword() ) );

        tripuser =
                tripuserRepository.save(tripuser);

        return tripuser;

    }

    //가입여부 확인
    public void validateDuplicateId(String id) {

        Tripuser tripuser = tripuserRepository.findByTripuserId(id);

        if (tripuser != null) {
            throw new IllegalStateException("이미 가입된 회원입니다.");
        }

    }

    public void validateDuplicateEmail(String email) {

        Tripuser tripuser = tripuserRepository.findByEmail(email);

        if (tripuser != null) {
            throw new IllegalStateException("이미 가입된 회원입니다.");
        }

    }


}
