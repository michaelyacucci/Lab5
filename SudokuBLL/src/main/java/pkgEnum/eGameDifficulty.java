package pkgEnum;

import java.util.HashMap;
import java.util.Map;

public enum eGameDifficulty {
	
	EASY(100), MEDIUM(500), HARD(1000);
	
	private final int iDifficulty;
	
	private eGameDifficulty(int difficulty){
		this.iDifficulty = difficulty;
	}
	
	public Integer getiDifficulty() {
		
		return (Integer) iDifficulty;
		
	}
	
	private static final Map<Integer, eGameDifficulty> lookup = new HashMap<Integer, eGameDifficulty>();

    static {
        for (eGameDifficulty e : eGameDifficulty.values()) {
            lookup.put(e.getiDifficulty(), e);
        }
    }

    public static eGameDifficulty get(int difficulty) {
    	if(difficulty<100) {
    		return null;
    	}else if(difficulty<500) {
    		return lookup.get(100);
    	}else if(difficulty<1000) {
    		return lookup.get(500);
    	}else {
    		return lookup.get(1000);
    	}
    }
}

