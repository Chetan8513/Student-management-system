/**
 * 
 */
package com.spring.Repo;

import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.entity.Student;

/**
 * @author Dell
 *
 */
@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {
	

}
