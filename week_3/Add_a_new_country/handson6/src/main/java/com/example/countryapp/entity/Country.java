package com.example.countryapp.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="country")
public class Country {
@Id
@Column(name="co_code")
private String coCode;
@Column(name="co_name")
private String coName;

public String getCoCode() {
	// TODO Auto-generated method stub
	return coCode;
}
}
