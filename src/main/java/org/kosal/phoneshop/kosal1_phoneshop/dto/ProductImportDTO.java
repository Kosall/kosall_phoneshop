package org.kosal.phoneshop.kosal1_phoneshop.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.Data;
@Data
public class ProductImportDTO {
	@NotNull(message = "Product id can not be null!")
	private Long productId;
	@Min(value=1,message = "import unit must be greater than 0")
	private Integer importUnit;
	@DecimalMin(value="0.00001",message = "price must be greater than 0")
	private BigDecimal importPrice;
	//@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private LocalDateTime importDate;

}
