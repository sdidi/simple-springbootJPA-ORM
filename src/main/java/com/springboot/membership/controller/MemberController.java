package com.springboot.membership.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springboot.membership.repository.MemberRepository;

@Controller
@RequestMapping("/members")
public class MemberController {
	
	private final MemberRepository memberRepository;
    
	@Autowired
	public MemberController(MemberRepository memberRepository) {
				this.memberRepository = memberRepository;
	}

	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String listMembers(Model model) {
		model.addAttribute("members", memberRepository.findAll());
		return "memberList"; //this is to call resources/templates/memberList.html file to execute
	}
	
	

}
