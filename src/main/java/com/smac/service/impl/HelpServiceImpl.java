package com.smac.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;

import com.smac.dto.HelpDTO2;
import com.smac.dto.HelpDTO;
import com.smac.dto.StaffDTO;
import com.smac.entity.Help;
import com.smac.entity.Staff;
import com.smac.repository.HelpRepository;
import com.smac.service.HelpService;

import jakarta.validation.Valid;

// TODO: Auto-generated Javadoc
/**
 * The Class HelpServiceImpl.
 */
@Service
public class HelpServiceImpl implements HelpService {

	/** The help repo. */
	@Autowired
	private HelpRepository helpRepo;

	/**
	 * Gets the all help.
	 *
	 * @return the all help
	 */
	@Override
	public List<HelpDTO2> getAllHelp() {
		List<Help> lstHelp = helpRepo.findAll();
		List<HelpDTO2> lstHelpDTO = new ArrayList<>();
		for (Help help : lstHelp) {
			HelpDTO2 helpDTO = new HelpDTO2();
			helpDTO.setHelpId(help.getHelpId());
			helpDTO.setHelpName(help.getHelpName());
			helpDTO.setCreatedUser(help.getCreatedUser());
			helpDTO.setParent(help.getParent());
			helpDTO.setPosition(help.getPosition());
			helpDTO.setType(help.getType());
			helpDTO.setStatus(help.getStatus());
			helpDTO.setContent(help.getContent());
			lstHelpDTO.add(helpDTO);
		}
		return lstHelpDTO;
	}

	/**
	 * Creates the help.
	 *
	 * @param helpDTO the help DTO
	 * @return the boolean
	 * @throws Exception the exception
	 */
	@Override
	public Boolean createHelp(@Valid @RequestBody HelpDTO2 helpDTO) throws Exception {
		Help help = new Help();
		help.setHelpName(helpDTO.getHelpName());
		help.setParent(helpDTO.getParent());
		help.setContent(helpDTO.getContent());
		help.setPosition(helpDTO.getPosition());
		help.setType(helpDTO.getType());
		help.setCreatedUser(helpDTO.getCreatedUser());
		help.setStatus(helpDTO.getStatus());
		helpRepo.save(help);
		return true;
	}

	/**
	 * Delete help.
	 *
	 * @param helpId the help id
	 * @return the boolean
	 * @throws Exception the exception
	 */
	@ExceptionHandler
	@Override
	public Boolean deleteHelp(long helpId) throws Exception {
		List<Help> lstHelp = helpRepo.findAll();
		for (Help help : lstHelp) {
			if (help.getHelpId() == helpId) {
				helpRepo.delete(help);
				return true;
			}
		}
		return false;
	}

	/**
	 * Update help.
	 *
	 * @param helpId  the help id
	 * @param helpDTO the help DTO
	 * @return the boolean
	 * @throws Exception the exception
	 */
	@Override
	public Boolean updateHelp(long helpId, @Valid @RequestBody HelpDTO2 helpDTO) throws Exception {
		List<Help> lstHelp = helpRepo.findAll();
		for (Help helps : lstHelp) {
			if (helps.getHelpId() == helpId) {
				helps.setContent(helpDTO.getContent());
				helps.setCreatedUser(helpDTO.getCreatedUser());
				helps.setParent(helpDTO.getParent());
				helps.setHelpName(helpDTO.getHelpName());
				helps.setPosition(helpDTO.getPosition());
				helps.setStatus(helpDTO.getStatus());
				helps.setType(helpDTO.getType());
				helpRepo.save(helps);
				return true;
			}
		}
		return false;
	}

	/**
	 * Update help status.
	 *
	 * @param helpId the help id
	 * @return the boolean
	 * @throws Exception the exception
	 */
	@Override
	public Boolean updateHelpStatus(long helpId) throws Exception {
		List<Help> lstHelp = helpRepo.findAll();
		for (Help helps : lstHelp) {
			if (helps.getHelpId() == helpId) {
				helps.setStatus("0");
				helpRepo.save(helps);
				return true;
			}
		}
		return false;
	}

	/**
	 * Validate help.
	 *
	 * @param helpDTO the help DTO
	 * @throws Exception the exception
	 */
	private void validateHelp(HelpDTO2 helpDTO) throws Exception {
		if (helpDTO.getHelpName().isEmpty()) {
			throw new Exception("Không được trống help_name");
		} else if (helpDTO.getParent().toString().isEmpty()) {
			throw new Exception("Không được trống parent");
		} else if (helpDTO.getContent().isEmpty()) {
			throw new Exception("Không được trống content");
		} else if (helpDTO.getType().isEmpty()) {
			throw new Exception("Không được trống type");
		} else if (helpDTO.getCreatedUser().isEmpty()) {
			throw new Exception("Không được trống created_user");
		} else if (helpDTO.getPosition().isEmpty()) {
			throw new Exception("Không được trống position");
		} else if (helpDTO.getStatus().isEmpty()) {
			throw new Exception("Không được trống status");
		}
	}

}
