package hadl.m1.RPC;

import hadl.m2.connecteur.Connecteur;

public class RPC extends Connecteur {

	public RPC() {
		super();
		
		this.setGlue(1, "glueAller", 2);
		this.setGlue(3, "glueRetour", 4);
	}

	public void glueAller(String cmd){
		this.notifier("glueAller", cmd);
	}
	
	public void glueRetour(String cmd){
		this.notifier("glueRetour", cmd);
	}
}
