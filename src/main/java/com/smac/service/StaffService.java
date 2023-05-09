package com.smac.service;

import java.util.List;

import com.smac.dto.HelpDTO;
import com.smac.dto.StaffDTO;
import com.smac.entity.Help;

// TODO: Auto-generated Javadoc
/**
 * The Interface StaffService.
 */
public interface StaffService {

	/**
	 * Gets the all staff.
	 *
	 * @return the all staff
	 */
	List<StaffDTO> getAllStaff();

	/**
	 * Gets the all helps.
	 *
	 * @return the all helps
	 */
	List<HelpDTO> getAllHelps();

}
