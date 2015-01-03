public abstract class Units{
	int HP, hitboxH, hitboxL;
	abstract void hitdetect();

	public void setHP(int newHP){
		HP = newHP;
	}
	public void sethitboxH(int newH){
		hitboxH = newH;
	}
	public void sethitboxL(int newL){
		hitboxL = newL;
	}
}
