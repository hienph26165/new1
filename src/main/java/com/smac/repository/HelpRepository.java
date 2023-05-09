package com.smac.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.smac.dto.HelpDTO;
import com.smac.entity.Help;

// TODO: Auto-generated Javadoc
/**
 * The Interface HelpRepository.
 */
@Repository
public interface HelpRepository extends JpaRepository<Help, Long> {

	/**
	 * Find by created user.
	 *
	 * @param createdUser the created user
	 * @return the list
	 */
	@Query(value = "SELECT u FROM Help u where u.createdUser = ?1")
	List<Help> findByCreatedUser(String createdUser);

	/**
	 * Select help id level.
	 *
	 * @param helpId the help id
	 * @return the list
	 */
	@Query(nativeQuery = true, value = "select help_id from help start with help_id = ?1 connect by prior help_id = parent_help_id")
	List<Integer> selectHelpIdLevel(int helpId);

	/**
	 * Delete.
	 *
	 * @param helpId the help id
	 */
	@Query(nativeQuery = true, value = "update help set status = '0' where help_id = ?1")
	void delete(int helpId);

}