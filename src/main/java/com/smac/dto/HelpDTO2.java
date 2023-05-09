package com.smac.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.smac.entity.Help;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
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
 * Sets the status.
 *
 * @param status the new status
 */
@Setter

/**
 * Gets the status.
 *
 * @return the status
 */
@Getter

/**
 * Instantiates a new help DTO 2.
 *
 * @param helpId      the help id
 * @param helpName    the help name
 * @param parent      the parent
 * @param type        the type
 * @param position    the position
 * @param content     the content
 * @param createdUser the created user
 * @param status      the status
 */
@AllArgsConstructor

/**
 * Instantiates a new help DTO 2.
 */
@NoArgsConstructor

/**
 * To string.
 *
 * @return the java.lang. string
 */
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HelpDTO2 {

	/** The help id. */
	private Long helpId;

	/** The help name. */
	private String helpName;

	/** The parent. */
	private Long parent;

	/** The type. */
	private String type;

	/** The position. */
	private String position;

	/** The content. */
	private String content;

	/** The created user. */
	private String createdUser;

	/** The status. */
	private String status;
}
