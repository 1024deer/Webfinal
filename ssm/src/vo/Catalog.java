package vo;

public class Catalog {
		private int firstCatalogId;
		private int secondCatalogId;
		private String catalogValue;
		private String href;
		@Override
		public String toString() {
			return "Catalog [firstCatalogId=" + firstCatalogId
					+ ", secondCatalogId=" + secondCatalogId
					+ ", catalogValue=" + catalogValue + ", href=" + href + "]";
		}
		public int getFirstCatalogId() {
			return firstCatalogId;
		}
		public void setFirstCatalogId(int firstCatalogId) {
			this.firstCatalogId = firstCatalogId;
		}
		public int getSecondCatalogId() {
			return secondCatalogId;
		}
		public void setSecondCatalogId(int secondCatalogId) {
			this.secondCatalogId = secondCatalogId;
		}
		public String getCatalogValue() {
			return catalogValue;
		}
		public void setCatalogValue(String catalogValue) {
			this.catalogValue = catalogValue;
		}
		public String getHref() {
			return href;
		}
		public void setHref(String href) {
			this.href = href;
		}
		public Catalog(int firstCatalogId, int secondCatalogId,
				String catalogValue, String href) {
			super();
			this.firstCatalogId = firstCatalogId;
			this.secondCatalogId = secondCatalogId;
			this.catalogValue = catalogValue;
			this.href = href;
		}
		public Catalog() {
			super();
		}
		
		
}
