package yong.order.model;

import java.util.*;

public class orderDTO {

		private List<ItemDTO> itemdto;
		private MarketDTO marketdto;
		public orderDTO() {
			super();
		}
		public orderDTO(List<ItemDTO> itemdto, MarketDTO marketdto) {
			super();
			this.itemdto = itemdto;
			this.marketdto = marketdto;
		}
		public List<ItemDTO> getItemdto() {
			return itemdto;
		}
		public void setItemdto(List<ItemDTO> itemdto) {
			this.itemdto = itemdto;
		}
		public MarketDTO getMarketdto() {
			return marketdto;
		}
		public void setMarketdto(MarketDTO marketdto) {
			this.marketdto = marketdto;
		}
		
		
		
}
