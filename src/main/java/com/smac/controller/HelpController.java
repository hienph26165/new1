package com.smac.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.smac.dto.HelpDTO2;
import com.smac.entity.Help;
import com.smac.repository.HelpRepository;
import com.smac.service.HelpService;

// TODO: Auto-generated Javadoc
/**
 * The Class HelpController.
 */
@RestController
@RequestMapping("/api/help")
public class HelpController {

	/** The help service. */
	@Autowired
	private HelpService helpService;

	/**
	 * Gets the all help.
	 *
	 * @return the all help
	 */
	@GetMapping("/helps")
	public List<HelpDTO2> getAllHelp() {
		return helpService.getAllHelp();

	}

	/**
	 * Delete help.
	 *
	 * @param helpId the help id
	 * @return the boolean
	 * @throws Exception the exception
	 */
	@DeleteMapping("/helps/{helpId}")
	public Boolean deleteHelp(@PathVariable("helpId") long helpId) throws Exception {
		helpService.deleteHelp(helpId);
		return true;
	}

	/**
	 * Adds the help.
	 *
	 * @param helpDTO the help DTO
	 * @return the boolean
	 * @throws Exception the exception
	 */
	@PostMapping("/helps")
	public Boolean addHelp(@RequestBody HelpDTO2 helpDTO) throws Exception {
		// save the product to the database or perform other operations

		helpService.createHelp(helpDTO);
		return true;
	}

	/**
	 * Update help.
	 *
	 * @param helpId  the help id
	 * @param helpDTO the help DTO
	 * @return the boolean
	 * @throws Exception the exception
	 */
	@PutMapping("/helps/{helpId}")
	public Boolean updateHelp(@PathVariable("helpId") long helpId, @RequestBody HelpDTO2 helpDTO) throws Exception {
		// save the product to the database or perform other operations
		return helpService.updateHelp(helpId, helpDTO);
	}

	/**
	 * Update status help.
	 *
	 * @param helpId the help id
	 * @return the boolean
	 * @throws Exception the exception
	 */
	@PutMapping("/helps/{helpId}/status")
	public Boolean updateStatusHelp(@PathVariable("helpId") long helpId) throws Exception {
		return helpService.updateHelpStatus(helpId);
	}

}
