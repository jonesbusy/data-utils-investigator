
package ch.delaye.data.utils.investigator.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Valentin Delaye <valentin.delaye@novaccess.ch>
 */
@Entity
public class FirstEntity implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String aFirstField;

	//<editor-fold defaultstate="collapsed" desc="Getters & Setters">
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getaFirstField() {
		return aFirstField;
	}
	
	public void setaFirstField(String aFirstField) {
		this.aFirstField = aFirstField;
	}
	//</editor-fold>
	
}
