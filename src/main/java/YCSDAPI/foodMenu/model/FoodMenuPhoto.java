package YCSDAPI.foodMenu.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="YCSD_FOOD_MENU_PHOTO", schema="YCSD")
public class FoodMenuPhoto {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="MENU_PHOTO_ID")
	private Long menuPhotoId;
	
	@ManyToOne
	@JoinColumn(name="menuId", referencedColumnName = "MENU_ID")
	private FoodMenu foodMenu;
	
	@Column(name="MAIN_DVN")
	private String mainDvn;
	@Column(name="ORGN_PHOTO_NAME")
	private String orgnPhotoName;
	@Column(name="CHNG_PHOTO_NAME")
	private String chngPhotoName;
	@Column(name="PHOTO_PATH")
	private String photoPath;
	@Column(name="PHOTO_EXT")
	private String photoExt;
	
	@Column(name="REG_USER")
	private String regUser;
	@Column(name="REG_DTTM")
	private LocalDateTime regDttm;
}
