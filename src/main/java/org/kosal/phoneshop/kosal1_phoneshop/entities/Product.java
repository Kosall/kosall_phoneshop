package org.kosal.phoneshop.kosal1_phoneshop.entities;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.DecimalMin;

import lombok.Data;

@Data
@Entity
@Table(name="products",uniqueConstraints = {@UniqueConstraint(columnNames = {"model_id","color_id"})})
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="p_id")
	private Long id;
	@Column(name="p_name", unique = true)
	private String name;
	@Column(name="image_path")
	private String imagePath;
	@Column(name="availbe_unit")
	private Integer availabeUnit;
	@ManyToOne
	@JoinColumn(name="model_id")
	private Model model;
	@ManyToOne
	@JoinColumn(name="color_id")
	private Color color;
	@DecimalMin(value="0.0000001",message = "price must be greater than 0!!")
	@Column(name="sale_price")
	private BigDecimal salePrice;


}