/*
 * 
 */
package com.smac.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// TODO: Auto-generated Javadoc
/**
 * The Class Staff.
 */
@Entity

/**
 * Hash code.
 *
 * @return the int
 */
@Data
@Table(name = "staff")

/**
 * To string.
 *
 * @return the java.lang. string
 */
@Builder

/**
 * Sets the helps.
 *
 * @param helps the new helps
 */
@Setter

/**
 * Gets the helps.
 *
 * @return the helps
 */
@Getter

/**
 * Instantiates a new staff.
 *
 * @param staffId   the staff id
 * @param staffCode the staff code
 * @param staffName the staff name
 * @param tel       the tel
 * @param address   the address
 * @param shopId    the shop id
 * @param idNo      the id no
 * @param status    the status
 * @param helps     the helps
 */
@AllArgsConstructor

/**
 * Instantiates a new staff.
 */
@NoArgsConstructor

/**
 * To string.
 *
 * @return the java.lang. string
 */
@ToString
public class Staff {

	/** The staff id. */
	@Id
	@Column(name = "staff_id")
	private Integer staffId;

	/** The staff code. */
	@Column(name = "staff_code")
	private String staffCode;

	/** The staff name. */
	@Column(name = "staff_name")
	private String staffName;

	/** The tel. */
	@Column(name = "tel")
	private String tel;

	/** The address. */
	@Column(name = "address")
	private String address;

	/** The shop id. */
	@Column(name = "shop_id")
	private Integer shopId;

	/** The id no. */
	@Column(name = "id_no")
	private String idNo;

	/** The status. */
	@Column(name = "status")
	private String status;

	/** The helps. */
	@OneToMany(mappedBy = "createdUser", cascade = CascadeType.ALL)
	private List<Help> helps;

}
