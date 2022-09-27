package com.ubuntu.admintic.services;

import com.ubuntu.admintic.entity.Profile;
import com.ubuntu.admintic.repositories.ProfileRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileService {
    private ProfileRepository profileRepository;
    public ProfileService(ProfileRepository profileRepository){
        this.profileRepository=profileRepository;
    }
    public List<Profile> getProfileList(){
        return this.profileRepository.findAll();
    }

    public Profile createProfile(Profile newProfile){
        return this.profileRepository.save(newProfile);
    }
}