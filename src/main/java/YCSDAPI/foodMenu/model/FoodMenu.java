package YCSDAPI.foodMenu.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="YCSD_FOOD_MENU" , schema="YCSD")
public class FoodMenu {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="MENU_ID")
	private Long menuId;
	
	@Column(name="MENU_NAME")
	private String menuName;
	
	@Column(name="MENU_CNTN")
	private String menuCntn;
	
	@Column(name="MENU_PRICE")
	private int menuPrice;
	
	@OneToMany(mappedBy="foodMenu")
	private List<FoodMenuPhoto> foodMenuPhotos = new ArrayList<FoodMenuPhoto>();
	
	@Column(name="REG_USER", updatable = false)
	private String regUser;
	
	@Column(name="REG_DTTM", updatable = false)
	@CreationTimestamp
	private LocalDateTime regDttm;
	
	@Column(name="UPDT_USER")
	private String updtUser;
	
	@Column(name="UPDT_DTTM")
	@UpdateTimestamp
	private LocalDateTime updtDttm;
	
	
	
}
