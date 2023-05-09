/*
 * 
 */
package com.smac.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

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
 * The Class Help.
 */
@Entity

/**
 * Hash code.
 *
 * @return the int
 */
@Data
@Table(name = "HELP")

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
 * Instantiates a new help.
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
 * Instantiates a new help.
 */
@NoArgsConstructor

/**
 * To string.
 *
 * @return the java.lang. string
 */
@ToString
public class Help {

	/** The help id. */
	@Id
	@Column(name = "HELP_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long helpId;

	/** The help name. */
	@NotEmpty(message = "Không được trống helpname")
	@Column(name = "HELP_NAME")
	private String helpName;

	/** The parent. */
	@Min(value = 1, message = "must be equal or greater than 1")
	@Max(value = 100, message = "must be equal or less than 100")
	@Column(name = "PARENT_HELP_ID")
	private Long parent;

	/** The type. */
	@NotEmpty(message = "Không được trống type")
	@Column(name = "TYPE")
	private String type;

	/** The position. */
	@NotEmpty(message = "Không được trống position")
	@Column(name = "POSITION")
	private String position;

	/** The content. */
	@NotEmpty(message = "Không được trống content")
	@Column(name = "CONTENT")
	private String content;

	/** The created user. */
	@NotEmpty(message = "Không được trống createdUser")
	@Column(name = "CREATED_USER")
	private String createdUser;

	/** The status. */
	@NotEmpty(message = "Không được trống status")
	@Column(name = "STATUS")
	private String status;

}
