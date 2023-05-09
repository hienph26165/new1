package com.smac.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smac.dto.HelpDTO;
import com.smac.dto.StaffDTO;
import com.smac.service.StaffService;

// TODO: Auto-generated Javadoc
/**
 * The Class StaffController.
 */
@RestController
@RequestMapping("/api/staff")
public class StaffController {

	/** The staff service. */
	@Autowired
	private StaffService staffService;

	/**
	 * Gets the all staffs.
	 *
	 * @return the all staffs
	 */
	@GetMapping("/staffs")
	public List<StaffDTO> getAllStaffs() {
		List<StaffDTO> staffDtos = staffService.getAllStaff();
		return staffDtos;
	}

	/**
	 * Gets the all helps.
	 *
	 * @return the all helps
	 */
	@GetMapping("/helps")
	public List<HelpDTO> getAllHelps() {
		List<HelpDTO> helpDtos = staffService.getAllHelps();
		return helpDtos;
	}

}
