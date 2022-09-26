package com.ubuntu.admintic.controller;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.ubuntu.admintic.entity.Profile;
import com.ubuntu.admintic.services.ProfileService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProfileController {

    ProfileService services;

    public ProfileController(ProfileService services){
        this.services=services;
    }

    @JsonManagedReference
    @GetMapping("profile")
    public List<Profile> ProfileList(){
        return this.services.getProfileList();
    }

    @PostMapping("profile")
    public Profile createProfile(@RequestBody Profile profile){
        return this.services.createProfile(profile);
    }

    @GetMapping("profile/{id}")
    public String findProfile(@PathVariable int id){
        return "";
    }

    @DeleteMapping("profile/{id}")
    public String deleteProfile(@PathVariable int id){
        return "";
    }

    @PatchMapping("profile/{id}")
    public String updateProfile(@PathVariable int id){
        return "";
    }
}
