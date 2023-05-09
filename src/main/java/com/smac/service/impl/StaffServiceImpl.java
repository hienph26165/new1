package com.smac.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smac.repository.HelpRepository;
import com.smac.repository.StaffRepository;
import com.smac.service.StaffService;
import com.smac.dto.HelpDTO;
import com.smac.dto.StaffDTO;
import com.smac.entity.Help;
import com.smac.entity.Staff;

// TODO: Auto-generated Javadoc
/**
 * The Class StaffServiceImpl.
 */
@Service
public class StaffServiceImpl implements StaffService {

	/** The staff repo. */
	@Autowired
	private StaffRepository staffRepo;

	/** The help repo. */
	@Autowired
	private HelpRepository helpRepo;

	/**
	 * Gets the all staff.
	 *
	 * @return the all staff
	 */
	@Override
	public List<StaffDTO> getAllStaff() {
		List<Staff> lstStaff = staffRepo.findAll();
		List<StaffDTO> staffDTOs = new ArrayList<>();
		for (Staff staff : lstStaff) {
			List<Help> helpListByStaffCode = helpRepo.findByCreatedUser(staff.getStaffCode());
			staff.setHelps(helpListByStaffCode);

			for (Help help : helpListByStaffCode) {
				StaffDTO staffDto = new StaffDTO();
				staffDto.setStaffCode(staff.getStaffCode());
				staffDto.setStaffName(staff.getStaffName());
				staffDto.setTel(staff.getStaffName());
				staffDto.setShopId(staff.getShopId());
				staffDto.setIdNo(staff.getIdNo());
				staffDto.setHelpId(help.getHelpId());
				staffDTOs.add(staffDto);
			}
		}
		return staffDTOs;
	}

	/**
	 * Gets the all helps.
	 *
	 * @return the all helps
	 */
	@Override
	public List<HelpDTO> getAllHelps() {
		List<Staff> staffs = staffRepo.findAll();
		List<HelpDTO> helpDtos = new ArrayList<>();
		for (Staff staff : staffs) {
			List<Help> helps = helpRepo.findByCreatedUser(staff.getStaffCode());
			for (Help help : helps) {
				HelpDTO helpDto = new HelpDTO();
				helpDto.setParentHelpId(help.getParent());
				helpDto.setShopId(staff.getShopId());
				helpDto.setStaffId(staff.getStaffId());
				helpDto.setStatus(help.getStatus());
				helpDto.setType(help.getType());
				helpDtos.add(helpDto);
			}
		}
		return helpDtos;
	}

}
