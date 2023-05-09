package com.smac.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
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
 * Sets the id no.
 *
 * @param idNo the new id no
 */
@Setter

/**
 * Gets the id no.
 *
 * @return the id no
 */
@Getter

/**
 * Instantiates a new staff DTO.
 *
 * @param staffCode the staff code
 * @param staffName the staff name
 * @param tel       the tel
 * @param status    the status
 * @param shopId    the shop id
 * @param helpId    the help id
 * @param idNo      the id no
 */
@AllArgsConstructor

/**
 * Instantiates a new staff DTO.
 */
@NoArgsConstructor

/**
 * To string.
 *
 * @return the java.lang. string
 */
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StaffDTO {

	/** The staff code. */
	private String staffCode;

	/** The staff name. */
	private String staffName;

	/** The tel. */
	private String tel;

	/** The status. */
	private String status;

	/** The shop id. */
	private Integer shopId;

	/** The help id. */
	private Long helpId;

	/** The id no. */
	private String idNo;

}
