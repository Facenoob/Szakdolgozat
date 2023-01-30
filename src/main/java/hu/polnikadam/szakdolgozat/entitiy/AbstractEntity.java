package hu.polnikadam.szakdolgozat.entitiy;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.io.Serializable;
import java.time.LocalDateTime;
@Getter
@Setter
@MappedSuperclass
public abstract class AbstractEntity implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column
	@CreatedDate
	private LocalDateTime created;
	@Column
	@CreatedBy
	private String createdBy;
	@Column
	@LastModifiedDate
	private LocalDateTime updated;
	@Column
	@LastModifiedBy
	private String updatedBy;
}
