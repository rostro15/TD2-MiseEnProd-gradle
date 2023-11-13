package org.polytech.covid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

import org.polytech.covid.domain.User;
import org.polytech.covid.domain.VaccinationCenter;
import org.polytech.covid.security.jwt.JwtUtils;
import org.polytech.covid.repository.UserRepository;
import org.polytech.covid.repository.VaccinationCenterRepository;


@RestController
public class AdminController {

  @Autowired
  UserRepository userRepository;

  @Autowired
  VaccinationCenterRepository vaccinationCenterRepository;

  @Autowired
  JwtUtils jwtUtils;

  @GetMapping("/public/all")
  public String allAccess() {
    return "Public content.";
  }

  @GetMapping("/admin/doctorboard")
  @PreAuthorize("hasRole('DOCTOR')")
  public Set<VaccinationCenter> userAccess(@RequestHeader("Authorization") String headerAuth) {

    String jwt = null;
    if (StringUtils.hasText(headerAuth) && headerAuth.startsWith("Bearer ")) {
      jwt =  headerAuth.substring(7);
    }


    String username = jwtUtils.getUserNameFromJwtToken(jwt);
    User user;

    user = userRepository.findByUsername(username);


    return user.getAssociatedCenters();
  }

  @GetMapping("/admin/adminboard")
  @PreAuthorize("hasRole('ADMIN')")
  public String adminAccess() {
    return "Admin Board.";
  }

  @GetMapping("/admin/superadminboard")
  @PreAuthorize("hasRole('SUPERADMIN')")
  public String superAdminAccess() {
    return "Super admin Board.";
  }
}