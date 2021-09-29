
public class Character
	{
		private String name;
		private String sideKick;
		private int favoriteNum;
		private boolean isScared;
		
		
		public String getName()
			{
				return name;
			}


		public void setName(String name)
			{
				this.name = name;
			}



		public String getSideKick()
			{
				return sideKick;
			}


		public void setSideKick(String sideKick)
			{
				this.sideKick = sideKick;
			}


		public int getFavoriteNum()
			{
				return favoriteNum;
			}


		public void setFavoriteNum(int favoriteNum)
			{
				this.favoriteNum = favoriteNum;
			}


		public boolean isScared()
			{
				return isScared;
			}


		public void setScared(boolean isScared)
			{
				this.isScared = isScared;
			}


		public Character(String n, String sK, int fN, boolean s)
		{
			name = n;
			sideKick = sK;
			favoriteNum = fN;
			isScared = s;
		}
	}
