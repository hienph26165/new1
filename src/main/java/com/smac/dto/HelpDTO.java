package com.smac.dto;

import com.smac.entity.Help;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// TODO: Auto-generated Javadoc
/**
 * Hash code.
 *
 * @return the int
 */
@Data

/**
 * To string.
 *
 * @return the java.lang. string
 */
@Builder

/**
 * Sets the shop id.
 *
 * @param shopId the new shop id
 */
@Setter

/**
 * Gets the shop id.
 *
 * @return the shop id
 */
@Getter

/**
 * Instantiates a new help DTO.
 *
 * @param staffId      the staff id
 * @param parentHelpId the parent help id
 * @param status       the status
 * @param type         the type
 * @param shopId       the shop id
 */
@AllArgsConstructor

/**
 * Instantiates a new help DTO.
 */
@NoArgsConstructor

/**
 * To string.
 *
 * @return the java.lang. string
 */
@ToString
public class HelpDTO {

	/** The staff id. */
	private Integer staffId;

	/** The parent help id. */
	private Long parentHelpId;

	/** The status. */
	private String status;

	/** The type. */
	private String type;

	/** The shop id. */
	private Integer shopId;

}
