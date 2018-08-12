package com.springboot.membership.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.membership.model.Member;

public interface MemberRepository extends JpaRepository<Member, String> {

}
